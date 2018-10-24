package com.netcracker.gui;

import com.google.common.eventbus.Subscribe;
import com.netcracker.gui.events.SetMatrixSizeEvent;
import com.google.common.eventbus.EventBus;

import javax.swing.*;

public class GUIController {
    private final EventBus eventBus;

    public GUIController(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void start()
    {
        SetImageParametersFrame setImageParametersFrame = new SetImageParametersFrame(eventBus);
        setImageParametersFrame.setVisible(true);
    }

    @Subscribe
    public void setMatrixParameters(SetMatrixSizeEvent event)
    {

    }

}

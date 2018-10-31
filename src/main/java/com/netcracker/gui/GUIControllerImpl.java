package com.netcracker.gui;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.netcracker.gui.events.SetMatrixSizeEvent;
import com.netcracker.model.ImageMatrixModel;
import com.google.common.eventbus.EventBus;

import javax.swing.*;

public class GUIControllerImpl {

    private final EventBus eventBus;
    private final ImageMatrixModel imageMatrixModel;

    @Inject
    public GUIControllerImpl(EventBus eventBus, ImageMatrixModel imageMatrixModel) {
        this.eventBus = eventBus;
        this.imageMatrixModel = imageMatrixModel;
    }

    public void start()
    {
        SetImageParametersFrame setImageParametersFrame = new SetImageParametersFrame(eventBus);
        setImageParametersFrame.setVisible(true);
    }

    @Subscribe
    public void setMatrixParameters(SetMatrixSizeEvent event)
    {
        imageMatrixModel.setColumnCount(event.getColumnCount());
        imageMatrixModel.setRowCount(event.getRowCount());
    }

}

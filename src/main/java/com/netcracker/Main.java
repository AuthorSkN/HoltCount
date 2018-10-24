package com.netcracker;


import com.google.common.eventbus.EventBus;
import com.netcracker.gui.*;

public class Main {



    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GUIController controller = new GUIController(eventBus);
        eventBus.register(controller);
        controller.start();
    }
}

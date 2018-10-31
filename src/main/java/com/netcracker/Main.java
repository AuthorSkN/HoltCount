package com.netcracker;


import com.google.common.eventbus.EventBus;
import com.netcracker.gui.*;
import com.google.inject.*;

public class Main {



    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Injector injector = Guice.createInjector(new HoltCountModule(eventBus));
        GUIController controller = injector.getInstance(GUIController.class);
        eventBus.register(controller);
        controller.start();
    }
}

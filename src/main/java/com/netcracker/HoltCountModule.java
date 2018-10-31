package com.netcracker;

import com.google.inject.AbstractModule;
import com.netcracker.model.ImageMatrixModel;
import com.netcracker.model.ImageMatrixModelImpl;
import com.google.common.eventbus.EventBus;

import java.awt.*;

public class HoltCountModule extends AbstractModule {

    private final EventBus eventBus;

    public HoltCountModule(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    protected void configure() {
        bind(ImageMatrixModel.class).to(ImageMatrixModelImpl.class);
        bind(EventBus.class).toInstance(eventBus);
    }
}

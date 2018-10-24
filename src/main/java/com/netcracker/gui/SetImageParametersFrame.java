package com.netcracker.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.google.common.eventbus.EventBus;
import com.netcracker.gui.events.*;


public class SetImageParametersFrame extends JFrame {

    private final EventBus eventbus;
    private final TextField countRowTextField;
    private final TextField countColumnTextField;

    public SetImageParametersFrame(EventBus eventbus)
    {
        this.eventbus = eventbus;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Box boxLayout = new Box(BoxLayout.Y_AXIS);
        countRowTextField = new TextField();
        countColumnTextField = new TextField();
        boxLayout.add(countRowTextField);
        boxLayout.add(countColumnTextField);
        Button okButton = new Button("OK");
        okButton.addActionListener(new SetSizeActionListener());
        boxLayout.add(okButton);
        setContentPane(boxLayout);
        setSize(300, 100);
    }

    private class SetSizeActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            eventbus.post(new SetMatrixSizeEvent(
                    Integer.parseInt(countRowTextField.getText()),
                    Integer.parseInt(countColumnTextField.getText())
            ));
        }
    }


}

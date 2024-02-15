package com.akeir.scene.control;

import javafx.scene.control.Button;

public class ButtonImpl extends Button {

    public ButtonImpl()
    {
        super();
        this.setText("I AM BUTTON");
        this.setStyle("-fx-background-color: #383838; -fx-text-fill: White;");
        this.setPrefWidth(186.0);
        this.setPrefHeight(25.0);
    }
}

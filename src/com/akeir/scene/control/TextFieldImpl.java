package com.akeir.scene.control;

import javafx.scene.control.TextField;

public class TextFieldImpl extends TextField {

    public TextFieldImpl()
    {
        super();
        this.setPromptText("I AM PROMPT");
        this.setStyle("-fx-background-color: gray; -fx-text-fill: white;");
        this.setPrefWidth(250.0);
        this.setPrefHeight(30.0);
    }
}

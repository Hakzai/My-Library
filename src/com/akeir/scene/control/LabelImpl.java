package com.akeir.scene.control;

import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class LabelImpl extends Label {
    
    public LabelImpl()
    {
        super();
        this.setText("I AM LABEL");
        this.setStyle("-fx-text-fill: white; -fx-font-size: 14px ");
        this.setPrefWidth(100.0);
        this.setPrefHeight(30.0);
        this.setAlignment(Pos.CENTER_LEFT);
    }
}

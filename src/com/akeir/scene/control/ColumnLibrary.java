package com.akeir.scene.control;

import javafx.scene.control.TableColumn;

@SuppressWarnings("rawtypes")
public class ColumnLibrary extends TableColumn {

    public ColumnLibrary(String name)
    {
        super(name);
        this.setStyle("-fx-background-color: gray; -fx-text-fill: white; ");
    }
}

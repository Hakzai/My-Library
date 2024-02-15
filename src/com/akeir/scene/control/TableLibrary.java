package com.akeir.scene.control;

import com.akeir.scene.control.ColumnLibrary;
import javafx.scene.control.TableView;

@SuppressWarnings("rawtypes")
public class TableLibrary<Book> extends TableView {

    @SuppressWarnings("unchecked")
    public TableLibrary()
    {
        super();

        this.setStyle("-fx-background-color: #282828; -fx-text-fill: white;");
        this.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getColumns().add(new ColumnLibrary("ID"));
        this.getColumns().add(new ColumnLibrary("Title"));
        this.getColumns().add(new ColumnLibrary("Author"));
        this.getColumns().add(new ColumnLibrary("Genre"));
        this.getColumns().add(new ColumnLibrary("Publisher"));
        this.getColumns().add(new ColumnLibrary("Year"));
        this.getColumns().add(new ColumnLibrary("Edition"));
        this.getColumns().add(new ColumnLibrary("Pages"));
        this.getColumns().add(new ColumnLibrary("ISBN"));
        this.getColumns().add(new ColumnLibrary("Language"));
        this.getColumns().add(new ColumnLibrary("Status"));
    }
}

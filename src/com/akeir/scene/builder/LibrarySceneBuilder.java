package com.akeir.scene.builder;

import com.akeir.base.BuilderBase;
import com.akeir.model.Book;
import com.akeir.scene.LibraryScene;
import com.akeir.scene.control.ButtonImpl;
import com.akeir.scene.control.LabelImpl;
import com.akeir.scene.control.TableLibrary;
import com.akeir.scene.control.TextFieldImpl;
import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;

public class LibrarySceneBuilder extends BuilderBase {

    private LibraryScene libraryScene;

    public LibrarySceneBuilder(AnchorPane pane)
    {
        if(pane instanceof LibraryScene)
        {
            libraryScene = (LibraryScene) pane;
        }
    }

    @Override
    public void doBuild()
    {
        super.doBuild();

        libraryScene.setId("libraryScene");

        libraryScene.getLbSceneTitle().setId("lbSceneTitle");
        libraryScene.getLbSceneTitle().setText("My Library");
        libraryScene.getLbSceneTitle().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 20px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial; " +
                "-fx-border-color: white; " +
                "-fx-border-width: 0px 0px 2px 0px; " +
                "-fx-border-style: solid;");
        libraryScene.getLbSceneTitle().setLayoutX(0.0);
        libraryScene.getLbSceneTitle().setLayoutY(14.0);
        libraryScene.getLbSceneTitle().setPrefWidth(1280.0);
        libraryScene.getLbSceneTitle().setAlignment(Pos.CENTER);
        libraryScene.getChildren().add(libraryScene.getLbSceneTitle());

        libraryScene.getTbBooks().setId("tbBooks");
        libraryScene.getTbBooks().setLayoutX(14.0);
        libraryScene.getTbBooks().setLayoutY(80.0);
        libraryScene.getTbBooks().setPrefWidth(1252.0);
        libraryScene.getTbBooks().setPrefHeight(500.0);
        libraryScene.getChildren().add(libraryScene.getTbBooks());

        libraryScene.getLbFilterBy().setId("lbFilterBy");
        libraryScene.getLbFilterBy().setText("Filter by:");
        libraryScene.getLbFilterBy().setStyle("-fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; ");
        libraryScene.getLbFilterBy().setLayoutX(14.0);
        libraryScene.getLbFilterBy().setLayoutY(590.0);
        libraryScene.getChildren().add(libraryScene.getLbFilterBy());

        libraryScene.getLbTitle().setId("lbTitle");
        libraryScene.getLbTitle().setText("Title:");
        libraryScene.getLbTitle().setLayoutX(14.0);
        libraryScene.getLbTitle().setLayoutY(626.0);
        libraryScene.getChildren().add(libraryScene.getLbTitle());

        libraryScene.getTxtTitle().setId("txtTitle");
        libraryScene.getTxtTitle().setPromptText("Search by title");
        libraryScene.getTxtTitle().setLayoutX(50.0);
        libraryScene.getTxtTitle().setLayoutY(626.0);
        libraryScene.getTxtTitle().setPrefWidth(200.0);
        libraryScene.getChildren().add(libraryScene.getTxtTitle());

        libraryScene.getLbAuthor().setId("lbAuthor");
        libraryScene.getLbAuthor().setText("Author:");
        libraryScene.getLbAuthor().setLayoutX(264.0);
        libraryScene.getLbAuthor().setLayoutY(626.0);
        libraryScene.getChildren().add(libraryScene.getLbAuthor());

        libraryScene.getTxtAuthor().setId("txtAuthor");
        libraryScene.getTxtAuthor().setPromptText("Search by author");
        libraryScene.getTxtAuthor().setLayoutX(316.0);
        libraryScene.getTxtAuthor().setLayoutY(626.0);
        libraryScene.getTxtAuthor().setPrefWidth(200.0);
        libraryScene.getChildren().add(libraryScene.getTxtAuthor());

        libraryScene.getLbGenre().setId("lbGenre");
        libraryScene.getLbGenre().setText("Genre:");
        libraryScene.getLbGenre().setLayoutX(530.0);
        libraryScene.getLbGenre().setLayoutY(626.0);
        libraryScene.getChildren().add(libraryScene.getLbGenre());

        libraryScene.getTxtGenre().setId("txtGenre");
        libraryScene.getTxtGenre().setPromptText("Search by genre");
        libraryScene.getTxtGenre().setLayoutX(577.0);
        libraryScene.getTxtGenre().setLayoutY(626.0);
        libraryScene.getTxtGenre().setPrefWidth(200.0);
        libraryScene.getChildren().add(libraryScene.getTxtGenre());

        libraryScene.getLbPublisher().setId("lbPublisher");
        libraryScene.getLbPublisher().setText("Publisher:");
        libraryScene.getLbPublisher().setLayoutX(791.0);
        libraryScene.getLbPublisher().setLayoutY(626.0);
        libraryScene.getChildren().add(libraryScene.getLbPublisher());

        libraryScene.getTxtPublisher().setId("txtPublisher");
        libraryScene.getTxtPublisher().setPromptText("Search by publisher");
        libraryScene.getTxtPublisher().setLayoutX(858.0);
        libraryScene.getTxtPublisher().setLayoutY(626.0);
        libraryScene.getTxtPublisher().setPrefWidth(200.0);
        libraryScene.getChildren().add(libraryScene.getTxtPublisher());

        libraryScene.getBtnClearFilters().setId("btnClearsFilters");
        libraryScene.getBtnClearFilters().setText("Clear Filters");
        libraryScene.getBtnClearFilters().setLayoutX(1080.0);
        libraryScene.getBtnClearFilters().setLayoutY(626.0);
        libraryScene.getBtnClearFilters().setPrefHeight(30.0);
        libraryScene.getChildren().add(libraryScene.getBtnClearFilters());

        libraryScene.getBtnRegister().setId("btnRegister");
        libraryScene.getBtnRegister().setText("Register");
        libraryScene.getBtnRegister().setLayoutX(14.0);
        libraryScene.getBtnRegister().setLayoutY(681.0);
        libraryScene.getChildren().add(libraryScene.getBtnRegister());

        libraryScene.getBtnEdit().setId("btnEdit");
        libraryScene.getBtnEdit().setText("Edit");
        libraryScene.getBtnEdit().setLayoutX(214.0);
        libraryScene.getBtnEdit().setLayoutY(681.0);
        libraryScene.getChildren().add(libraryScene.getBtnEdit());

        libraryScene.getBtnDelete().setId("btnDelete");
        libraryScene.getBtnDelete().setText("Delete");
        libraryScene.getBtnDelete().setLayoutX(1080.0);
        libraryScene.getBtnDelete().setLayoutY(681.0);
        libraryScene.getChildren().add(libraryScene.getBtnDelete());
    }

    @Override
    protected void createInstanceForElements()
    {
        libraryScene.setLbSceneTitle(new LabelImpl());
        libraryScene.setTbBooks(new TableLibrary<Book>());
        libraryScene.setLbFilterBy(new LabelImpl());
        libraryScene.setLbTitle(new LabelImpl());
        libraryScene.setTxtTitle(new TextFieldImpl());
        libraryScene.setLbAuthor(new LabelImpl());
        libraryScene.setTxtAuthor(new TextFieldImpl());
        libraryScene.setLbGenre(new LabelImpl());
        libraryScene.setTxtGenre(new TextFieldImpl());
        libraryScene.setLbPublisher(new LabelImpl());
        libraryScene.setTxtPublisher(new TextFieldImpl());
        libraryScene.setBtnClearFilters(new ButtonImpl());
        libraryScene.setBtnRegister(new ButtonImpl());
        libraryScene.setBtnEdit(new ButtonImpl());
        libraryScene.setBtnDelete(new ButtonImpl());
    }
}

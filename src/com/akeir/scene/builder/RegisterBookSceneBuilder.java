package com.akeir.scene.builder;

import com.akeir.base.BuilderBase;
import com.akeir.scene.RegisterBookScene;
import com.akeir.scene.control.ButtonImpl;
import com.akeir.scene.control.LabelImpl;
import com.akeir.scene.control.TextFieldImpl;
import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;

public class RegisterBookSceneBuilder extends BuilderBase {

    RegisterBookScene registerBookScene;

    public RegisterBookSceneBuilder(AnchorPane registerBookScene)
    {
        if(registerBookScene instanceof RegisterBookScene)
        {
            this.registerBookScene = (RegisterBookScene) registerBookScene;
        }
    }

    @Override
    public void doBuild()
    {
        super.doBuild();

        registerBookScene.setId("registerBookScene");
        registerBookScene.setPrefWidth(600.0);
        registerBookScene.setPrefHeight(634.0);

        registerBookScene.getLbSceneTitle().setId("lbSceneTitle");
        registerBookScene.getLbSceneTitle().setText("Register Book");
        registerBookScene.getLbSceneTitle().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 20px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial; " +
                "-fx-border-color: white; " +
                "-fx-border-width: 0px 0px 2px 0px; " +
                "-fx-border-style: solid;");
        registerBookScene.getLbSceneTitle().setLayoutX(0.0);
        registerBookScene.getLbSceneTitle().setLayoutY(14.0);
        registerBookScene.getLbSceneTitle().setPrefWidth(600.0);
        registerBookScene.getLbSceneTitle().setAlignment(Pos.CENTER);
        registerBookScene.getChildren().add(registerBookScene.getLbSceneTitle());

        registerBookScene.getLbTitle().setId("lbTitle");
        registerBookScene.getLbTitle().setText("Title:");
        registerBookScene.getLbTitle().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getLbTitle().setLayoutX(50.0);
        registerBookScene.getLbTitle().setLayoutY(70.0);
        registerBookScene.getLbTitle().setPrefWidth(100.0);
        registerBookScene.getChildren().add(registerBookScene.getLbTitle());

        registerBookScene.getTxtTitle().setId("txtTitle");
        registerBookScene.getTxtTitle().setPromptText("Enter the book title");
        registerBookScene.getTxtTitle().setLayoutX(150.0);
        registerBookScene.getTxtTitle().setLayoutY(70.0);
        registerBookScene.getTxtTitle().setPrefWidth(400.0);
        registerBookScene.getChildren().add(registerBookScene.getTxtTitle());

        registerBookScene.getLbAuthor().setId("lbAuthor");
        registerBookScene.getLbAuthor().setText("Author:");
        registerBookScene.getLbAuthor().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getLbAuthor().setLayoutX(50.0);
        registerBookScene.getLbAuthor().setLayoutY(120.0);
        registerBookScene.getLbAuthor().setPrefWidth(100.0);
        registerBookScene.getChildren().add(registerBookScene.getLbAuthor());

        registerBookScene.getTxtAuthor().setId("txtAuthor");
        registerBookScene.getTxtAuthor().setPromptText("Enter the book author");
        registerBookScene.getTxtAuthor().setLayoutX(150.0);
        registerBookScene.getTxtAuthor().setLayoutY(120.0);
        registerBookScene.getTxtAuthor().setPrefWidth(400.0);
        registerBookScene.getChildren().add(registerBookScene.getTxtAuthor());

        registerBookScene.getLbGenre().setId("lbGenre");
        registerBookScene.getLbGenre().setText("Genre:");
        registerBookScene.getLbGenre().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getLbGenre().setLayoutX(50.0);
        registerBookScene.getLbGenre().setLayoutY(170.0);
        registerBookScene.getLbGenre().setPrefWidth(100.0);
        registerBookScene.getChildren().add(registerBookScene.getLbGenre());

        registerBookScene.getTxtGenre().setId("txtGenre");
        registerBookScene.getTxtGenre().setPromptText("Enter the book genre");
        registerBookScene.getTxtGenre().setLayoutX(150.0);
        registerBookScene.getTxtGenre().setLayoutY(170.0);
        registerBookScene.getTxtGenre().setPrefWidth(400.0);
        registerBookScene.getChildren().add(registerBookScene.getTxtGenre());

        registerBookScene.getLbPublisher().setId("lbPublisher");
        registerBookScene.getLbPublisher().setText("Publisher:");
        registerBookScene.getLbPublisher().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getLbPublisher().setLayoutX(50.0);
        registerBookScene.getLbPublisher().setLayoutY(220.0);
        registerBookScene.getLbPublisher().setPrefWidth(100.0);
        registerBookScene.getChildren().add(registerBookScene.getLbPublisher());

        registerBookScene.getTxtPublisher().setId("txtPublisher");
        registerBookScene.getTxtPublisher().setPromptText("Enter the book publisher");
        registerBookScene.getTxtPublisher().setLayoutX(150.0);
        registerBookScene.getTxtPublisher().setLayoutY(220.0);
        registerBookScene.getTxtPublisher().setPrefWidth(400.0);
        registerBookScene.getChildren().add(registerBookScene.getTxtPublisher());

        registerBookScene.getLbYear().setId("lbYear");
        registerBookScene.getLbYear().setText("Year:");
        registerBookScene.getLbYear().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getLbYear().setLayoutX(50.0);
        registerBookScene.getLbYear().setLayoutY(270.0);
        registerBookScene.getLbYear().setPrefWidth(100.0);
        registerBookScene.getChildren().add(registerBookScene.getLbYear());

        registerBookScene.getTxtYear().setId("txtYear");
        registerBookScene.getTxtYear().setPromptText("Enter the book year");
        registerBookScene.getTxtYear().setLayoutX(150.0);
        registerBookScene.getTxtYear().setLayoutY(270.0);
        registerBookScene.getTxtYear().setPrefWidth(400.0);
        registerBookScene.getChildren().add(registerBookScene.getTxtYear());

        registerBookScene.getLbEdition().setId("lbEdition");
        registerBookScene.getLbEdition().setText("Edition:");
        registerBookScene.getLbEdition().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getLbEdition().setLayoutX(50.0);
        registerBookScene.getLbEdition().setLayoutY(320.0);
        registerBookScene.getLbEdition().setPrefWidth(100.0);
        registerBookScene.getChildren().add(registerBookScene.getLbEdition());

        registerBookScene.getTxtEdition().setId("txtEdition");
        registerBookScene.getTxtEdition().setPromptText("Enter the book edition");
        registerBookScene.getTxtEdition().setLayoutX(150.0);
        registerBookScene.getTxtEdition().setLayoutY(320.0);
        registerBookScene.getTxtEdition().setPrefWidth(400.0);
        registerBookScene.getChildren().add(registerBookScene.getTxtEdition());

        registerBookScene.getLbPages().setId("lbPages");
        registerBookScene.getLbPages().setText("Pages:");
        registerBookScene.getLbPages().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getLbPages().setLayoutX(50.0);
        registerBookScene.getLbPages().setLayoutY(370.0);
        registerBookScene.getLbPages().setPrefWidth(100.0);
        registerBookScene.getChildren().add(registerBookScene.getLbPages());

        registerBookScene.getTxtPages().setId("txtPages");
        registerBookScene.getTxtPages().setPromptText("Enter the book pages");
        registerBookScene.getTxtPages().setLayoutX(150.0);
        registerBookScene.getTxtPages().setLayoutY(370.0);
        registerBookScene.getTxtPages().setPrefWidth(400.0);
        registerBookScene.getChildren().add(registerBookScene.getTxtPages());

        registerBookScene.getLbIsbn().setId("lbIsbn");
        registerBookScene.getLbIsbn().setText("ISBN:");
        registerBookScene.getLbIsbn().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getLbIsbn().setLayoutX(50.0);
        registerBookScene.getLbIsbn().setLayoutY(420.0);
        registerBookScene.getLbIsbn().setPrefWidth(100.0);
        registerBookScene.getChildren().add(registerBookScene.getLbIsbn());

        registerBookScene.getTxtIsbn().setId("txtIsbn");
        registerBookScene.getTxtIsbn().setPromptText("Enter the book ISBN");
        registerBookScene.getTxtIsbn().setLayoutX(150.0);
        registerBookScene.getTxtIsbn().setLayoutY(420.0);
        registerBookScene.getTxtIsbn().setPrefWidth(400.0);
        registerBookScene.getChildren().add(registerBookScene.getTxtIsbn());

        registerBookScene.getLbLanguage().setId("lbLanguage");
        registerBookScene.getLbLanguage().setText("Language:");
        registerBookScene.getLbLanguage().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getLbLanguage().setLayoutX(50.0);
        registerBookScene.getLbLanguage().setLayoutY(470.0);
        registerBookScene.getLbLanguage().setPrefWidth(100.0);
        registerBookScene.getChildren().add(registerBookScene.getLbLanguage());

        registerBookScene.getTxtLanguage().setId("txtLanguage");
        registerBookScene.getTxtLanguage().setPromptText("Enter the book language");
        registerBookScene.getTxtLanguage().setLayoutX(150.0);
        registerBookScene.getTxtLanguage().setLayoutY(470.0);
        registerBookScene.getTxtLanguage().setPrefWidth(400.0);
        registerBookScene.getChildren().add(registerBookScene.getTxtLanguage());

        registerBookScene.getLbStatus().setId("lbStatus");
        registerBookScene.getLbStatus().setText("Status:");
        registerBookScene.getLbStatus().setStyle("-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getLbStatus().setLayoutX(50.0);
        registerBookScene.getLbStatus().setLayoutY(520.0);
        registerBookScene.getLbStatus().setPrefWidth(100.0);
        registerBookScene.getChildren().add(registerBookScene.getLbStatus());

        registerBookScene.getTxtStatus().setId("txtStatus");
        registerBookScene.getTxtStatus().setPromptText("Enter the book status");
        registerBookScene.getTxtStatus().setLayoutX(150.0);
        registerBookScene.getTxtStatus().setLayoutY(520.0);
        registerBookScene.getTxtStatus().setPrefWidth(400.0);
        registerBookScene.getChildren().add(registerBookScene.getTxtStatus());

        registerBookScene.getBtnSave().setId("btnSave");
        registerBookScene.getBtnSave().setText("Save");
        registerBookScene.getBtnSave().setLayoutX(250.0);
        registerBookScene.getBtnSave().setLayoutY(570.0);
        registerBookScene.getBtnSave().setPrefWidth(100.0);
        registerBookScene.getBtnSave().setPrefHeight(40.0);
        registerBookScene.getBtnSave().setStyle("-fx-background-color: #4CAF50; " +
                "-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getChildren().add(registerBookScene.getBtnSave());

        registerBookScene.getBtnClear().setId("btnClear");
        registerBookScene.getBtnClear().setText("Clear");
        registerBookScene.getBtnClear().setLayoutX(400.0);
        registerBookScene.getBtnClear().setLayoutY(570.0);
        registerBookScene.getBtnClear().setPrefWidth(100.0);
        registerBookScene.getBtnClear().setPrefHeight(40.0);
        registerBookScene.getBtnClear().setStyle("-fx-background-color: #f44336; " +
                "-fx-text-fill: white; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;" +
                "-fx-font-family: Arial;");
        registerBookScene.getChildren().add(registerBookScene.getBtnClear());
    }

    @Override
    protected void createInstanceForElements()
    {
        registerBookScene.setLbSceneTitle(new LabelImpl());
        registerBookScene.setLbTitle(new LabelImpl());
        registerBookScene.setTxtTitle(new TextFieldImpl());
        registerBookScene.setLbAuthor(new LabelImpl());
        registerBookScene.setTxtAuthor(new TextFieldImpl());
        registerBookScene.setLbGenre(new LabelImpl());
        registerBookScene.setTxtGenre(new TextFieldImpl());
        registerBookScene.setLbPublisher(new LabelImpl());
        registerBookScene.setTxtPublisher(new TextFieldImpl());
        registerBookScene.setLbYear(new LabelImpl());
        registerBookScene.setTxtYear(new TextFieldImpl());
        registerBookScene.setLbEdition(new LabelImpl());
        registerBookScene.setTxtEdition(new TextFieldImpl());
        registerBookScene.setLbPages(new LabelImpl());
        registerBookScene.setTxtPages(new TextFieldImpl());
        registerBookScene.setLbIsbn(new LabelImpl());
        registerBookScene.setTxtIsbn(new TextFieldImpl());
        registerBookScene.setLbLanguage(new LabelImpl());
        registerBookScene.setTxtLanguage(new TextFieldImpl());
        registerBookScene.setLbStatus(new LabelImpl());
        registerBookScene.setTxtStatus(new TextFieldImpl());
        registerBookScene.setBtnSave(new ButtonImpl());
        registerBookScene.setBtnClear(new ButtonImpl());
    }
}

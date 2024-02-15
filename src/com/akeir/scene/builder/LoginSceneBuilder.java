package com.akeir.scene.builder;

import com.akeir.base.BuilderBase;
import com.akeir.scene.LoginScene;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginSceneBuilder extends BuilderBase{

	private LoginScene loginScene;
	
	public LoginSceneBuilder(AnchorPane loginScene)
	{
		if(loginScene instanceof LoginScene)
		{
			this.loginScene = (LoginScene) loginScene;
		}
	}
	
	@Override
	public void doBuild() 
	{
		super.doBuild();

		loginScene.setId("loginScene");
		loginScene.setPrefWidth(300.0);
		loginScene.setPrefHeight(400.0);

		loginScene.getLbLoginMenu().setId("lbLoginMenu");
		loginScene.getLbLoginMenu().setText("My Library");
		loginScene.getLbLoginMenu().setStyle("-fx-text-fill: White; " +
				"-fx-font-size: 20px; " +
				"-fx-font-weight: bold; " +
				"-fx-font-family: Arial; " +
				"-fx-border-color: white; " +
				"-fx-border-width: 0px 0px 2px 0px; " +
				"-fx-border-style: solid;");
		loginScene.getLbLoginMenu().setLayoutX(0.0);
		loginScene.getLbLoginMenu().setLayoutY(28.0);
		loginScene.getLbLoginMenu().setPrefWidth(300.0);
		loginScene.getLbLoginMenu().setPrefHeight(30.0);
		loginScene.getLbLoginMenu().setAlignment(Pos.CENTER);
		loginScene.getChildren().add(loginScene.getLbLoginMenu());

		loginScene.getLbUser().setId("lbUser");
		loginScene.getLbUser().setText("Username: ");
		loginScene.getLbUser().setStyle("-fx-text-fill: White;");
		loginScene.getLbUser().setLayoutX(28.0);
		loginScene.getLbUser().setLayoutY(108.0);
		loginScene.getLbUser().setPrefWidth(100.0);
		loginScene.getLbUser().setPrefHeight(30.0);
		loginScene.getLbUser().setAlignment(Pos.CENTER_LEFT);
		loginScene.getChildren().add(loginScene.getLbUser());

		loginScene.getTxtLogin().setId("txtLogin");
		loginScene.getTxtLogin().setPromptText("Enter Username");
		loginScene.getTxtLogin().setStyle("-fx-background-color: gray;");
		loginScene.getTxtLogin().setLayoutX(28.0);
		loginScene.getTxtLogin().setLayoutY(138.0);
		loginScene.getTxtLogin().setPrefWidth(250.0);
		loginScene.getTxtLogin().setPrefHeight(30.0);
		loginScene.getChildren().add(loginScene.getTxtLogin());

		loginScene.getLbPassword().setId("lbPassword");
		loginScene.getLbPassword().setText("Password: ");
		loginScene.getLbPassword().setStyle("-fx-text-fill: White;");
		loginScene.getLbPassword().setLayoutX(28.0);
		loginScene.getLbPassword().setLayoutY(178.0);
		loginScene.getLbPassword().setPrefWidth(100.0);
		loginScene.getLbPassword().setPrefHeight(30.0);
		loginScene.getLbPassword().setAlignment(Pos.CENTER_LEFT);
		loginScene.getChildren().add(loginScene.getLbPassword());

		loginScene.getTxtPassword().setId("txtPassword");
		loginScene.getTxtPassword().setPromptText("Enter Password");
		loginScene.getTxtPassword().setStyle("-fx-background-color: gray;");
		loginScene.getTxtPassword().setLayoutX(28.0);
		loginScene.getTxtPassword().setLayoutY(208.0);
		loginScene.getTxtPassword().setPrefWidth(250.0);
		loginScene.getTxtPassword().setPrefHeight(30.0);
		loginScene.getChildren().add(loginScene.getTxtPassword());

		loginScene.getBtnLogin().setId("btnLogin");
		loginScene.getBtnLogin().setText("Login");
		loginScene.getBtnLogin().setStyle("-fx-background-color: #282828; -fx-text-fill: White;");
		loginScene.getBtnLogin().setLayoutX(28.0);
		loginScene.getBtnLogin().setLayoutY(302.0);
		loginScene.getBtnLogin().setPrefWidth(250.0);
		loginScene.getBtnLogin().setPrefHeight(30.0);
		loginScene.getChildren().add(loginScene.getBtnLogin());

		loginScene.getBtnExit().setId("btnExit");
		loginScene.getBtnExit().setText("Exit");
		loginScene.getBtnExit().setStyle("-fx-background-color: #282828; -fx-text-fill: White;");
		loginScene.getBtnExit().setLayoutX(28.0);
		loginScene.getBtnExit().setLayoutY(342.0);
		loginScene.getBtnExit().setPrefWidth(250.0);
		loginScene.getBtnExit().setPrefHeight(30.0);
		loginScene.getChildren().add(loginScene.getBtnExit());
	}

	@Override
	protected void createInstanceForElements() 
	{
		loginScene.setLbLoginMenu(new Label());
		loginScene.setLbUser(new Label());
		loginScene.setTxtLogin(new TextField());
		loginScene.setLbPassword(new Label());
		loginScene.setTxtPassword(new PasswordField());
		loginScene.setBtnLogin(new Button());
		loginScene.setBtnExit(new Button());
	}
}

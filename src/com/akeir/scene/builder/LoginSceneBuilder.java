package com.akeir.scene.builder;

import com.akeir.base.BuilderBase;
import com.akeir.scene.LoginScene;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginSceneBuilder extends BuilderBase{

	private LoginScene scene;
	
	public LoginSceneBuilder(AnchorPane loginScene)
	{
		if(loginScene instanceof LoginScene)
		{
			scene = (LoginScene) loginScene;
		}
	}
	
	@Override
	public void doBuild() 
	{
		super.doBuild();
		
		scene.setPrefWidth(300.0);
		scene.setPrefHeight(400.0);
		scene.setStyle("-fx-background-color: #282828;"); // THIS IS DARK GRAY COLOR
		
		scene.getLbUser().setId("lbUser");
		scene.getLbUser().setText("Username: ");
		scene.getLbUser().setStyle("-fx-text-fill: White;");
		scene.getLbUser().setLayoutX(28.0);
		scene.getLbUser().setLayoutY(28.0);
		scene.getLbUser().setPrefWidth(100.0);
		scene.getLbUser().setPrefHeight(30.0);
		scene.getLbUser().setAlignment(Pos.CENTER_LEFT);
		scene.getChildren().add(scene.getLbUser());
		
	}

	@Override
	protected void createInstanceForElements() 
	{
		scene.setLbLoginMenu(new Label());
		scene.setLbUser(new Label());
		scene.setTxtLogin(new TextField());
		scene.setLbPassword(new Label());
		scene.setTxtPassword(new TextField());
		scene.setBtnLogin(new Button());
		scene.setBtnExit(new Button());
	}
	

}

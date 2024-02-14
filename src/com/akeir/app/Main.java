package com.akeir.app;

import com.akeir.scene.LoginScene;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage stage) throws Exception
	{
		boolean isLoggedIn = true;
		
		Parent root = new LoginScene();
		Scene scene = new Scene(root);
		stage.setResizable(false);
		stage.setTitle("My Library Login");
		stage.setScene(scene);
		stage.show();
		
		if(isLoggedIn)
		{
//			stage.setTitle("My Library -- by Akeir");
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}

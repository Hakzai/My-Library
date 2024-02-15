package com.akeir.base;

import javafx.scene.layout.AnchorPane;

public abstract class SceneBase extends AnchorPane{

	protected BuilderBase builder;

	protected SceneBase()
	{
		super();
		this.setStyle("-fx-background-color: #181818;"); // THIS IS DARK GRAY COLOR
		this.setPrefWidth(1280.0);
		this.setPrefHeight(720.0);
	}

	protected void executeBuild()
	{
		if(null != builder)
		{
			builder.doBuild();
		}
	}
	
	protected abstract void setElementsAction();
}

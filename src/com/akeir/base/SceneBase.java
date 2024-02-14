package com.akeir.base;

import javafx.scene.layout.AnchorPane;

public abstract class SceneBase extends AnchorPane{

	protected BuilderBase builder;

	protected void executeBuild()
	{
		if(null != builder)
		{
			builder.doBuild();
		}
	}
	
	protected abstract void setElementsAction();
}

package com.akeir.base;

public abstract class BuilderBase {
	
	public void doBuild()
	{
		createInstanceForElements();
	}
	
	protected abstract void createInstanceForElements();

}

package com.akeir.scene;

import com.akeir.base.SceneBase;
import com.akeir.scene.builder.LoginSceneBuilder;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginScene extends SceneBase{

	private Label lbLoginMenu;
	private Label lbUser;
	private TextField txtUser;
	private Label lbPassword;
	private PasswordField txtPassword;
	private Button btnLogin;
	private Button btnExit;
	
	public LoginScene()
	{
		super();
		builder = new LoginSceneBuilder(this);
		executeBuild();
	}
	
	@Override
	protected void setElementsAction()
	{
		// TODO Auto-generated method stub
		
	}

	public Label getLbLoginMenu() 
	{
		return lbLoginMenu;
	}

	public void setLbLoginMenu(Label lbLoginMenu) 
	{
		this.lbLoginMenu = lbLoginMenu;
	}

	public Label getLbUser() 
	{
		return lbUser;
	}
	
	public void setLbUser(Label lbUser) 
	{
		this.lbUser = lbUser;
	}

	public TextField getTxtLogin() 
	{
		return txtUser;
	}

	public void setTxtLogin(TextField txtLogin) 
	{
		this.txtUser = txtLogin;
	}

	public Label getLbPassword() 
	{
		return lbPassword;
	}

	public void setLbPassword(Label lbPassword) 
	{
		this.lbPassword = lbPassword;
	}

	public PasswordField getTxtPassword()
	{
		return txtPassword;
	}

	public void setTxtPassword(PasswordField txtPassword)
	{
		this.txtPassword = txtPassword;
	}

	public Button getBtnLogin()
	{
		return btnLogin;
	}

	public void setBtnLogin(Button btnLogin) 
	{
		this.btnLogin = btnLogin;
	}

	public Button getBtnExit() 
	{
		return btnExit;
	}

	public void setBtnExit(Button btnExit) 
	{
		this.btnExit = btnExit;
	}
}

package com.facebook.stepDefinations;

import com.facebook.pageObjects.LoginPageObject;

public class LoginStepDefinations extends LoginPageObject{
	LoginPageObject lpo = new LoginPageObject();
	public void I_am_user_of_facbook_application()
	{
		lpo.openURL();
	}
	public void I_enter_valid_username()
	{
		lpo.enterUsername();
	}
	public void I_enter_valid_password()
	{
		lpo.enterPassword();
	}
	public void I_click_on_login_button()
	{
		lpo.ClickOnLogin();
	}
	public void 
	
	
}

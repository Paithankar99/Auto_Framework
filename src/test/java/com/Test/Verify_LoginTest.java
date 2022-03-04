package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;

public class Verify_LoginTest extends BaseClass{
	@Test
	public void verify_loginwithValidCredentials() {
		LoginPom Login=PageFactory.initElements(driver, LoginPom.class);
		Login.getEmailid().sendKeys(excel.getStringData("Login", 0, 0));
		Login.getPassword().sendKeys(excel.getStringData("Login", 0, 1));
		Login.getLoginbtn().click();
	
	//Library.custom_Sendkeys(Login.getEmailid(),excel.getStringData("Login", 0, 0), "EmailId");
	//Library.custom_Sendkeys(Login.getPassword(), excel.getStringData("Login", 0, 1), "Password");	
	//Library.custom_Click(Login.getLoginbtn(), "Loginbtn");
	
	//Library.custom_handle_dropDown(Login.getEmailid(), "Textvalue", "EmailId");
	}
	}



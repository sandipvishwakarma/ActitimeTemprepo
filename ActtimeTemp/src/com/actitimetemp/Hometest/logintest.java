package com.actitimetemp.Hometest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitimetemp.genericlib.baseClass;
import com.actitimetemp.genericlib.Flib;
import com.actitimetemp.objectrepository.login_page;
@Listeners(com.actitimetemp.genericlib.ListnerImp.class)
public class logintest extends baseClass{
	
	@Test
	public void verifylogintest() throws Throwable
	{
		Flib fobj=new Flib();
		//Properties pobj=new Properties();
		login_page lp = PageFactory.initElements(baseClass.driver, login_page.class);
		String emailEnter=fobj.loginobj().getProperty("email");
		String pwdenter=fobj.loginobj().getProperty("password");
		
		lp.getEmail().sendKeys(emailEnter);
		lp.getPassword().sendKeys(pwdenter);
		lp.getBtnsubmit().click();
	}

}

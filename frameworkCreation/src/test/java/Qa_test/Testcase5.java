package Qa_test;

import java.time.Duration;

import org.testng.annotations.Test;

import PageEvents.HomeMoreOption;
import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import PageEvents.colapsiblecontent;
import PageObjects.Home_MoreElement;
import base.BaseTest;
import utils.ElementFetch;

public class Testcase5 extends BaseTest{
	ElementFetch ele=new ElementFetch();
	HomePageEvents home=new HomePageEvents();  
	LoginPageEvents sign=new LoginPageEvents();
    HomeMoreOption more=new HomeMoreOption(driver);
    colapsiblecontent content=new colapsiblecontent();
/*
 *  *
 * user on click on  more 
 * and Click On Menus 
 * 	Then select SubOption in drodwon
 */
	
	@Test
  public void signin() throws InterruptedException {
logger.info("Sign into loginpage");
sign.loginPageisLoaded();
logger.info("SignIn text is present");
 
sign.Enterusername();
logger.info("Enter Credentials");
 
sign.Enterpassword();
  sign.login();
	
	
	

		logger.info("User On Homepage And ClickOn More Option");

		home.More();

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 // home.Textpresent();
	logger.info("User is in Homepage And ClickOn ColapsibleContent Option");

content.ColapsibleContent();
	//cotent.
  logger.info("User is in Homepage And ClickOn clicksubmenu");
  content.clicksubmenu();
  logger.info("User is in Homepage And chicks inChildopn");
content.ClickonChildopn();
logger.info("User is in Homepage And chicks checks text ispresent");

content.Checktext();
	
	}

}

package Qa_test;

import java.time.Duration;

import org.testng.annotations.Test;

import PageEvents.HomeMoreOption;
import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import PageEvents.UploagImg;
import PageEvents.colapsiblecontent;
import PageObjects.Home_MoreElement;
import base.BaseTest;
import utils.ElementFetch;

public class Testcase6 extends BaseTest{
	ElementFetch ele=new ElementFetch();
	HomePageEvents home=new HomePageEvents();  
	LoginPageEvents sign=new LoginPageEvents();
    HomeMoreOption more=new HomeMoreOption(driver);
    colapsiblecontent content=new colapsiblecontent();
    UploagImg img=new UploagImg();
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
img.clickonImg();
logger.info("User is in Homepage And ClickOn Image Option");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

img.chosefile();
	//cotent.
  logger.info("User is in Homepage And ClickOn upload file button");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

  img.entertxt();
  logger.info("Enter Text");
img.uploadbtn();
  logger.info("click on upload  button");

	
	}

}

package Qa_test;

import java.time.Duration;

import org.testng.annotations.Test;

import PageEvents.BrokenLink;
import PageEvents.HomeAlert;
import PageEvents.HomeMoreOption;
import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import PageEvents.Tootips;
import PageEvents.UploagImg;
import PageEvents.colapsiblecontent;
import PageObjects.Home_MoreElement;
import base.BaseTest;
import utils.ElementFetch;

public class Testcase_11 extends BaseTest{
	ElementFetch ele=new ElementFetch();
	HomePageEvents home=new HomePageEvents();  
	LoginPageEvents sign=new LoginPageEvents();
  HomeAlert alt=new HomeAlert(driver);
  BrokenLink link=new BrokenLink();
  /*
 *  *
 * user on click on  more 
 * and Click On Menus 
 * 	Then select SubOption in drodwon
 */@Test
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
 
 link.Links();
 Thread.sleep(3000);
  link.imglink();
  Thread.sleep(3000);

  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

 link.Findimgbrokenlink();
 }	

}

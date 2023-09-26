package Qa_test;

import java.time.Duration;

import org.testng.annotations.Test;

import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import base.BaseTest;
import utils.ElementFetch;

public class Testcase3 extends BaseTest {
	ElementFetch ele=new ElementFetch();
	HomePageEvents home=new HomePageEvents();  
	LoginPageEvents sign=new LoginPageEvents();

/*
 * user on click on  more 
 * and Click On Menus 
 * 	Then select SubOption in drodwon
 */
	
	@Test(priority=1)
  public void signin() throws InterruptedException {
logger.info("Sign into loginpage");
sign.loginPageisLoaded();
logger.info("SignIn text is present");
 
sign.Enterusername();
logger.info("Enter Credentials");
 
sign.Enterpassword();
  sign.login();
	}
	
	
	@Test(priority=2)
	public void homepagesubmenu() {
		logger.info("User On Homepage And ClickOn More Option");

		home.More();

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 // home.Textpresent();
	logger.info("User is in Homepage And ClickOn Menu Option");

  home.Menuclick();
	logger.info("User is in Homepage And ClickOn Menu Option");

  home.Sub_menu();
	logger.info("User is in Homepage And ClickOn SubMenu and click dropdwnoption");

  home.alldropdown();;
	home.dropdown();
	
	}
}

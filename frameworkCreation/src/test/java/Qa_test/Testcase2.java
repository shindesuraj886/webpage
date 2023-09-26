package Qa_test;

import java.time.Duration;

import org.testng.annotations.Test;

import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import base.BaseTest;
import utils.ElementFetch;

public class Testcase2 extends BaseTest {
	ElementFetch ele=new ElementFetch();
	HomePageEvents home=new HomePageEvents();  
	LoginPageEvents sign=new LoginPageEvents();

	@Test
  public void samplemethod() throws InterruptedException {
logger.info("Sign into loginpage");
sign.loginPageisLoaded();
logger.info("SignIn text is present");
 
sign.Enterusername();
logger.info("Enter Credentials");
 
sign.Enterpassword();
  sign.login();
  home.More();

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 // home.Textpresent();
  home.Menuclick();
  home.Testclick();
  home.Text_prsnt();
	
	
	}
}

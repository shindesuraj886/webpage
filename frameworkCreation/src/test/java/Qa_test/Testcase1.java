package Qa_test;

import org.testng.annotations.Test;

import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import base.BaseTest;
import utils.ElementFetch;

public class Testcase1 extends BaseTest {
	ElementFetch ele=new ElementFetch();
	HomePageEvents home=new HomePageEvents();  
	LoginPageEvents sign=new LoginPageEvents();

	@Test
  public void samplemethod() {
logger.info("Sign into loginpage");
sign.loginPageisLoaded();
logger.info("SignIn text is present");
 
sign.Enterusername();
logger.info("Enter Credentials");
 
sign.Enterpassword();
  sign.login();
  home.Textpresent();
  }
}

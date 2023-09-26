package Qa_test;

import java.time.Duration;

import org.testng.annotations.Test;

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

public class Testcase8 extends BaseTest{
	ElementFetch ele=new ElementFetch();
	HomePageEvents home=new HomePageEvents();  
	LoginPageEvents sign=new LoginPageEvents();
  HomeAlert alt=new HomeAlert(driver);
/*
 *  *
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
  logger.info("User On Homepage And ClickOn More Option");

	home.More();	
	}
	
	@Test(priority=2)
	public void HandleAlt() throws InterruptedException{
		
		

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	/*
	 * tooltip.tooltip(); logger.info("User is in Homepage And ClickOn tooltip ");
	 * //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 * 
	 * tooltip.chktooltip(); //cotent. logger.info("clicks on tool tip"); //
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 * 
	 * tooltip.tooltipmsg();
	 * 
	 * 
	 * logger.info("tooltip msg is sucessful");
	 */
alt.clickonPopup();

	}
	
	@Test(priority=3)
	public void aceptalt() {
		//alt.AlertgetAlert();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	}
	
	@Test(priority=4)
	public void confirmalt() throws InterruptedException{
alt.Confirmalt();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@Test(priority=5)
	public void promptalt() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		alt.prompt();
	}
	
  
  
  
  
  
	

}

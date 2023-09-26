package PageEvents;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObjects.Home_MoreElement;
import base.BaseTest;
import utils.ElementFetch;

public class HomeAlert extends BaseTest{
ElementFetch ele=new ElementFetch();
WebDriver driver;





public HomeAlert(WebDriver driver) {
	this.driver = driver;
	//logger.debug("AlertHelper : " + this.driver.hashCode());
	//driver.hashCode();
}

public void clickonPopup() throws InterruptedException  {
	ele.GetWebElement("XPATH", Home_MoreElement.popup).click();
	Thread.sleep(3000);

}
public  void AlertgetAlert() throws InterruptedException {
	//logger.info("checks alert is present or not");
	


	try {
		ele.GetWebElement("XPATH", Home_MoreElement.altbox).click();
		Thread.sleep(3000);
	   // WebDriver driver;// Initialize WebDriver and perform actions here
	} catch (Exception e) {
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
      // getAlert.accept();

	    e.printStackTrace();

	} 
}
public void Confirmalt() throws InterruptedException {
	ele.GetWebElement("XPATH", Home_MoreElement.confirmbox).click();
	//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
	Thread.sleep(5000);
	try {
	    WebDriver driver;// Initialize WebDriver and perform actions here
	} catch (Exception e) {

		driver.switchTo().alert().dismiss();
	    e.printStackTrace();
		Thread.sleep(5000);

	} 
}



public void prompt() throws InterruptedException {
	
	//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
	/*
	 * Thread.sleep(5000); Alert PromptAlert =driver.switchTo().alert();
	 * 
	 * System.out.println("Alert Text = "+PromptAlert.getText());
	 * PromptAlert.sendKeys("welcome"); PromptAlert.accept();
	 * 
	 */
	try {
		ele.GetWebElement("XPATH", Home_MoreElement.promptbox).click();

		//WebDriver driver;// Initialize WebDriver and perform actions here
	} catch (Exception e) {
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("welcome");
		Thread.sleep(5000);

		driver.switchTo().alert().accept();
		//Alert PromptAlert =
		//System.out.println("Alert Text = "+PromptAlert.getText());
		//PromptAlert.sendKeys("welcome");
		//PromptAlert.accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);

		e.printStackTrace();

	} 	
}
	
	public void windowalt() throws InterruptedException {

		try {
			ele.GetWebElement("XPATH", Home_MoreElement.winpop).click();

			Thread.sleep(5000);
		}catch(Exception e) {
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		e.printStackTrace();
		}
	}
	
public void windowhandle() throws InterruptedException {

	try {
	Thread.sleep(2000);

	ele.GetWebElement("XPATH", Home_MoreElement.pwn).click();
}catch(Exception e) {
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//
	//input[@id='UserName']
	
	//input[@id='Password']
	Thread.sleep(2000);

	Set<String>s=driver.getWindowHandles();

	// Now iterate using Iterator
	Iterator<String> I1= s.iterator();
	String pwin_window=I1.next();
	System.out.println("parent win id:"+pwin_window);
	
	/*
	 * String child_win=I1.next(); System.out.println("childwin  id:"+child_win);
	 * 
	 */		String child_window=I1.next();
	System.out.println("childwin win id:"+child_window);

	driver.switchTo().window(child_window);
	Thread.sleep(2000);

	System.out.println("Child win popup tilte :"+driver.getTitle());

	driver.close();

	driver.switchTo().window(pwin_window);
	Thread.sleep(2000);

	System.out.println("Child win popup tilte :"+driver.getTitle());

	e.printStackTrace();

}
}
}

























/*
 * public void AcceptAlert() { logger.info(""); getAlert.accept(); }
 * 
 * public void DismissAlert() { logger .info(""); getAlert().dismiss(); }
 

public String getAlertText() {
	String text = getAlert().getText();
	oLog.info(text);
	return text;
}

public boolean isAlertPresent() {
	try {
		driver.switchTo().alert();
		oLog.info("true");
		return true;
	} catch (NoAlertPresentException e) {
		// Ignore
		oLog.info("false");
		return false;
	}
}

public void AcceptAlertIfPresent() {
	if (!isAlertPresent())
		return;
	AcceptAlert();
	oLog.info("");
}

public void DismissAlertIfPresent() {

	if (!isAlertPresent())
		return;
	DismissAlert();
	oLog.info("");
}

public void AcceptPrompt(String text) {
	
	if (!isAlertPresent())
		return;
	
	Alert alert = getAlert();
	alert.sendKeys(text);
	alert.accept();
	oLog.info(text);
}*/















package PageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.Home_MoreElement;
import utils.ElementFetch;

public class Tootips {
ElementFetch ele=new ElementFetch();
WebDriver driver;

public void tooltip() {
	ele.GetWebElement("XPATH", Home_MoreElement.tooltips).click();
}
public void chktooltip() {
	ele.GetWebElement("XPATH", Home_MoreElement.tooltipschk).click();
}

public void tooltipmsg() {
	WebElement ageTextBox=ele.GetWebElement("XPATH", Home_MoreElement.tooltipschk);//.getAttribute();
	//WebElement ageTextBox = driver.findElement(By.id("age"));

	//Get title attribute value 
	String tooltipText = ageTextBox.getAttribute("data-original-title"); 
	
	System.out.println("Retrieved tooltip text as :"+tooltipText); 
	
	//Verification if tooltip text is matching expected value 
	if(tooltipText.equalsIgnoreCase("Thank you for being here!")){ 
		System.out.println("Pass : Tooltip matching expected value");
		}
	else{ 
		System.out.println("Fail : Tooltip NOT matching expected value"); 
	}
}








}

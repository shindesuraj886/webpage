package PageEvents;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.HomePageElement;
import PageObjects.Home_MoreElement;
import utils.ElementFetch;

public class HomeMoreOption {
	WebDriver driver;
	ElementFetch ele=new ElementFetch();
	
public void ClickOnTabs() {
		
		ele.GetWebElement("XPATH", Home_MoreElement.MultipleTab).click();
	} 

public void clickchildt() {
	ele.GetWebElement("XPATH", Home_MoreElement.chiltab).click();

}

public void childTabs() {
	
	  String curnttabs= driver.getWindowHandle();
	  Set<String>chiltabs=driver.getWindowHandles();
	/*  List<WebElement>chtabs=ele.GetWebElements("XPATH", Home_MoreElement.tabs);
	  Iterator<WebElement>it=chtabs.iterator(); 
	  for(WebElement tabs : chtabs) {
	  if(tabs.getText().equals("Selenium")) { 
		  tabs.click(); 
		  
		  break;
		  } }
	  */
	  
	  for(String actual: chiltabs) {
		if(!actual.equalsIgnoreCase(curnttabs)){
		  driver.switchTo().window(actual); 
		  //opening the URL saved.
		  //driver.get(urlToClick);
		   ele.GetWebElement("XPATH", Home_MoreElement.chiltab).click();
		  }
	  }}

	  public HomeMoreOption(WebDriver driver) {
			this.driver=driver;

}
}
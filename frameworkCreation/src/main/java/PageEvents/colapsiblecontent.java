package PageEvents;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.CollapsibleContent;
import PageObjects.SigninPageElements;
import utils.ElementFetch;

public class colapsiblecontent {
WebDriver driver;
	ElementFetch ele=new ElementFetch();
public void ColapsibleContent() {
	ele.GetWebElement("XPATH", CollapsibleContent.colapisilbe).click();
}
public void clicksubmenu() {
	ele.GetWebElement("XPATH", CollapsibleContent.Muliiplecolapse).click();
}
public void ClickonChildopn() {
	ele.GetWebElement("XPATH", CollapsibleContent.chl_opn).click();
}
public void Checktext() {
	
	Assert.assertTrue(ele.GetWebElements("XPATH",CollapsibleContent.textp).size()>0 ,"ElementNotFound");

}

}

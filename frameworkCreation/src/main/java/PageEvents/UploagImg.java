package PageEvents;

import org.openqa.selenium.WebDriver;

import PageObjects.Home_MoreElement;
import utils.ElementFetch;

public class UploagImg {
	WebDriver driver;
	ElementFetch ele=new ElementFetch();
	
	public void clickonImg() {
		ele.GetWebElement("XPATH", Home_MoreElement.img).click();
	}
	
	
	public void chosefile() {
		ele.GetWebElement("XPATH", Home_MoreElement.chosef).sendKeys("C:\\Users\\HP\\eclipse-workspace\\frameworkCreation\\src\\test\\resources\\imges\\new.jpg");

	}
	
	public void entertxt() {
		ele.GetWebElement("XPATH", Home_MoreElement.filename).sendKeys("new");

	}
	public void uploadbtn() {
		ele.GetWebElement("XPATH", Home_MoreElement.uploadbtn).click();

	}
	
	
	
	
	
}

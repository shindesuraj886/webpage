package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	WebDriver driver;

	@FindBy(xpath="//h1[normalize-space()='Welcome to JALA Academy']")
	WebElement txt_present;
	

	
	public void Txtpresent() {
		txt_present.isDisplayed();
	}

	
public HomePageFactory(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}


	
	
	
	
	
	
	
}

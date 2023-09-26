package PageEvents;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.HomePageElement;
import utils.ElementFetch;

public class HomePageEvents {
WebDriver driver;
	ElementFetch ele=new ElementFetch();
	
	public void Textpresent() {
		
		ele.GetWebElement("XPATH", HomePageElement.txtpresent).click();
	}
	public void scrolldown() {
		WebDriver driver =null;
		
		try {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)" ," ");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void More()   {
		
		//try{//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ele.GetWebElement("XPATH", HomePageElement.more).sendKeys(Keys.ENTER);
		}
	public void Menuclick() {
		ele.GetWebElement("XPATH", HomePageElement.menu).click();
	}
	public void Testclick() {
		ele.GetWebElement("XPATH", HomePageElement.submenu_test).click();
	}
	public void Text_prsnt() {
		ele.GetWebElement("XPATH", HomePageElement.sub_txt).isDisplayed();
	}
	
	public void Sub_menu() {
		ele.GetWebElement("XPATH", HomePageElement.Sub_Menu).click();
	}
	
	public void alldropdown() {
		ele.GetWebElement("XPATH", HomePageElement.all_dwnopn).click();
	}

	public void dropdown() {
	//WebElement dropdown = driver.findElement(By.id("myDropdown"));
ele.GetWebElement("XPATH" ,HomePageElement.dropdown_sm).click();
	//Click the dropdown to display the options
	//dropdown.click();
  List<WebElement>options= ele.GetWebElements("XPATH", HomePageElement.all_dwnopn);
	//Get all the options in the dropdown menu and store them in a List
	//List<WebElement> options = dropdown.findElements(By.tagName("option"));
    //ele.GetWebElement("XPATH", HomePageElement.ddwn_fopn);//.click();
	//Iterate through the options and select an option
	for(WebElement option : options) {
	    if(option.getText().equals("Selenium")) {
	        option.click();
	        break;
	   
	    }
	}

	}
	}



package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
By txt_username=By.id("UserName");
By txt_password=By.id("Password");
//By txt_password=By.id("Password");
By btb_login=By.xpath("//button[normalize-space(text())= 'Sign In']");
By txt_presnet=By.xpath("//h1[normalize-space()='Welcome to JALA Academy']");

public LoginPage(WebDriver driver) {
	this.driver=driver;
}

public void enterUsername(String username) {
	driver.findElement(txt_username).sendKeys(username);
}


public void enterPassword(String password) {
	driver.findElement(txt_password).sendKeys(password);
}

public void ClickonSignin() {
	driver.findElement(btb_login).click();
}

public void userlogin(String username,String password) {
	driver.findElement(txt_username).sendKeys(username);
	driver.findElement(txt_password).sendKeys(password);
	driver.findElement(btb_login).click();

}
public void istextDisplayed() {
	driver.findElement(txt_presnet).isDisplayed();
}



}

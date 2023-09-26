package PageEvents;

import org.testng.Assert;

import PageObjects.SigninPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
ElementFetch ele=new ElementFetch();

public void loginPageisLoaded() {
	Assert.assertTrue(ele.GetWebElements("XPATH",SigninPageElements.signin).size()>0 ,"ElementNotFound");
}

public void Enterusername() {
	ele.GetWebElement("ID",SigninPageElements.username).sendKeys("training@jalaacademy.com");
}
public void Enterpassword() {
	ele.GetWebElement("ID",SigninPageElements.password).sendKeys("jobprogram");
}
public void login() {
	ele.GetWebElement("XPATH",SigninPageElements.signin).click();
}

}

package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactorylogin {

	WebDriver driver;
	
	@FindBy(id="UserName")
	WebElement user_name;
	
	@FindBy(id="Password")
	WebElement Pass_word;
	
	@FindBy(xpath="//button[normalize-space(text())= 'Sign In']")
	WebElement Sign_in;
	
	//String username,String Password
	public  PageFactorylogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void EnterUsername(String username) {
		user_name.sendKeys(username);
	}
	
	public void Enterpass(String password) {
		Pass_word.sendKeys(password);
	}
	
	public void click_signin() {
		Sign_in.click();;
	}






}
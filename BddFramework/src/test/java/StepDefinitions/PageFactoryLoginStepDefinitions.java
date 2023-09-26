package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageFactory.HomePageFactory;
import PageFactory.PageFactorylogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageFactoryLoginStepDefinitions {
	//HomePageFactory  home;
	HomePageFactory home;
	PageFactorylogin login;
	static WebDriver driver;
	
	  @Given("user is on login Page")
	  public void user_is_on_login_page() {
	  
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://magnus.jalatechnologies.com");
	  
	  }
	  
	  @When("User enters valid {string} And {string}")
	  public void user_enters_valid_and(String username, String password) { //public
	 //  void user_enters_valid_username_and_password() {
	 // driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys(
	  //"training@jalaacademy.com");
	  //driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jobprogram"
	  
	  
	 login=new PageFactorylogin(driver);
	  login.EnterUsername(username);
	  login.Enterpass(password);
	  }
	  
	  @And("Clicks on login Button")
	  public void clicks_on_login_button() {
	  //driver.findElement(By.xpath("//button[normalize-space(text())= 'Sign In']")).
	  //click();
	  login.click_signin();
	  }
	  
	  @Then("user navigate to home Page")
	  public void user_navigate_to_home_page() {
	 // Assert.assertTrue(driver.findElements(By.
	  //xpath("//h1[normalize-space()='Welcome to JALA Academy']")).size()>0); }
	  
		  home=new HomePageFactory(driver);
		  home.Txtpresent();
	  }
	  
	  @And("Close the browser")
	  public void close_the_browser() { 
		  driver.close();
	  
	  }
	  
	 
}

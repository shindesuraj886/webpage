package PageEvents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.Home_MoreElement;
import utils.ElementFetch;

public class HomeIframe {
	WebDriver driver;
	ElementFetch ele=new ElementFetch();
	
	
	public void iframe() throws InterruptedException {
	ele.GetWebElement("XPATH", Home_MoreElement.Iframe).click();
	
Thread.sleep(5000);
	}
	
	public void switchbetwenframe() throws InterruptedException {
	//List<WebElement>ele=driver.findElements(By.xpath("//div[@class='col-md-12 row text-center m-t-md']"));
	List<WebElement> elemts=ele.GetWebElements("XPATH", Home_MoreElement.switchframe);
	//driver.findElement(By.xpath("(//a[normalize-space()='iFrames'])[1]")).click();

	int numberOfTags = elemts.size();
	System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
	Thread.sleep(3000);

	// Switch to the frame using the frame id
	System.out.println("Switching to the frame");
	driver.switchTo().frame("iframe1");
	 
	// Print the frame source code
	System.out.println("Frame Source" +driver.getPageSource());
	 
	// Switch back to main web page
	driver.switchTo().defaultContent();
	 
	driver.quit();





}
}

package PageEvents;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.Home_MoreElement;
import utils.ElementFetch;

public class BrokenLink {
ElementFetch ele=new ElementFetch();
WebDriver driver;


public void Links() {
	ele.GetWebElement("XPATH", Home_MoreElement.links).click();
}
public void brokenlink() {
	ele.GetWebElement("XPATH", Home_MoreElement.brokenlink).click();
}
public void imglink() {
	ele.GetWebElement("XPATH",Home_MoreElement.img ).click();
}
public void Findbrokenlink() {
	//ele.GetWebElement("XPATH", Home_MoreElement.printbL).click();
    String homePage = "https://magnus.jalatechnologies.com/Home/www.brokenlinkcheck.com/";
    String url = "";
    HttpURLConnection huc = null;
    int respCode = 200;


     List<WebElement>links=ele.GetWebElements("XPATH",Home_MoreElement.printbL);
     
     Iterator<WebElement> it = links.iterator();
     
     while(it.hasNext()){
         
         url = it.next().getAttribute("href");
         
         System.out.println(url);
     
         if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
             continue;
         }
         
         if(!url.startsWith(homePage)){
             System.out.println("URL belongs to another domain, skipping it.");
             continue;
         }
         
         try {
             huc = (HttpURLConnection)(new URL(url).openConnection());
             
             huc.setRequestMethod("HEAD");
             
             huc.connect();
             
             respCode = huc.getResponseCode();
             
             if(respCode >= 400){
                 System.out.println(url+" is a broken link");
             }
             else{
                 System.out.println(url+" is a valid link");
             }
                 
         } catch (MalformedURLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         
     }
     }
}/* driver.quit(); */

 
     public void Findimgbrokenlink() {
    		//ele.GetWebElement("XPATH", Home_MoreElement.printbL).click();
    	    String homePage = "https://magnus.jalatechnologies.com/Home/links";
    	    String url = "";
    	    HttpURLConnection huc = null;
    	    int respCode = 200;


    	     List<WebElement>links=ele.GetWebElements("XPATH",Home_MoreElement.findimgbroken);
    	     
    	     Iterator<WebElement> it = links.iterator();
    	     
    	     while(it.hasNext()){
    	         
    	         url = it.next().getAttribute("href");
    	         
    	         System.out.println(url);
    	     
    	         if(url == null || url.isEmpty()){
    	System.out.println("URL is either not configured for anchor tag or it is empty");
    	             continue;
    	         }
    	         
    	         if(!url.startsWith(homePage)){
    	             System.out.println("URL belongs to another domain, skipping it.");
    	             continue;
    	         }
    	         
    	         try {
    	             huc = (HttpURLConnection)(new URL(url).openConnection());
    	             
    	             huc.setRequestMethod("HEAD");
    	             
    	             huc.connect();
    	             
    	             respCode = huc.getResponseCode();
    	             
    	             if(respCode >= 400){
    	                 System.out.println(url+" is a broken link");
    	             }
    	             else{
    	                 System.out.println(url+" is a valid link");
    	             }
    	                 
    	         } catch (MalformedURLException e) {
    	             // TODO Auto-generated catch block
    	             e.printStackTrace();
    	         } catch (IOException e) {
    	             // TODO Auto-generated catch block
    	             e.printStackTrace();
    	         }
    	     }
}



}
//a[@href="www.brokenlinkcheck.com/"]
package utils;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {

	public WebElement GetWebElement(String identifireType ,String identifireValue) {
		
		switch(identifireType) {
		case "XPATH":
		return BaseTest.driver.findElement(By.xpath(identifireValue));
		
		case "CSS":
		return BaseTest.driver.findElement(By.cssSelector(identifireValue));
		
		case "ID":
			return BaseTest.driver.findElement(By.id(identifireValue));	

		case "NAME":
			return BaseTest.driver.findElement(By.name(identifireValue));
			
		case "TAGNAME":
			return BaseTest.driver.findElement(By.tagName(identifireValue));
			
		default :
		return null;
		
		}
		
		
	}

	public List<WebElement> GetWebElements(String identifireType ,String identifireValue) {
		
		switch(identifireType) {
		case "XPATH":
		return BaseTest.driver.findElements(By.xpath(identifireValue));
		
		case "CSS":
		return BaseTest.driver.findElements(By.cssSelector(identifireValue));
		
		case "ID":
			return BaseTest.driver.findElements(By.id(identifireValue));	

		case "NAME":
			return BaseTest.driver.findElements(By.name(identifireValue));
			
		case "TAGNAME":
			return BaseTest.driver.findElements(By.tagName(identifireValue));
			
		default :
		return null;
		
		}
		
		/*
		 * public Set<String> GetsElements(String stirngidentifireType ,String
		 * stringidentifireValue) {
		 * 
		 * switch(identifireType) { case "XPATH": return
		 * BaseTest.driver.findElements(By.xpath(identifireValue));
		 * 
		 * case "CSS": return
		 * BaseTest.driver.findElements(By.cssSelector(identifireValue));
		 * 
		 * case "ID": return BaseTest.driver.findElements(By.id(identifireValue));
		 * 
		 * case "NAME": return BaseTest.driver.findElements(By.name(identifireValue));
		 * 
		 * case "TAGNAME": return
		 * BaseTest.driver.findElements(By.tagName(identifireValue));
		 * 
		 * default : return null;
		 * 
		 * } }
		 */	}
}

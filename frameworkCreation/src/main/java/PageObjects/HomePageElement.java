package PageObjects;

import org.openqa.selenium.By;

public interface HomePageElement {
	String txtpresent="//h1[normalize-space()='Welcome to JALA Academy']";
String more="//a[normalize-space()='More']";
 String menu="//*[@id=\"MenusDashboard\"]/li[3]/ul/li[2]/a";

//body[1]/div[3]/aside[1]/section[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]
//*[@id="MenusDashboard"]/li[3]/ul/li[2]/a
 String submenu_test="//a[@id='b1']";
	
	String sub_txt="//span[@id='label']";
	
	String Sub_Menu=" //a[normalize-space()='Sub Menus']";
String dropdown_sm="//ul[@id='id1']";
String all_dwnopn="//*[@id='id1']";
String ddwn_fopn="//a[@id='selbtn']";


}

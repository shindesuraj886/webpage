package PageObjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.ElementFetch;

public interface Home_MoreElement {

	String MultipleTab="//a[normalize-space()='Multiple Tabs']";
	String tabs="//ul[@class='nav nav-tabs']";
    String chiltab="//a[normalize-space()='UnLearning']";

//click on image and upload a file
    String img="//a[normalize-space()='Images']";
    String chosef="//input[@id='file']";
   
    String filename="//input[@id='fileName']";
    String  uploadbtn="//button[normalize-space()='Upload']";

    //Tooltips hAandle
    String tooltips="//a[@href='/Home/Tooltip']";
    String tooltipschk="//button[@id='btnTooltip']";
   String tolmsg="//button[@data-original-title='Thank you for being here!']"; 
   //Popup

   String popup="//a[@href='/Home/Popup']";
   String altbox="//input[@id='alertBox']";
   String confirmbox="//input[@id='confirmBox']";
   String promptbox="//button[@id='promptBtn']";
   String winpop=" //a[@id='btn-six']";
   
 //button[normalize-space()='Close']
   //windows based popup
   String pwn="//a[@id='btn-one']";


// Links /BrokenLiks
   String links="//a[normalize-space()='Links']";
   String brokenlink="//a[normalize-space()='Broken Links']";
String printbL="//a[@href='www.brokenlinkcheck.com/']";

//img liks
String imglink="//a[normalize-space()='Image Links']";
String findimgbroken="//div[@class='col-md-12 row text-center m-t-md']";

//iframe
String Iframe="//div[@class='col-md-12 row text-center m-t-md']";
String switchframe="//a[normalize-space()='iFrames'])[1]";

}

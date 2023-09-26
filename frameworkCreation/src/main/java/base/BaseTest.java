package base;

import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import PageObjects.Home_MoreElement;
import utils.ElementFetch;
import utils.constant;

public class BaseTest {

	public static WebDriver driver;
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest logger;
	ElementFetch ele;

	@BeforeTest
	public void beforeTestMethod() {
		sparkreporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + File.separator + "reports" + File.separator + "ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		sparkreporter.config().setTheme(Theme.DARK);
		extent.setSystemInfo("HostName", "RHEL8");
		extent.setSystemInfo("Username", "Suraj");
		sparkreporter.config().setDocumentTitle("Automation Report");
		sparkreporter.config().setDocumentTitle("Automation Test Results by Suraj");
	}

	@BeforeMethod
	@Parameters("browser")
	public void beforemethod(String browser, Method testMethod) {

		logger = extent.createTest(testMethod.getName());
		SetupDriver(browser);
		driver.manage().window().maximize();
		driver.get(constant.Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + "Test Case Failed", ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + "Test Case Skipped", ExtentColor.ORANGE));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Test Case Passed", ExtentColor.GREEN));

		}
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
		extent.flush();
	}

	public void SetupDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			// WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			// WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			// WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}

	

			  
		 /* String pwin= driver.getWindowHandle();
		 * List<WebElement>chtabs=ele.GetWebElements("XPATH", Home_MoreElement.tabs);
		 * Iterator<WebElement>it=chtabs.iterator(); while(it.hasNext()) { WebElement
		 * childwin=it.next();
		 * 
		 * } if(!pwin.equals(childwin)) {
		 * 
		 * driver.switchTo().window(childwin); }
		 */
	}

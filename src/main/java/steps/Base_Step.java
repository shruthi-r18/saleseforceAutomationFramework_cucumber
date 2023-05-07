package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Step {
protected static Logger logger = LogManager.getLogger("");
public static ThreadLocal<WebDriver> threadlocaldriver = new ThreadLocal<WebDriver>();

public static WebDriver getdriver() {
	Base_Step.logger.debug("baseTest: getdriver driver configuratin retrieved from the thread");
	return Base_Step.threadlocaldriver.get();
}

@AfterMethod
public void removeDriver() {
	Base_Step.getdriver().close();
	Base_Step.threadlocaldriver.remove();
	Base_Step.logger.debug("baseTest: removeDriver  driver congiguration removed from thread");
}

	public static WebDriver getBrowserType(String browserName, boolean headless) {

		String browser_Name = browserName.toLowerCase();
		WebDriver driver = null;
		switch (browser_Name) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			if (headless == true) {
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--headless");
				driver = new ChromeDriver(co);
				logger.debug("BaseStep: getBrowserType Chrome headless browser configured");
			} else {
				driver = new ChromeDriver();
				logger.debug("BaseStep: getBrowserType Chrome browser configured");
			}
			driver.manage().window().maximize();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			if (headless == true) {
				EdgeOptions eo = new EdgeOptions();
				eo.setPageLoadStrategy("normal");
				eo.setCapability("--headless", true);
				driver = new EdgeDriver(eo);
				logger.debug("BaseStep: getBrowserType Edge headless browser configured");
			} else {
				driver = new EdgeDriver();
				logger.debug("BaseStep: getBrowserType Edge browser configured");
			}
			driver.manage().window().maximize();
			break;

		case "safari":
			WebDriverManager.chromedriver().setup();
			if (headless == true) {
				SafariOptions so = new SafariOptions();
				so.setCapability("--headless", true);
				driver = new SafariDriver(so);
				logger.debug("BaseStep: getBrowserType Safari headless browser configured");
			} else {
				driver = new ChromeDriver();
				logger.debug("BaseStep: getBrowserType Safari browser configured");
			}
			driver.manage().window().maximize();
			break;

		default:
			System.out.println("Enter valid browser: chrome,edge or safari");
			logger.error("BaseStep: getBrowserType browser name input is wrong");
		}
		
		return driver;
	}

public static void switchFrame(WebDriver driver, WebElement obj) {
		
		if(obj.isDisplayed()) {
			driver.switchTo().frame(obj);
			System.out.println("Pass : Switched to "+driver+" frame");
		}else {
			System.out.println("Fail : Could not switch  to frame");
		}
	}
	
	public static void switchtoDefaultFrame(WebDriver driver) {
		
		driver.switchTo().defaultContent();
		System.out.println("Pass: Switched to "+driver+" frame.");
	}
	public static void mouseOver(WebDriver driver,WebElement we) {
		if(we.isDisplayed()){
			Actions act = new Actions(driver);
			act.moveToElement(we).build().perform();
			System.out.println("Pass: "+we+" present");
		}else {
			System.out.println("Fail: "+we+" not present");
		}
		
	}
}

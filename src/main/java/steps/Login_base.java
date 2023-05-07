package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Login_base extends Base_Step{

	public Login_base(WebDriver driver) {
		// PageFactory.initElements(driver, loginPage.class);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	public static WebElement user_name;

	@FindBy(id = "password")
	public static WebElement password;

	@FindBy(xpath = "//input[@id=\"Login\"]")
	public static WebElement login_button;

	@FindBy(id = "error")
	public WebElement loginPageError;

	@FindBy(id = "rememberUn")
	public static WebElement rememberme_checkbox;

	@FindBy(id = "forgot_password_link")
	public WebElement forgot_password;

	@FindBy(id = "idcard-identity")
	public WebElement savedUserName;

	@FindBy(id="userNavButton")
	public WebElement homeUserName;
	
	@FindBy(id="header")
	public WebElement forgotPasswordPage;
	
	String actual_userName = "shru@cool.com";
	String actual_forgotPasswordErrorMessage ="Please enter your password.";
	String actual_loginErrorMessage ="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	String actual_resetPasswordErroeMessage = "Forgot Your Password";

	public boolean launchApp(WebDriver driver, String sURL) {

		boolean isLaunchApp = false;

		driver.get(sURL);
		logger.info("loginPage: launchApp App is launched");
		String actualURL = driver.getCurrentUrl();

		if (actualURL.equals(sURL)) {
			isLaunchApp = true;
			logger.info("loginPage: launchApp pass:App is launched as expected");
		}else {
		logger.info("loginPage: launchApp fail:App not launched as expected");
		}
		return isLaunchApp;
	}
	
	public void enterUserName(WebDriver driver, String username) {

		if (user_name.isDisplayed()) {
			user_name.sendKeys(username);
			logger.info("loginPage: enterUserName  username is entered");
		} else {
			System.out.println("Username element is not displayed");
			logger.error("loginPage: enterUserName  username element not found");
		}

	}

	public void enterpassword(WebDriver driver, String pass) {

		if (password.isDisplayed()) {
			password.sendKeys(pass);
			logger.info("loginPage: enterpassword password is entered");
		} else {
			System.out.println("Password element is not displayed");
			logger.error("loginPage: enterpassword password element not found");
		}

	}
	
	public boolean isHomePageDisplayed() {
		return homeUserName.isDisplayed();
	}
	
public boolean isLoginPageDisplayed(WebDriver driver) {
		boolean isFound = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://cool-dev-ed.develop.my.salesforce.com/"));
		if(login_button.isDisplayed()) {
			isFound = true;
		}
		return isFound;
	}


public boolean selectRememberMeCheckBox() {
	boolean isChecked = false;
	if (rememberme_checkbox.isSelected()) {
		isChecked = true;
			} else {
		rememberme_checkbox.click();
		isChecked = true;
				}
	if (isChecked == true){
		logger.info("loginPage: selectRememberMeCheckBox remember me checked");
	}else {
		logger.info("loginPage: selectRememberMeCheckBox remember me not checked");
	}
	return isChecked;
}
public void forgotPassword(WebDriver driver) {
	 
	if (forgot_password.isDisplayed()) {
		forgot_password.click();
		logger.info("loginPage: forgotPassword forgot password is checked");
	}
}
	
	public void clickLoginButton(WebDriver driver) {

		if (login_button.isDisplayed()) {
			login_button.click();
			logger.info("loginPage: clickLoginButton login button is clicked");
		} else {
			System.out.println("Login button is not displayed");
			logger.error("loginPage: clickLoginButton login button element not found");
		}

	}
	public String loginErrorMessage() {
		logger.info("loginPage: loginErrorMessage " +loginPageError.getText()  +" is displayed");
		return loginPageError.getText();
	}
public String forgotPasswordMessage() {
	logger.info("loginPage: forgotPasswordMessage " +forgotPasswordPage.getText()  +" is displayed");
	return forgotPasswordPage.getText();
}

public String getSavedUsername() {
		
	return savedUserName.getText();
}


}

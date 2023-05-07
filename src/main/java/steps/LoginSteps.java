package steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class LoginSteps {

	public static WebDriver driver;
	Login_base lb;

	@Given("User launches Login Page")
	public void user_launches_login_page() {
		driver = Base_Step.getBrowserType("chrome", true);
		Base_Step.threadlocaldriver.set(driver);
		lb = new Login_base(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		assertTrue(lb.launchApp(driver, "https://login.salesforce.com/"), "Actual url needs to match the expected url");

	}

	@When("You enter username and password")
	public void you_enter_username_and_password() {
		lb.enterUserName(driver, "shru@cool.com");

		lb.enterpassword(driver, "QA1automation");
	}

	@When("enter {string} and {string}")
	public void enter_and(String string, String string2) {
		lb.enterUserName(driver, string);

		lb.enterpassword(driver, string2);
	}

	@When("The login button is clicked")
	public void the_login_button_is_clicked() {
		lb.clickLoginButton(driver);
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		assertTrue(lb.isHomePageDisplayed(), "Home Page should be displayed");
	}

	@When("click remember me button")
	public void click_remember_me_button() {
		assertTrue(lb.selectRememberMeCheckBox(), "Remember me should be selected");
	}

	@When("logout is clicked")
	public void logout_is_clicked() {
		UserMenu_Base umb = new UserMenu_Base(driver);
		umb.selectFromUserMenuOption(driver, "Logout");
	}

	@Then("login page should be displayed")
	public void login_page_should_be_displayed() {
		assertTrue(lb.isLoginPageDisplayed(driver), "login page should be displayed");
	}

	@Then("Valid username should be displayed")
	public void valid_username_should_be_displayed() {
		assertEquals(lb.actual_userName, lb.getSavedUsername(), "Username should match");
	}

	@When("Enter username and clear password")
	public void enter_username_and_clear_password() {
		lb.enterUserName(driver, "shru@cool.com");
		lb.password.clear();
	}
	
	@Then("enter password error message should be displayed")
	public void enter_password_error_message_should_be_displayed() {
		assertEquals(lb.loginErrorMessage(),lb.actual_forgotPasswordErrorMessage,"Password Error message should match");
	}


	@When("You enter invalid username and  password")
	public void you_enter_invalid_username_and_password() {
		lb.enterUserName(driver, "1234@gmail.com");
		lb.enterpassword(driver, "1234");
	}
	

	@Then("Enter valid credentials error message should be displayed")
	public void enter_valid_credentials_error_message_should_be_displayed() {
	   assertEquals(lb.loginErrorMessage(),lb.actual_loginErrorMessage,"Error message should match");
	}



	@When("You enter username")
	public void you_enter_username() {
		lb.enterUserName(driver, "shru@cool.com");
	}

	@When("The Forgot password button is clicked")
	public void the_forgot_password_button_is_clicked() {
		lb.forgotPassword(driver);
	}
	

	@Then("Reset password page should be displayed")
	public void reset_password_page_should_be_displayed() {
	    assertEquals(lb.forgotPasswordMessage(),lb.actual_resetPasswordErroeMessage,"Reset password page should be displayed");
	}



	
}

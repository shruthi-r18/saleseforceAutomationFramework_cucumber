package steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class UserMenuSteps {

	WebDriver driver;
	Login_base lb;
	UserMenu_Base umb;

	@Before
	@Given("Launch app with valid username and password")
	public void launch_app_with_valid_username_and_password() {
		driver = Base_Step.getBrowserType("chrome", false
				);
		Base_Step.threadlocaldriver.set(driver);
		lb = new Login_base(driver);
		umb = new UserMenu_Base(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		assertTrue(lb.launchApp(driver, "https://login.salesforce.com/"), "Actual url needs to match the expected url");
		lb.enterUserName(driver, "shru@cool.com");
		lb.enterpassword(driver, "QA1automation");
		lb.clickLoginButton(driver);
		assertTrue(lb.isHomePageDisplayed(), "Home Page should be displayed");
	}

	@Then("Check for user menu")
	public void check_for_user_menu() {
		assertTrue(umb.isUserMenuDisplayed(), "User menu should be displayed");
	}

	@When("click on user menu")
	public void click_on_user_menu() {
		assertTrue(umb.click_UserMenu(driver), "User menu should be clicked");
	}

	@Then("Drop down with My profile,My Settings,Developer Console,Logout ,Switching to lightning Experience is displayed and validate the dropdown list")
	public void drop_down_with_my_profile_my_settings_developer_console_logout_switching_to_lightning_experience_is_displayed_and_validate_the_dropdown_list() {
		assertTrue(umb.validate_userMenuList(), "User menu list should match");
	}

//	@Given("Launch app with valid username and password")
//	public void launch_app_with_valid_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("Click My profile option from user menu")
	public void click_my_profile_option_from_user_menu() {
		assertTrue(umb.selectFromUserMenuOption(driver, "My Profile"), "My profile shuold be clicked");
	}

	@Then("User profile page should be displayed")
	public void user_profile_page_should_be_displayed() {
		assertTrue(umb.validateMyProfilePage(driver), "My Profile page should be displayed");
	}

	@When("Check for the edit button next to contact text on the page and click the edit button")
	public void check_for_the_edit_button_next_to_contact_text_on_the_page_and_click_the_edit_button() {
		assertTrue(umb.clickEditContactText(driver), "Edit profile popup should be seen");
	}

	@Then("Edit profile pop up window is displayed with contact and About tabs to edit")
	public void edit_profile_pop_up_window_is_displayed_with_contact_and_about_tabs_to_edit() {
		assertTrue(umb.validateMyProfilePopUp(), "Edit profile pop up should be displayed");
	}

	@When("Click on About tab")
	public void click_on_about_tab() {
		assertTrue(umb.selectAboutTab(driver), "About tab shold be selected");
	}

	@When("enter or edit Lastname")
	public void enter_or_edit_lastname() {
		assertTrue(umb.aboutTab_editLastName(driver), "Last name in about tab should be edited");
	}

	@When("click on save all button")
	public void click_on_save_all_button() {
		assertTrue(umb.saveEditProfile(driver), "Edited Profile should be saved");
	}

	@Then("User Profile Page with changed lastname should be displayed")
	public void user_profile_page_with_changed_lastname_should_be_displayed() {
		assertTrue(umb.validateProfileNameEdit(), "name should be a match");
	}

	@When("Click on Post link")
	public void click_on_post_link() {
		assertTrue(umb.clickPostLink(driver), "post link should be clicked");
	}

	@When("Enter text to post in the post text area")
	public void enter_text_to_post_in_the_post_text_area() {
		assertTrue(umb.enterTextInPost(driver), "Text to be posted should be entered");
	}

	@When("click on share button")
	public void click_on_share_button() {
		assertTrue(umb.sharePostText(driver), "Shared button should be clicked");
	}

	@Then("Text entered should be displayed on the page")
	public void text_entered_should_be_displayed_on_the_page() {
		//assertEquals(umb.text, umb.getSharedText(), "Shared and actual text should match");
	}
	

	@When("Click on the  file link")
	public void click_on_the_file_link() throws InterruptedException {
		assertTrue(umb.clickFileLink(driver), "File link should be clicked");
	}
	@When("click on upload a file from computer button")
	public void click_on_upload_a_file_from_computer_button() {
		assertTrue(umb.clickUploadFile(driver), "update file should be clicked");
	}
	@When("select a file to be uploaded")
	public void select_a_file_to_be_uploaded() {
		assertTrue(umb.selectFile(driver), "Selected file should be uploaded");
	}
	@Then("Selected file should be posted")
	public void selected_file_should_be_posted() {
		//assertTrue(umb.validateFileUpload(), "Shared file should be visible");
	}

	@When("Hover the mouse on myprofilephoto image add photo link appears,Click on the link to upload a photo")
	public void hover_the_mouse_on_myprofilephoto_image_add_photo_link_appears_click_on_the_link_to_upload_a_photo() throws InterruptedException {
		assertTrue(umb.uploadMyProfilePhoto(driver), "upload option should be visible");
	}

	@When("Click on Choose file button and select the image to upload. Crop the photo to fit the image.")
	public void click_on_choose_file_button_and_select_the_image_to_upload_crop_the_photo_to_fit_the_image() throws InterruptedException {
		assertTrue(umb.choosePhotoToUpload(driver), "uploaded photo should be visible");
	}

	@Then("Uploaded photo should appear on the image")
	public void uploaded_photo_should_appear_on_the_image() {

	}
	
	@When("Select DeveloperConsole option from user menu list")
	public void select_developer_console_option_from_user_menu_list() {
	    assertTrue(umb.switchToDeveloperConsole(driver),"Developer Console should be displayed");
	}
	@Then("Developer console window should be displayed")
	public void developer_console_window_should_be_displayed() {
	    assertTrue(umb.validateDeveloperConsoleWindowOpen(),"Strings should be equal");
	}
	@When("click on close button on developer console")
	public void click_on_close_button_on_developer_console() {
	   umb.closeDeveloperConsole(driver);
	}
	@Then("Developer console window should be closed")
	public void developer_console_window_should_be_closed() {
	   assertTrue(umb.validateDeveloperConsoleWindowClose(),"Strings should be equal");
	}

	@When("Select My Settings option from user menu list")
	public void select_my_settings_option_from_user_menu_list() {
	    assertTrue(umb.selectFromUserMenuOption(driver, "My Settings"),"My Settings should be selected");
	}
	@Then("My Settings page is displayed")
	public void my_settings_page_is_displayed() {
	   assertTrue(umb.validateMySettingsPage(),"My settings page should be displayed"); 
	}
	@When("Click on personal link and select Login History link.")
	public void click_on_personal_link_and_select_login_history_link() {
	    assertTrue(umb.updatePersonal_LoginHistory(driver),"login history should be clicked");
	}
	@Then("Login history is displayed and the data is downloaded in .csv format.")
	public void login_history_is_displayed_and_the_data_is_downloaded_in_csv_format() {
	    assertTrue(umb.validateLoginHistory(),"Login History should be displayed ");
	    assertTrue(umb.validateDownloadFormat()," download should be in .csv format ");
	}
	@When("Click on Display & Layout link and select Customize My Tabs link. Select {string} option from custom App: drop down. Select Reports tab from Available Tabs list. Click on >\\(Add) button.")
	public void click_on_display_layout_link_and_select_customize_my_tabs_link_select_option_from_custom_app_drop_down_select_reports_tab_from_available_tabs_list_click_on_add_button(String string) {
	   assertTrue(umb.updateDisplayLayout_CustomiseTabs(driver),"Customise tab should be selected");
	   assertTrue(umb.validateCustomiseTabs(),"customise tab pge should be displayed");
	   assertTrue(umb.selectSalesforceChatter(driver),"customApp_SalesforceChatter should be clicked");
	   assertTrue(umb.selectAndAddAvailableTabReports(driver),"Reports should be added");
//	   assertTrue(umb.selectedTab_Report(),"reports should be added to selected tab");
	   assertTrue(umb.saveCustomiseTabsPage(driver),"should save all changes in custumise tab");
	   
	}
	@Then("Reports field is added to Selected Tabs list and also added in the links available in top of salesforce page and sales force chatter page and sales and marketing pages.")
	public void reports_field_is_added_to_selected_tabs_list_and_also_added_in_the_links_available_in_top_of_salesforce_page_and_sales_force_chatter_page_and_sales_and_marketing_pages() {
		assertTrue(umb.validateReportsFieldAdded(),"Reports Field should be added");
	}
	@When("Provide EmailName in Email Name field, EmailAddress in Email Address field, Select automatic BCC radio button and click on save button")
	public void provide_email_name_in_email_name_field_email_address_in_email_address_field_select_automatic_bcc_radio_button_and_click_on_save_button() {
	    assertTrue(umb.updateEmailNameAndAddress(driver),"updates should be done");
	}
	@Then("given details are saved as default mail options and My settings page is displayed.")
	public void given_details_are_saved_as_default_mail_options_and_my_settings_page_is_displayed() {
	    assertTrue(umb.validateEmailSaved(),"updates not saved");
	}
	@When("Click on Calendar & Remainders link and click on Activity Remainders link. On Remainders page click on Open a test Remainder button.")
	public void click_on_calendar_remainders_link_and_click_on_activity_remainders_link_on_remainders_page_click_on_open_a_test_remainder_button() {
		assertTrue(umb.CalenderAndReminder(driver),"Activity Reminders should be selected");
		assertTrue(umb.validateActivityReminderPage(),"Activity Reminders page should be displayed");
		assertTrue(umb.openATestReminder(driver),"open a test reminder should be clicked");
	}
	@Then("Sample event pop window is dispayed.")
	public void sample_event_pop_window_is_dispayed() {
	   assertTrue(umb.validateCalenderPopUp(driver),"urls needs to be equal");
	}

	@When("Select Logout option from user menu list")
	public void select_logout_option_from_user_menu_list() {
	    assertTrue(umb.selectFromUserMenuOption(driver, "Logout"),"Logout should be selected");
	}
	@Then("Logout  of current sales force application and login page is displayed.")
	public void logout_of_current_sales_force_application_and_login_page_is_displayed() {
assertTrue(umb.validateLogout(driver),"URL should be same"); 
	}






}

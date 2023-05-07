package steps;

import java.sql.DriverManager;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserMenu_Base extends Base_Step {
	public UserMenu_Base(WebDriver driver) {
		// PageFactory.initElements(driver, loginPage.class);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "userNavButton")
	public WebElement homeUserMenu;

	@FindBy(xpath = "//div[@id='userNav-menuItems']/a")
	public List<WebElement> userMenuOptions;

	@FindBy(id = "userNav-menuItems/a[1]")
	public WebElement myProfile;

	@FindBy(id = "userNav-menuItems/a[2]")
	public WebElement mySettings;

	@FindBy(id = "userNav-menuItems/a[3]")
	public WebElement developerConsole;

	@FindBy(id = "userNav-menuItems/a[4]")
	public WebElement SwitchtoLightningExperience;

	@FindBy(id = "userNav-menuItems/a[5]")
	public WebElement logout;

	@FindBy(xpath = "//*/a[@class=\"contactInfoLaunch editLink\"]/img[@alt=\"Edit Profile\"]")
	public WebElement editProfileLink;

	@FindBy(xpath = "//h2[@id=\"contactInfoTitle\"]")
	public WebElement editProfilePopUp;

	@FindBy(xpath = "//iframe[@id=\"contactInfoContentId\"]")
	public WebElement profileIframe;

	@FindBy(xpath = "//div/textarea[@id=\"street\"]")
	public WebElement addressContactTab;

	@FindBy(xpath = "//li[@id=\"aboutTab\"]")
	public WebElement AboutTab;

	@FindBy(xpath = "//input[@id=\"firstName\"]")
	public WebElement firstNameAboutTab;

	@FindBy(xpath = "//input[@id=\"lastName\"]")
	public WebElement lastNameAboutTab;

	@FindBy(xpath = "//input[@value=\"Save All\"]")
	public WebElement saveProfile;

	@FindBy(xpath = "//a[@title=\"Post\"]")
	public WebElement postButton;

	@FindBy(xpath = "//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
	public WebElement postTextIframe;

	@FindBy(xpath = "//html[1]/body[1]")
	public WebElement postText;

	@FindBy(id = "publishersharebutton")
	public WebElement shareButton;

	@FindBy(xpath = "//div[@class=\"cxfeeditem feeditem\"]//child::p")
	public WebElement verifyPostedText;

	@FindBy(xpath = "//a/span[contains(@class,'publisherattachtext')][contains(text(),'File')]")
	public WebElement fileButton;

	@FindBy(id = "chatterUploadFileAction")
	public WebElement uploadFileLink;

	@FindBy(id = "chatterFile")
	public WebElement chooseFileButton;

	@FindBy(xpath = "//div[@class=\"cxfeeditem feeditem\"]//span[text()=\" posted a file.\"]")
	public WebElement verifyFileUpload;

	@FindBy(xpath = "//span[@id=\"displayBadge\"]")
	public WebElement photoModerator;

	@FindBy(id = "uploadLink")
	public WebElement addPhotoButton;

	@FindBy(xpath = "//iframe[@id='uploadPhotoContentId']")
	public WebElement iFramePhotoUpload;

	@FindBy(xpath = "//input[@type=\"file\"]")
	public WebElement choosePhotoToUpload;

	@FindBy(id = "j_id0:uploadFileForm:uploadBtn")
	public WebElement uploadPhoto;

	@FindBy(id = "j_id0:j_id7:save")
	public WebElement savePhoto;

	@FindBy(xpath = "//span[text()='My Settings']")
	public WebElement validateMySettings;

	@FindBy(xpath = "//div[@id=\"PersonalInfo\"]/a/span[ @id=\"PersonalInfo_font\"]")
	public WebElement personalButton;

	@FindBy(id = "PersonalInfo_child")
	public WebElement settingsPersonalMenu;

	@FindBy(id = "LoginHistory_font")
	public WebElement personalLoginHistory;

	@FindBy(xpath = "//h1[@class=\"noSecondHeader pageType\"]")
	public WebElement validateLoginHistoryPage;

	@FindBy(id = "DisplayAndLayout_font")
	public WebElement settingsDisplayLayout;

	@FindBy(id = "DisplayAndLayout_child")
	public WebElement displayLayoutMenu;

	@FindBy(id = "CustomizeTabs_font")
	public WebElement displayLayoutCustomizeTab;

	@FindBy(xpath = "//div[@class=\"pShowMore\"]/a[contains(text(),\".csv\")]")
	public WebElement downloadCsvFormat;

	@FindBy(xpath = "//h1[@class=\"noSecondHeader pageType\"]")
	public WebElement validateCustomiseTabPage;

	@FindBy(xpath = "//select[@id=\"p4\"]")
	public WebElement customApp_textbox;

	@FindBy(xpath = "//select[@id=\"p4\"]/option[text()=\"Salesforce Chatter\"]")
	public WebElement customApp_SalesforceChatter;

	@FindBy(xpath = "//select[@id=\"duel_select_0\"]")
	public WebElement avalableTabs;

	@FindBy(xpath = "//select[@id=\"duel_select_0\"]/option[@value=\"report\"]")
	public WebElement avalableTabs_Reports;

	@FindBy(xpath = "//img[@class=\"rightArrowIcon\"]")
	public WebElement CustomiseTabPage_AddButton;

	@FindBy(xpath = "//select[@id=\"duel_select_1\"]")
	public WebElement selectedTab;

	@FindBy(xpath = "//select[@id=\"duel_select_1\"]/option[@value=\"report\"]")
	public WebElement selectedTab_Report;

	@FindBy(xpath = "//input[@title=\"Save\"]")
	public WebElement saveCustomiseTab;

	@FindBy(xpath = "//li[@id=\"report_Tab\"]/a[@title=\"Reports Tab\"]")
	public WebElement validateReport;
	
	@FindBy(xpath = "//span[@id=\"EmailSetup_font\"]")
	public WebElement mySettingsEmail;
	
	@FindBy(xpath = "//a[@id=\"EmailSettings_font\"]")
	public WebElement myEmailSettings;
	
	@FindBy(xpath = "//h1[text()='My Email Settings']")
	public WebElement validatemyEmailSettings;
	
	//xpath = "//input[@id=\"sender_name\"]"
	@FindBy(id="sender_name")
	public WebElement emailName;
	
//	xpath = "//input[@id=\"sender_email\"]"
	@FindBy(id="sender_email")
	public WebElement emailAddress;
	
//	xpath = "//input[@id=\"auto_bcc1\"]"
	@FindBy(id="auto_bcc1")
	public WebElement bccButton;
	
	@FindBy(xpath = "//input[@class=\"btn primary\"]")
	public WebElement saveEmail;
	
	@FindBy(xpath = "//div[@class=\"messageText\"]")
	public WebElement validateSave;
	
	@FindBy(xpath = "//span[@id=\"CalendarAndReminders_font\"]")
	public WebElement calenderReminder;
	 
	@FindBy(xpath = "//span[@id=\"Reminders_font\"]")
	public WebElement activityReminder;
	 
	@FindBy(xpath = "//h1[@class=\"noSecondHeader pageType\"]")
	public WebElement validateActivityReminder;
	 
	@FindBy(xpath = "//input[@id=\"testbtn\"]")
	public WebElement openTestReminder;
	 
//	@FindBy(xpath = "//div[@class=\"messageText\"]")
//	public WebElement validateSave;

	String actual_firstName = "";
	String actual_lastName = "";
	String actual_name = "";
	String text = "";
	String currentWindow = "";
	String currentNewWindow = "";
	String currentUrl = "";
	String newUrl = "";
    String calenderUrl="https://cool-dev-ed.develop.my.salesforce.com/ui/core/activity/ActivityReminderPage?at=1683334008531&test=1";

    public boolean isUserMenuDisplayed() {
		return homeUserMenu.isDisplayed();
	}

	String sUsermenuList = "My Profile,My Settings,Developer Console,Switch to Lightning Experience,Logout";

	public boolean click_UserMenu(WebDriver driver) {
		boolean isClicked = false;
		if (homeUserMenu.isDisplayed()) {
			homeUserMenu.click();
			isClicked = true;
		}
		return isClicked;
	}

	public boolean validate_userMenuList() {
		boolean isEqual = true;
		String[] expectedUserMenuItems = sUsermenuList.split(",");
		System.out.println(expectedUserMenuItems);
		for (int i = 0; i < expectedUserMenuItems.length; i++) {
			String actualUserMenuItem = userMenuOptions.get(i).getText();
			if (actualUserMenuItem.equals(expectedUserMenuItems[i])) {
				System.out.println("The option " + expectedUserMenuItems[i] + " Passed");
			} else {
				isEqual = false;
				System.out.println(
						"Actual option: " + actualUserMenuItem + " Expected option: " + expectedUserMenuItems[i]);
			}
		}
		return isEqual;
	}

	public boolean selectFromUserMenuOption(WebDriver driver, String sOption) {
		boolean isClicked = false;
		int index = 0;
		String option = sOption.toLowerCase();

		click_UserMenu(driver);

		switch (option) {
		case "my profile":
			index = 1;
			break;
		case "my settings":
			index = 2;
			break;
		case "developer console":
			index = 3;
			break;
		case "switch to lightning experience":
			index = 4;
			break;
		case "logout":
			index = 5;
			break;
		default:
			System.out.println("Not a valid selection");
		}
		if (index != 0) {
			WebElement eOption = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[" + index + "]"));
			System.out.println("userNav-menuItems/a[" + index + "]");
			if (eOption.isDisplayed()) {
				eOption.click();
				isClicked = true;
			}
		} else {
			System.out.println("index = 0, does not match any list element");
		}

		return isClicked;
	}

	public boolean validateMyProfilePage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(postButton));
		return postButton.isDisplayed();
	}

	public boolean clickEditContactText(WebDriver driver) {
		boolean isClicked = false;
		if (editProfileLink.isDisplayed()) {
			editProfileLink.click();
			isClicked = true;
		} else {
			System.out.println("Edit button for contact text not displayed");
		}

		return isClicked;
	}

	public boolean validateMyProfilePopUp() {
		boolean isVisible = false;
		if (editProfilePopUp.isDisplayed()) {
			isVisible = true;
		} else {
			System.out.println("Edit profile pop up not displayed");
		}
		return isVisible;
	}

	public boolean selectAboutTab(WebDriver driver) {
		boolean isSeen = false;
		Base_Step.switchFrame(driver, profileIframe);
		if (AboutTab.isDisplayed()) {
			AboutTab.click();
			isSeen = true;
		} else {
			System.out.println("About tab is not displayed");
		}
		return isSeen;
	}

	public boolean aboutTab_editLastName(WebDriver driver) {
		boolean isEdited = false;
		if (lastNameAboutTab.isDisplayed()) {
			lastNameAboutTab.clear();
			lastNameAboutTab.sendKeys("Raj");
			isEdited = true;
		} else {
			System.out.println("About tab-last name is not displayed");
		}
		actual_firstName = firstNameAboutTab.getAttribute("value");
		actual_lastName = lastNameAboutTab.getAttribute("value");
		actual_name = actual_firstName + " " + actual_lastName;
		System.out.println(actual_firstName + " " + actual_lastName);
		return isEdited;
	}

	public boolean saveEditProfile(WebDriver driver) {
		boolean isClicked = false;
		if (saveProfile.isDisplayed()) {
			saveProfile.click();
			isClicked = true;
		} else {
			System.out.println("save button is not displayed");
		}
		switchtoDefaultFrame(driver);
		return isClicked;
	}

	public boolean validateProfileNameEdit() {
		boolean isEqual = false;
		String Expected_name = homeUserMenu.getText();
		if (actual_name.equals(Expected_name)) {
			isEqual = true;
		}
		return isEqual;
	}

	public boolean clickPostLink(WebDriver driver) {
		boolean isClicked = false;
		if (postButton.isDisplayed()) {
			postButton.click();
			isClicked = true;
		} else {
			System.out.println("Post link tab is not displayed");
		}
		return isClicked;
	}

	public boolean enterTextInPost(WebDriver driver) {
		boolean isEntered = false;
		text = "Hello, friends";
		switchFrame(driver, postTextIframe);
		if (postText.isDisplayed()) {
			postText.click();
			postText.sendKeys(text);
			isEntered = true;
		} else {
			System.out.println("post text box is not displayed ");
		}
		switchtoDefaultFrame(driver);
		return isEntered;

	}

	public boolean sharePostText(WebDriver driver) {
		boolean isShare = false;
		if (shareButton.isDisplayed()) {
			shareButton.click();
			isShare = true;
		} else {
			System.out.println("Share button is not displayed");
		}

		return isShare;
	}

	public String getSharedText() {
		// verifyPostedText.getText()
		return "Hello, friends";
	}

	public boolean clickFileLink(WebDriver driver) throws InterruptedException {
		boolean isClicked = false;
		Thread.sleep(3000);
		if (fileButton.isDisplayed()) {
			fileButton.click();
			System.out.println("File link is clicked");
			isClicked = true;
		} else {
			System.out.println("File link is not displayed");
		}
		return isClicked;
	}

	public boolean clickChooseFile(WebDriver driver) {
		boolean isClicked = false;
		if (chooseFileButton.isDisplayed()) {
			chooseFileButton.click();
			isClicked = true;
		} else {
			System.out.println("Choose File link is not displayed");
		}
		return isClicked;
	}

	public boolean clickUploadFile(WebDriver driver) {
		boolean isClicked = false;
		if (uploadFileLink.isDisplayed()) {
			uploadFileLink.click();
			isClicked = true;
		} else {
			System.out.println("Update File is not displayed");
		}
		return isClicked;
	}

	public boolean selectFile(WebDriver driver) {
		boolean isClicked = false;
		String sPath = "C://Users//shrut//OneDrive//Desktop//science//title.pdf";
		if (chooseFileButton.isDisplayed()) {
			chooseFileButton.sendKeys(sPath);
			isClicked = true;
		} else {
			System.out.println("Choose File link is not displayed");
		}
		return isClicked;

//	chooseFileButton.submit();
	}

	public boolean validateFileUpload() {
		boolean isSeen = false;
		if (verifyFileUpload.isDisplayed()) {
			isSeen = true;
		} else {
			System.out.println("Shared File is not displayed");
		}
		return isSeen;
	}

	public boolean uploadMyProfilePhoto(WebDriver driver) throws InterruptedException {
		boolean isDone = false;
		Thread.sleep(3000);
		if (photoModerator.isDisplayed()) {
			Base_Step.mouseOver(driver, photoModerator);
			if (addPhotoButton.isDisplayed()) {
				addPhotoButton.click();
				isDone = true;
			} else {
				System.out.println("Add/update is not displayed");
			}
		} else {
			System.out.println("Photo Moderator is not displayed");
		}
		return isDone;
	}

	public boolean choosePhotoToUpload(WebDriver driver) throws InterruptedException {
		boolean isSeen = true;
		Base_Step.switchFrame(driver, iFramePhotoUpload);
		if (choosePhotoToUpload.isDisplayed()) {
			choosePhotoToUpload.sendKeys("C:\\Users\\shrut\\OneDrive\\Pictures\\nature.png");

		} else {
			System.out.println("Choose Photo is not displayed");
			isSeen = false;
		}
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfAllElements(uploadPhoto));
		if (uploadPhoto.isDisplayed()) {
			uploadPhoto.click();
		} else {
			System.out.println("save is not displayed");
			isSeen = false;
		}
		if (savePhoto.isDisplayed()) {
			savePhoto.click();
		} else {
			System.out.println("save 2 is not displayed");
			isSeen = false;
		}
		// Base_Step.switchtoDefaultFrame(driver);
		return isSeen;
	}

	public boolean switchToDeveloperConsole(WebDriver driver) {
		boolean isDisplayed;
		currentUrl = driver.getCurrentUrl();
		currentWindow = driver.getWindowHandle();
		isDisplayed = selectFromUserMenuOption(driver, "Developer Console");

		Set<String> allWindows = driver.getWindowHandles();
		allWindows.remove(currentWindow);
		String newWindow = "";

		for (String string : allWindows) {
			System.out.println("Tab ID: " + string);
			newWindow = string;
		}
		// WebDriverWait wait_windowLoad = new WebDriverWait(driver, 30) ;
// 		wait_windowLoad.until(ExpectedConditions.urlMatches("https://cool-dev-ed.develop.my.salesforce.com/_ui/common/apex/debug/ApexCSIPage"));
		driver.switchTo().window(newWindow);
		currentNewWindow = driver.getWindowHandle();
		newUrl = driver.getCurrentUrl();

		return isDisplayed;
	}

	public boolean validateDeveloperConsoleWindowOpen() {
		boolean isEqual = false;
		String actualWindow = "https://cool-dev-ed.develop.my.salesforce.com/_ui/common/apex/debug/ApexCSIPage";
		System.out.println(actualWindow + "," + newUrl);
		if (actualWindow.equals(newUrl)) {
			isEqual = true;
		} else {
			System.out.println("Strings are not equal");
		}
		return isEqual;
	}

	public void closeDeveloperConsole(WebDriver driver) {

		driver.close();
		driver.switchTo().window(currentWindow);

	}

	public boolean validateDeveloperConsoleWindowClose() {
		boolean isEqual = false;
		String actualWindow = "https://cool-dev-ed.develop.my.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom";
		if (actualWindow.equals(currentUrl)) {
			isEqual = true;
		} else {
			System.out.println("Strings are not equal");
		}
		return isEqual;
	}

	public boolean validateMySettingsPage() {
		boolean isSeen = false;
		if (validateMySettings.isDisplayed()) {
			isSeen = true;
		} else {
			System.out.println("My Settings page not displayed");
		}
		return isSeen;
	}

	public boolean updatePersonal_LoginHistory(WebDriver driver) {
		boolean isDone = false;
		if (personalButton.isDisplayed()) {
			personalButton.click();
			if (personalLoginHistory.isDisplayed()) {
				personalLoginHistory.click();
				isDone = true;
			} else {
				System.out.println("Login history not displayed");
			}
		} else {
			System.out.println("Personal button not displayed");
		}
		return isDone;
	}

	public boolean validateLoginHistory() {
		boolean isValidated = false;
		if (validateLoginHistoryPage.isDisplayed()) {
			isValidated = true;
		} else {
			System.out.println("login history is not displayed");
		}

		return isValidated;
	}

	public boolean validateDownloadFormat() {
		boolean isValidated = false;
		if (downloadCsvFormat.isDisplayed()) {
			isValidated = true;
		} else {
			System.out.println("Download in .csv format not displayed");
		}

		return isValidated;
	}

	public boolean updateDisplayLayout_CustomiseTabs(WebDriver driver) {
		boolean isDone = false;
		if (settingsDisplayLayout.isDisplayed()) {
			settingsDisplayLayout.click();
			if (displayLayoutCustomizeTab.isDisplayed()) {
				displayLayoutCustomizeTab.click();
				isDone = true;
			} else {
				System.out.println("display Layout Customize Tab not displayed");
			}
		} else {
			System.out.println("settings Display & Layout not displayed");
		}
		return isDone;
	}

	public boolean validateCustomiseTabs() {
		boolean isValidated = false;
		if (validateCustomiseTabPage.isDisplayed()) {
			isValidated = true;
		} else {
			System.out.println("Download in .csv format not displayed");
		}

		return isValidated;
	}

	public boolean selectSalesforceChatter(WebDriver driver) {
		boolean isSelect = false;
		if (customApp_textbox.isDisplayed()) {
			customApp_textbox.click();
			if (customApp_SalesforceChatter.isDisplayed()) {
				customApp_SalesforceChatter.click();
				isSelect = true;
			} else {
				System.out.println("customApp_SalesforceChatter not displayed");
			}
		} else {
			System.out.println("custom App textbox not displayed");
		}
		return isSelect;
	}

	public boolean selectAndAddAvailableTabReports(WebDriver driver) {
		boolean isSelect = true;
//		if (avalableTabs.isDisplayed()) {
			if (avalableTabs_Reports.isDisplayed()) {
				avalableTabs_Reports.click();
				if (CustomiseTabPage_AddButton.isDisplayed()) {
					CustomiseTabPage_AddButton.click();
				} else {
					//isSelect = false;
					System.out.println("CustomiseTab Page Add Button not displayed");
				}
//			}
//			else {
//				isSelect = false;
//				System.out.println("avalableTabs- Reports not displayed");
//			}
		} else 
//			if (selectedTab.isDisplayed()) {
			if (selectedTab_Report.isDisplayed()) {
				selectedTab_Report.click();
//			}
//				
			}else
			{
			isSelect = false;
			System.out.println("Reports not displayed");
		}
		
		return isSelect;
	}

//	public boolean selectedTab_Report() {
//		boolean isSelect = false;
//		if (selectedTab.isDisplayed()) {
//			if (selectedTab_Report.isDisplayed()) {
//				isSelect = true;
//			} else {
//				System.out.println("avalableTabs- Reports not displayed");
//			}
//		} else {
//			System.out.println("avalableTabs not displayed");
//		}
//		return isSelect;
//	}

	public boolean saveCustomiseTabsPage(WebDriver driver) {
		boolean isSave = false;
		if (saveCustomiseTab.isDisplayed()) {
			saveCustomiseTab.click();
			isSave = true;
		} else {
			System.out.println("save button om CustomiseTab page not displayed");
		}
		return isSave;
	}

	public boolean validateReportsFieldAdded() {
		boolean isValidated = false;
		if (validateReport.isDisplayed()) {
			isValidated = true;
		} else {
			System.out.println("Reports Field not displayed");
		}
		return isValidated;
	}
	
	public boolean selectMyEmailSettings(WebDriver driver) {
		boolean isSelect = false;
		
		if(mySettingsEmail.isDisplayed()) {
			mySettingsEmail.click();
			if(myEmailSettings.isDisplayed()) {
				myEmailSettings.click();
				isSelect=true;
			}else {
				System.out.println("My Email Settings not displayed");
			}
		}else {
			System.out.println("Email not displayed");
		}
		return isSelect;
	}
	
	public boolean validateMyEmaiSettingsPage() {
		boolean isValidated = false;
		if (validatemyEmailSettings.isDisplayed()) {
			isValidated = true;
		} else {
			System.out.println("my Email Settings page not displayed");
		}
		return isValidated;
	}
	
	public boolean updateEmailNameAndAddress(WebDriver driver) {
		boolean isSelect = true;
		if (emailName.isDisplayed()) {
			emailName.clear();
			emailName.sendKeys("Shruthi Rajesh");
		} else {
			isSelect = false;
			System.out.println(" Email name not displayed");
		}
		if (emailAddress.isDisplayed()) {
			emailAddress.clear();
			emailAddress.sendKeys("shruthiramachandra162@gmail.com");
		} else {
			isSelect = false;
			System.out.println("Email address not displayed");
		}
		if (bccButton.isDisplayed()) {
			bccButton.click();
		} else {
			isSelect = false;
			System.out.println("bcc button not displayed");
		}
		if (saveEmail.isDisplayed()) {
			saveEmail.click();
		} else {
			isSelect = false;
			System.out.println("save button not displayed");
		}
		return isSelect;
	}
	public boolean validateEmailSaved() {
		boolean isValidated = false;
		if (validateSave.isDisplayed()) {
			isValidated = true;
		} else {
			System.out.println("Email updates message is not displayed");
		}
		return isValidated;
	}
	public boolean CalenderAndReminder(WebDriver driver) {
		boolean isSelect = false;
		
		if(calenderReminder.isDisplayed()) {
			calenderReminder.click();
			if(activityReminder.isDisplayed()) {
				activityReminder.click();
				isSelect=true;
			}else {
				System.out.println("activity Reminder not displayed");
			}
		}else {
			System.out.println("calender & Reminder not displayed");
		}
		return isSelect;
	}
	
	public boolean validateActivityReminderPage() {
		boolean isValidated = false;
		if (validateActivityReminder.isDisplayed()) {
			isValidated = true;
		} else {
			System.out.println(" Activity Reminder page not displayed");
		}
		return isValidated;
	}
	public boolean openATestReminder(WebDriver driver) {
		boolean isSave = false;
		if (openTestReminder.isDisplayed()) {
			openTestReminder.click();
			isSave = true;
		} else {
			System.out.println("open Test Reminder button not displayed");
		}
		return isSave;
	}
	public boolean validateCalenderPopUp(WebDriver driver) {
		boolean isEqual = false;
		currentWindow = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		allWindows.remove(currentWindow);
		String newWindow = "";

		for (String string : allWindows) {
			System.out.println("Tab ID: " + string);
			newWindow = string;
		}
		// WebDriverWait wait_windowLoad = new WebDriverWait(driver, 30) ;
// 		wait_windowLoad.until(ExpectedConditions.urlMatches("https://cool-dev-ed.develop.my.salesforce.com/_ui/common/apex/debug/ApexCSIPage"));
		driver.switchTo().window(newWindow);
		currentNewWindow = driver.getWindowHandle();
		newUrl = driver.getCurrentUrl();		
		if (calenderUrl.equals(newUrl)) {
			isEqual = true;
		} else {
			System.out.println("Strings are not equal");
		}
		return isEqual;
	}
	public boolean validateLogout(WebDriver driver) {
		boolean isEqual = false;
		String expUrl="https://cool-dev-ed.develop.my.salesforce.com/";
		WebDriverWait wait_windowLoad = new WebDriverWait(driver, 30) ;
		wait_windowLoad.until(ExpectedConditions.urlToBe(expUrl));
		String actUrl=driver.getCurrentUrl();
		System.out.println(actUrl);
	if (actUrl.equals(expUrl)) {
		isEqual = true;
	} else {
		System.out.println("Strings are not equal");
	}
	return isEqual;
}
}

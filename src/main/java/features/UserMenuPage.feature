Feature: Usermenu page funtionality
 
Background:
Given Launch app with valid username and password

  Scenario: TC05 User menu dropdown
    Then Check for user menu 
    When click on user menu
    Then Drop down with My profile,My Settings,Developer Console,Logout ,Switching to lightning Experience is displayed and validate the dropdown list

    Scenario: TC06 My Profile functionality
    When Click My profile option from user menu
    Then User profile page should be displayed
    When Check for the edit button next to contact text on the page and click the edit button
    Then Edit profile pop up window is displayed with contact and About tabs to edit
    When Click on About tab
    And enter or edit Lastname 
    And click on save all button
    Then User Profile Page with changed lastname should be displayed
    When Click on Post link
    And Enter text to post in the post text area
    And click on share button
    Then Text entered should be displayed on the page
    When Click on the  file link 
    And click on upload a file from computer button
    And select a file to be uploaded 
    And click on share button
    Then Selected file should be posted
    When Hover the mouse on myprofilephoto image add photo link appears,Click on the link to upload a photo
    And Click on Choose file button and select the image to upload. Crop the photo to fit the image.
    Then Uploaded photo should appear on the image
    
    Scenario: TC07 MySettings Functionality
    When Select My Settings option from user menu list
    Then My Settings page is displayed
    When Click on personal link and select Login History link.
    Then Login history is displayed and the data is downloaded in .csv format.
    When Click on Display & Layout link and select Customize My Tabs link. Select "Salesforce Chatter" option from custom App: drop down. Select Reports tab from Available Tabs list. Click on >(Add) button. 
    Then Reports field is added to Selected Tabs list and also added in the links available in top of salesforce page and sales force chatter page and sales and marketing pages.
    When Provide EmailName in Email Name field, EmailAddress in Email Address field, Select automatic BCC radio button and click on save button
    Then given details are saved as default mail options and My settings page is displayed.
    When Click on Calendar & Remainders link and click on Activity Remainders link. On Remainders page click on Open a test Remainder button.
    Then Sample event pop window is dispayed.
    
    
    Scenario: TC08 Developer Console functionality
    When Select DeveloperConsole option from user menu list
    Then Developer console window should be displayed
    When click on close button on developer console
    Then Developer console window should be closed
    
      Scenario: TC09 Logout Functionality
    When Select Logout option from user menu list
    Then Logout  of current sales force application and login page is displayed.
    
    
     

    
    
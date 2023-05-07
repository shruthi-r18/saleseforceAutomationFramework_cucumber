Feature: Login features

Background:                
Given User launches Login Page
 
Scenario: Testing login functionality

When You enter username and password
When The login button is clicked
Then Home page is displayed
 

Scenario Outline: Testing login functionality with parameters

When enter "<username>" and "<password>"
And click remember me button
When The login button is clicked
Then Home page is displayed
When logout is clicked
Then login page should be displayed
And  Valid username should be displayed
 

Examples:
|username|password|
|shru@cool.com|QA1automation|

Scenario: Test login functionality with clear password

When Enter username and clear password
And The login button is clicked
Then enter password error message should be displayed

Scenario: Test login functionality with invalid credentials

When You enter invalid username and  password
And The login button is clicked
Then Enter valid credentials error message should be displayed

Scenario: Test login functionality for forgot password

When You enter username 
And The Forgot password button is clicked
Then Reset password page should be displayed


Feature: Application Behavior

@RegTest
Scenario: Home page Login
Given Initialize Chrome browser 
And Navigate to "http://automationpractice.com/index.php"
Then User login into application with "skywalker@hotmail.com" and "123456@"
Then Verify that user is successfully logged in
Then Logout from the main page
And Close the browser

@SmokeTest
Scenario: Home page Login with wrong email
Given Initialize Chrome browser 
And Navigate to "http://automationpractice.com/index.php"
Then User login into application with "skywaker@hotmail.com" and "123456@"
Then Verify that authentication failed
And Close the browser

@SmokeTest
Scenario: Home page Login with wrong password
Given Initialize Chrome browser 
And Navigate to "http://automationpractice.com/index.php"
Then User login into application with "skywa'ker@hotmail.com" and "1256@"
Then Verify that authentication failed
And Close the browser

@SmokeTest @RegTest
Scenario: Home page Login with wrong email and password
Given Initialize Chrome browser 
And Navigate to "http://automationpractice.com/index.php"
Then User login into application with "skywaker@hotmail.com" and "1236@"
Then Verify that authentication failed
And Close the browser
Feature: Searching Items and Printing Text on Links



Background: Open the url
Given Initialize chrome browser
And Land into "http://automationpractice.com/index.php"


Scenario Outline: Validate links are present on the page by printing the text on links
Given User sign into the application with <Username> and <Password>
When Verify user successful logged in
Then User on the search box enter "T-SHIRT"
And Cards displayed are "true"
And User print the number of links on the page
Then user print the text on the links in the page
Then SignOut from the main page
And Dismiss the browser

Examples:
|Username |Password |
|skywalker@hotmail.com |123456@ |
Feature: Application Behavior


Scenario: Home purchase products
Given Initialize Chrome browser 
And Navigate to "http://automationpractice.com/index.php"
Then User login into application with "camerdiaz@gmail.com" and "1234@"
Then Verify that user is successfully logged in
And Click on the main page select dress add to the cart continue shopping 
And Click on the main page select chiffon dress add to the cart
Then Procced to checkout 
And Agree with terms and conditions
Then Logout from the main page
And Close the browser

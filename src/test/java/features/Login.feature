Feature: Application Behavior


Scenario: Home page dafult login
Given User is on landing page
When User login into the application with username and password
Then Add some products to the cart
And Purchase the items

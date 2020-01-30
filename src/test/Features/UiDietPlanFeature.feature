Feature: Testing of diet plan web application.

Scenario: Diet Plan web page is loaded sucessfully.

Given User navigate to DietPlan website
Then Diet Plan page should load sucessfully.


Scenario: Search diet plan web page with food item.

Given User enters food item in search box
When User enters "chicken"
Then DataTable should populate












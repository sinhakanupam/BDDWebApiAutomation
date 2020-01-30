Feature: API Testing of diet plan web application.

Scenario Outline: Diet Plan Food API.

Given Get request is created
When Form parameter with value is "<data>" and request is sent
Then Validate response contains record with description having substring as data.

Examples:
|data|
|Fat, chicken|
|anupam|








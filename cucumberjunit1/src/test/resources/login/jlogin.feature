Feature:Test guru99
1)valid data
2)invalid data
Scenario Outline: Testing login functionality with valid and invalid data
Background:
Given i should go to login page
@PositiveTesting
Scenario: to test the login functionality
Given i should go to login page
When Enter username "<user>"
And Enter password "<pass>"
Then click on submit button
Examples:
|user|pass|
|user|user|
|admin|admin|
@NegativeTesting
Scenario: to test the login functionality
Given i should go to login page
When Enter username "<user1>"
And Enter password "<pass1>"
Then click on submit button
Examples:
|user1|pass1|
|user@|admin$|
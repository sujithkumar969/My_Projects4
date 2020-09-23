Feature: loginpage

Scenario: user enter valid data

Given user is given the valid "https://www.amazon.in" and click on signbutton
When user enter valid "sujithkumar969@gmail.com" and click on continue button
And user enter valid "a7259318108a" and click on login button
Then user should be successfully login to the application
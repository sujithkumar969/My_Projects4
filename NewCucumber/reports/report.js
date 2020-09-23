$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/My_Projects/Work_Space_03/newcucumber/src/login.feature");
formatter.feature({
  "name": "loginpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user enter valid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is given the valid \"https://www.amazon.in\" and click on signbutton",
  "keyword": "Given "
});
formatter.match({
  "location": "Scripts.user_is_given_the_valid_URL_and_click_on_signbutton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid \"sujithkumar969@gmail.com\" and click on continue button",
  "keyword": "When "
});
formatter.match({
  "location": "Scripts.user_enter_valid_user_name_and_click_on_continue_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid \"a7259318108a\" and click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Scripts.user_enter_valid_a_a_and_click_on_login_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be successfully login to the application",
  "keyword": "Then "
});
formatter.match({
  "location": "Scripts.user_should_be_successfully_login_to_the_application()"
});
formatter.result({
  "status": "passed"
});
});
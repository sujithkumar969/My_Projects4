package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import Pom.Loginpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scripts  { 
	public WebDriver driver;                 //to import all packages:- ctrl + shift + o//
	
	@Given("^user is given the valid \"([^\"]*)\" and click on signbutton$")
	public void user_is_given_the_valid_URL_and_click_on_signbutton(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\automation tool\\\\Selenium Softwares(new)\\\\drivers\\\\chromedriver 2.35\\\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(url);
		Loginpage l=new Loginpage(driver);
		l.signbbtntn();
		
	}

	@When("^user enter valid \"([^\"]*)\" and click on continue button$")
	public void user_enter_valid_user_name_and_click_on_continue_button(String un) {
		Loginpage l=new Loginpage(driver);
		l.emailTextBox(un);
		l.continueButton();	
	}
	
	@And("^user enter valid \"([^\"]*)\" and click on login button$")
	public void user_enter_valid_a_a_and_click_on_login_button(String pwd) {
		Loginpage l=new Loginpage(driver);
		l.passwordTextBox(pwd);
		l.loginButton();
	}

	@Then("^user should be successfully login to the application$")
	public void user_should_be_successfully_login_to_the_application() {
		Reporter.log("user in lkogin",true);
	  
	}



}

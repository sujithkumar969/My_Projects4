package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(xpath="//span[.='Hello. Sign in']")
	private WebElement signbtn;
	
	@FindBy(id="ap_email")
	private WebElement eleEmailTextBox;
	
	@FindBy(id="continue")
	private WebElement eleContinueButton;
	
	@FindBy(id="ap_password")
	private WebElement elePasswordTextBox;
	
	@FindBy(id="signInSubmit")
	private WebElement eleLoginButton;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void signbbtntn()
	{
		signbtn.click();
	}
	
	public void emailTextBox(String email) {
		
		eleEmailTextBox.sendKeys(email);
	}
	
	public void continueButton() {
		
		eleContinueButton.click();
	}
	
	public void passwordTextBox(String password) {
		
		elePasswordTextBox.sendKeys(password);
	}
	
	public void loginButton() {
		
		eleLoginButton.click();
	}

}

	


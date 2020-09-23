/**
 * 
 */
package com.companyname.scripts;

import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.companyname.genericlib.BaseTest;
import com.companyname.genericlib.DataDriven;
import com.companyname.genericlib.DriverUtils;
import com.companyname.pages.OHRMLoginPage;
import com.companyname.pages.OHRMdashBoardPage;

/**
 * @author S SUJITH KUMAR
 *
 */
public class Login extends BaseTest {
	
	String excelFilePath = "E:\\My_Projects\\Work_Space_04\\01_19_HybridFrameWork\\dataEngine\\TestData.xlsx";
	String sheetName = "loginPage";
	
	@DataProvider(name="loginCredentials")
	public Object[][] loginCredentials() {
		Object[][] data = DataDriven.testData(excelFilePath, sheetName);
		return data;
	}		
	
	@Test(dataProvider="loginCredentials")
	public void testLogin(String userName, String passWord) throws InterruptedException {
		OHRMLoginPage login = new OHRMLoginPage(driver);
		login.enterUserName(userName);
		login.enterPassword(passWord);
		login.clickOnLoginButton();
		
		OHRMdashBoardPage dashBoard = new OHRMdashBoardPage(driver);
		dashBoard.validateDashboardText(driver, "Dashboard", "Dashboard text is validated");
		dashBoard.clickOnWelcomeLink();
		dashBoard.clickOnLogoutLink(driver);
		
	}

}

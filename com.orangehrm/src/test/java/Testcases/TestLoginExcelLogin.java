
package Testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;

import Helper.Base;
import Helper.ExcelRead;
import PageObject.Loginpage;
//import io.cucumber.core.gherkin.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.junit.Assume

public class TestLoginExcelLogin extends Base {

	Loginpage loginPage;
	//ExcelRead read;
	//private loginPage loginpage=new loginPage(DriverFactory.getDriver())
	/*
	@Before(value ="@Skip", order=0)
	public void skip_scenario(Scenario scenario)
	{
		System.out.print("SKIPPED SCENARIO :"+ scenario.getName());
		//Assume.assumeTrue(false);
		
	}
	*/

	@Given("Open a new page in the browser.")
	public void open_a_new_page_in_the_browser() {
		super.setup();
		loginPage = new Loginpage(driver);
		
	}

	@When("Navigate to {string}")
	public void navigate_to(String url) throws MalformedURLException {
		super.openUrl(url);
	}

	/*@Then("Fill in the account details user {string} password {string} in the login screen.")
	public void fill_in_the_account_details_user_password_in_the_login_screen(String username, String password)
			throws InterruptedException {
		this.loginPage.enterGUsername(username);
		this.loginPage.enterGPassword(password);
	}
	*/
	
	@Then("Fill in the account details user {string} password {int} in the login screen.") 
	public void fill_in_the_account_details_user_password_in_the_login_screen(String sheetName, Integer RowNumber) throws DataFormatException,IOException {
	    // Write code here that turns the phrase above into concrete actions
	   
	    ExcelRead read = new ExcelRead(driver);
	  	List<Map<String,String>> testData= read.getData("New XLS Worksheet.xls", sheetName);
		System.out.println("testData: " + testData);
		String Username= testData.get(RowNumber).get("Username");
		String Password= testData.get(RowNumber).get("Password");
		System.out.println("Username: " + Username + ", Password: " + Password);
		loginPage.enterGUsername(Username);
		loginPage.enterGPassword(Password);
	 
	 
	 
	  
	}


	@Then("Click on Login button")
	public void click_on_Login_button() {
		this.loginPage.clickonLoginButton();
	}

	@After
	public void close() {

		try {
			driver.quit();
		} catch (Exception e) {

		}
	}

}


package TestcasesMobileResponsive;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Helper.Base;
import Helper.MobBase;
import PageObject.Loginpage;
import PageObject.MobileResponsiveSettingspage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
//import helper.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

//import helper.TestUtil;

public class TestProfileSettings extends MobBase {

	static MobileResponsiveSettingspage pagestep1;

	public TestProfileSettings() throws IOException {
		super();
	}

	@Given("^Open on mobile Chrome Browser and launch the application$")
	public void open_the_Crome_Browser_and_launch_the_application() {
	
		initialization();
		pagestep1	= new MobileResponsiveSettingspage(driver);
		System.out.println("Chrome Browser launch successfully");
	}
	
	

	@When("^Enter on mobile Firstname \"(.*)\" and Lastname \"(.*)\" Address \"(.*)\" DOB \"(.*)\" Email \"(.*)\" State \"(.*)\" City \"(.*)\" ZipCode \"(.*)\" MobNum \"(.*)\" WebDescription \"(.*)\"$")
	public void Enter_the_Username_and_Password(String inputFirstname, String inputLastname, String inputAddress, String inputDOB, String inputEmail, String inputState, String inputCity, String inputZipCode, String inputMobNum, String inputWebDescription) throws InterruptedException, ParseException {
	
	    //MobBase.initialization1(Responsive);
		pagestep1.Enterfirstname(inputFirstname);
		//Thread.sleep(1000);
		pagestep1.Enterlastname(inputLastname);
		//Thread.sleep(1000);
		pagestep1.Enterdbo(inputDOB);
		//Thread.sleep(1000);
		pagestep1.Enteraddress(inputAddress);
		//Thread.sleep(1000);
		pagestep1.Entercity(inputCity);
		//Thread.sleep(1000);
		pagestep1.Enterstate(inputState);
		//Thread.sleep(1000);
		pagestep1.EnterZipcode(inputZipCode);
		//Thread.sleep(1000);
		pagestep1.Entermobnumber(inputMobNum);
		//Thread.sleep(1000);
		pagestep1.Enteremail(inputEmail);
		//Thread.sleep(1000);
		pagestep1.EnterwebsiteDescription(inputWebDescription);
		//Thread.sleep(1000);

		
		
		
		
		pagestep1.ClickonSubmitbutton();
		Thread.sleep(1000);
		pagestep1.SuccessMsg();
		Thread.sleep(1000);
		//pagestep1.checkSpecialCharecterNotAllowed(inputMobNum,inputFirstname,inputLastname,inputAddress,inputCity,inputState,inputZipCode);
		//Thread.sleep(1000);
		pagestep1.checkValidationFirstName(inputFirstname);
		pagestep1.checkValidationLastName(inputLastname);
		pagestep1.validateDoBNegativeScenarios(inputDOB);
		pagestep1.validateAddressScenarios(inputAddress);
		pagestep1.validateCityScenarios(inputCity);
		pagestep1.validateStateScenarios(inputState);
		pagestep1.validateZipScenarios(inputZipCode);
		pagestep1.checkSpecialCharecterNotAllowed(inputMobNum);
		Thread.sleep(1000);
		
		//pagestep1.validateMobileNumberScenarios(MobNum);
		System.out.println("Registered user successfully login into the admin panel");
		try
		{
		
	     Assert.assertEquals(driver.getCurrentUrl(), "https://derivfe.github.io/qa-test/settings");
         Thread.sleep(3000);
		}
     catch (Exception ex)
     {
         System.out.print(ex.getMessage());
     }
     System.out.println("AssertNotEquals Test Passed\n");
	}
	

	
	@Then("Observe the landing page for any responsive issue and verify the profile setting form")
	public void Observe_the_landing_page_for_any_responsive_issue_and_verify_the_profile_setting_form() {
		
	    //Verified page in previous step itself.
	
	}
	
	@After
	public void close() {
		try {
			driver.quit();
			System.out.println("Browser Closed Successfully");
		} catch (Exception e) {
			
		}
	}
	
		
}

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
import io.cucumber.java.en.And;
//import helper.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

//import helper.TestUtil;

public class TestSecuritySettings extends MobBase {

	static MobileResponsiveSettingspage mpagestep1;

	public TestSecuritySettings() throws IOException {
		super();
		mpagestep1 = new MobileResponsiveSettingspage(driver);
	}

	@When("^Enter on mobile Newpassword \"(.*)\" and Repeatpassword \"(.*)\" humannumber \"(.*)\"$")
	public void Enter_the_Username_and_Password(String Newpassword, String Repeatpassword, String humannumber)
			throws InterruptedException, ParseException {

		// MobBase.initialization1(Responsive);
		mpagestep1.clicksecurityMenuTab();
		Thread.sleep(1000);
		mpagestep1.enterNewPassword(Newpassword);
		Thread.sleep(1000);
		mpagestep1.enterrepeatNewPassword(Repeatpassword);
		Thread.sleep(1000);
		mpagestep1.enterverifyurhuman(humannumber);
		Thread.sleep(1000);
		mpagestep1.clickonupdatepasswordbutton();
		Thread.sleep(1000);
		mpagestep1.SuccessMsgChangepassword();
		Thread.sleep(1000);
	}

	@Then("Observe the landing page for any responsive issue and verify the Security setting form")
	public void Observe_the_landing_page_for_any_responsive_issue_and_verify_the_Security_setting_form() {

		// Write code here that turns the phrase above into concrete actions
		driver.quit();
		System.out.println("Browser Closed Successfully");

	}

}

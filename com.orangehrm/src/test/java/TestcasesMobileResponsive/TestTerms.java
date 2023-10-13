
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

public class TestTerms extends MobBase {

	static MobileResponsiveSettingspage mmpagestep1;

	public TestTerms() throws IOException {
		super();
		mmpagestep1 = new MobileResponsiveSettingspage(driver);
	}

	@When("^Enter on mobile TermsName \"(.*)\" and TermsEmail \"(.*)\" TermsPhone \"(.*)\" TermsMsg \"(.*)\"$")
	public void Enter_the_Username_and_Password(String TermsName, String TermsEmail, String TermsPhone, String TermsMsg)
			throws InterruptedException, ParseException {

		// MobBase.initialization1(Responsive);

		mmpagestep1.clickonterms();
		Thread.sleep(1000);
		mmpagestep1.sendtermsname(TermsName);
		Thread.sleep(1000);
		mmpagestep1.sendtermsemail(TermsEmail);
		Thread.sleep(1000);
		mmpagestep1.sendtermsphone(TermsPhone);
		Thread.sleep(1000);
		mmpagestep1.sendMessage(TermsMsg);
		Thread.sleep(1000);
		mmpagestep1.clickbuttonSend();

	}

	@Then("Observe the landing page for any responsive issue and verify the Terms setting form")
	public void Observe_the_landing_page_for_any_responsive_issue_and_verify_the_Terms_setting_form() {

		// Write code here that turns the phrase above into concrete actions
		driver.quit();
		System.out.println("Browser Closed Successfully");

	}

}

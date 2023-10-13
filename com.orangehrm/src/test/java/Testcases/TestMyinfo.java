
package Testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Predicate;
import Helper.Base;
import PageObject.Loginpage;
import PageObject.Myinfopage;
//import helper.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
//import pages.MyInfoPage;
//import helper.TestUtil;
//import pages.LoginPage;

public class TestMyinfo extends Base {

	Myinfopage myInfoPage;
	// DashboardMyinfo d;

	@Given("^From the admin panel, click on the My Info at the sidebar menu$")
	public void From_the_admin_panel_click_on_the_My_Info_at_the_sidebar_menu() {

		this.myInfoPage = new Myinfopage(driver);
		// initialization();
		// this.loginPage = new LoginPage(super.driver);
		// this.myInfoPage = new Myinfopage(super.driver);
		// this.loginPage.clickMyInfoMenuItem();
		// myInfoPage = new DashboardMyinfo();
		// Myinfopage myInfoPage =new Myinfopage(driver);

		//

		System.out.println("Chrome Browser launch successfully");
	}

	// @Given("From the admin panel, click on the My Info at the sidebar menu")
//	public void from_the_admin_panel_click_on_the_My_Info_at_the_sidebar_menu() throws InterruptedException {
	// Write code here that turns the phrase above into concrete actions

	// this.loginPage.clickMyInfoMenuItem();

//	}

	@When("Verify the My Info page is fully loaded")
	public void verify_the_My_Info_page_is_fully_loaded() throws MalformedURLException, InterruptedException {

		try {
			this.myInfoPage.ClickMyinfomenu();
			// String URL=Assert.assertEquals(driver.getCurrentUrl(),
			// "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			Thread.sleep(3002);
			// driver.navigate().to(driver.getCurrentUrl());
			// SystemThen.out.println("Page load started at : " + startTime.toString());

			System.out.println("Navigating to the URL");
			Instant endTime = Instant.now();
			System.out.println("Page load ended at : " + endTime.toString());

			StopWatch pageLoad = new StopWatch();
			pageLoad.start();
			long p = pageLoad.getStartTime();
			Duration duration = Duration.between(Instant.now(), endTime);
			System.out.println("Total PageLoad time : " + duration.toMillis() + " milli seconds");
		} finally {
			// driver.quit();
			System.out.println("page load is completed");
		}
	}

	@Then("Verify Date of Birth field is filled in")
	public void verify_Date_of_Birth_field_is_filled_in() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		String value = myInfoPage.checkIfDateOfBirthElementIsPresent();
		if (value != null) {
			System.out.println("DOB value is published");
		} else {
			System.out.println("DOB value is NOT published");
		}
	}

	@Then("Update the Date of Birth to any date ExpectedDOB {string}")
	public void update_the_Date_of_Birth_to_any_date(String expectedDOB) throws InterruptedException {

		// Write code here that turns the phrase above into concrete actions
		System.out.println("it is new one" + expectedDOB);
		myInfoPage.updateDOB(expectedDOB);

	}

	@Then("Click on the Save button")
	public void click_on_the_Save_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		myInfoPage.clickSavebutton();
		System.out.println("My Info page should be updated with your latest selected date of birth..");
	}

	@Then("Verfiy DOB updated value {string}")
	public void verify_dob_updated_value(String expectedDoB) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		String value = myInfoPage.checkIfDateOfBirthElementIsPresent();
		Assert.assertEquals(expectedDoB, value);
	}

}

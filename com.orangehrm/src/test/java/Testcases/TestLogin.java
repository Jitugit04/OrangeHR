
package Testcases;

import java.net.MalformedURLException;

import Helper.Base;
import PageObject.Loginpage;
import io.cucumber.java.After;
//import helper.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin extends Base {

	Loginpage loginPage;

	@Given("Open a new page in the browser.")
	public void open_a_new_page_in_the_browser() {
		super.setup();
		loginPage = new Loginpage(driver);
	}

	@When("Navigate to {string}")
	public void navigate_to(String url) throws MalformedURLException {
		super.openUrl(url);
	}

	@Then("Fill in the account details user {string} password {string} in the login screen.")
	public void fill_in_the_account_details_user_password_in_the_login_screen(String username, String password)
			throws InterruptedException {
		this.loginPage.enterGUsername(username);
		this.loginPage.enterGPassword(password);
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


package Testcases;


import java.io.IOException;
import java.net.MalformedURLException;
import Helper.Base;
import PageObject.Loginpage;
import PageObject.Logoutpage;
//import helper.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pages.MyInfoPage;
//import helper.TestUtil;
//import pages.LoginPage;
import junit.framework.Assert;

public class TestLogout extends Base {
	
	
	Logoutpage   logout ;
	 //DashboardMyinfo d;
	
	public TestLogout() throws IOException
		{
			super();
					}
	
	
	@When("From the admin panel, click on the top right dropdown of Profile")
	public void From_the_admin_panel_click_on_the_top_right_dropdown_of_Profile() throws MalformedURLException, InterruptedException {

		this.logout = new Logoutpage(driver);
		this.logout.ClickAccountSectionDropDownn();
		      
		   }

	@Then("Click on the Logout button")
	public void Click_on_the_Logout_button()throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		this.logout.ClickonLogoutmenutabb();
		/*
		 * try { Assert.assertEquals(driver.getCurrentUrl(),
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * Thread.sleep(3000); } catch (Exception ex) {
		 * System.out.print(ex.getMessage()); }
		 * System.out.println("AssertNotEquals Test Passed\n"); System.out.
		 * println("Expected Result: Login page would be shown again to indicate a successful logout."
		 * );
		 */
     
	}
		
		
		
	
	}

	
		




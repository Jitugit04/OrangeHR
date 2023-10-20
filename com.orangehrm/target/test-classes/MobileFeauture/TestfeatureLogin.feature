@Browser
Feature:  Web Automation Login, fill info and logout	
  
 Scenario: Verification of Login button with numbers of credential 
     
    Given Open a new page in the browser.
    When Navigate to "https://opensource-demo.orangehrmlive.com/"
    Then Fill in the account details user "admin" password "admin123" in the login screen.
    Then Click on Login button

 Scenario: Verify My Info Page When User should already be logged into the admin panel 

    Given Open a new page in the browser.
    When Navigate to "https://opensource-demo.orangehrmlive.com/"
    Then Fill in the account details user "admin" password "admin123" in the login screen.
    Then Click on Login button
    
    When From the admin panel, click on the My Info at the sidebar menu
    When Verify the My Info page is fully loaded
    And Verify Date of Birth field is filled in
    And Update the Date of Birth to any date ExpectedDOB "1981-11-04" 
    Then Click on the Save button
    Then Verfiy DOB updated value "1981-11-04"

 Scenario: Logout User should be able to logout from the admin panel. Preconditions:

    Given Open a new page in the browser.
    When Navigate to "https://opensource-demo.orangehrmlive.com/"
    Then Fill in the account details user "admin" password "admin123" in the login screen.
    Then Click on Login button
    
    Then From the admin panel, click on the top right dropdown of Profile
    Then Click on the Logout button

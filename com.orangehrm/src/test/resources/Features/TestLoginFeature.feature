@Browser
Feature:  Web Automation Login, fill info and logout	
  
 Scenario Outline: Verification of Login button with numbers of credential 
     
    Given Open a new page in the browser.
    When Navigate to "https://opensource-demo.orangehrmlive.com/"
    Then Fill in the account details user "<SheetName>" password <RowNumber> in the login screen.
    Then Click on Login button
    
 Examples:
    |SheetName|RowNumber|
    |New XLS Worksheet|0|
    |New XLS Worksheet|1|
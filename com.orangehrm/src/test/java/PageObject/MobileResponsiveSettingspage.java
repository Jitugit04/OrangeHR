package PageObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobileResponsiveSettingspage {

	WebDriver driver;

	public MobileResponsiveSettingspage(WebDriver driver)

	{
		this.driver = driver;

	}

	// Profile Settings
	private By fname = By.xpath("//*[@id=\"fname\"]");
	private By lname = By.xpath("//*[@id=\"lname\"]");
	private By dob = By.xpath("//*[@id=\"dob\"]");
	private By address = By.xpath("//*[@id=\"address\"]");
	private By city = By.xpath("//*[@id=\"city\"]");
	private By state = By.xpath("//*[@id=\"state\"]");
	private By mobnumber = By.xpath("//*[@id=\"tel\"]");

	private By zipcode = By.xpath("//*[@id=\"zip\"]");
	private By email = By.xpath("//*[@id=\"email\"]");
	private By websiteDecriptionRichtextbox = By.xpath("//*[@id=\"website\"]");
	private By Submitbutton = By.xpath("//*[@id=\"btn-submit-profile\"]");
	private By SuccessfulMsg = By.xpath("//*[@id=\"profile-form-msg\"]");
	private By ZipCodeErrorMsgXpath = By.xpath("//*[@id=\"profile-form-msg\"]");
	private By SuccessfulMsgChangePassword = By.xpath("//*[@id=\"change-password-form-msg\"]");

	// private By Error = By.xpath("//*[@id=\"profile-form-msg\"]");

	// Security Settings
	private By clicksecurityMenuTab = By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/ul/li[2]/a");
	private By enternewPassword = By.xpath("//*[@id=\"password\"]");
	private By enterRepeatNewPassword = By.xpath("//*[@id=\"repeat\"]");
	private By verifyUrHuman = By.xpath("//*[@id=\"number\"]");
	private By clickonUpdatepasswordbutton = By.xpath("//*[@id=\"change-password-form\"]/div/div/button");
	private By AllRightsReservertext = By.xpath("//*[@id=\"root\"]/div/div/footer/span[1]");
	private By Termslink = By.xpath("//*[@id=\"root\"]/div/div/footer/span[2]/a");

	// Terms Page
	private By Termsname = By.xpath("//*[@id=\"name\"]");
	private By TermsEmail = By.xpath("//*[@id=\"email\"]");
	private By TermsPhone = By.xpath("//*[@id=\"phone\"]");
	private By MessageRichTextbox = By.xpath("//*[@id=\"message\"]");
	private By buttonSend = By.xpath("//*[@id=\"contactForm\"]/div[6]/div/button");
	private By SuccessMsgonbuttonSend = By.xpath("//*[@id=\"success\"]");

	public void Enterfirstname(String Firstname) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(fname).sendKeys(Firstname);
		// Thread.sleep(2000);

	}

	public void Enterlastname(String Lastname) throws InterruptedException {

		driver.findElement(lname).sendKeys(Lastname);
		// Thread.sleep(2000);

	}

	public void Enterdbo(String DOB) throws InterruptedException {

		// Thread.sleep(2000);
		driver.findElement(dob).sendKeys(DOB);
		// Thread.sleep(2000);

	}

	public void Entermobnumber(String MobNum) throws InterruptedException {

		// Thread.sleep(2000);
		driver.findElement(mobnumber).sendKeys(MobNum);
		// Thread.sleep(2000);

	}

	public void EnterZipcode(String ZipCode) throws InterruptedException {

		// Thread.sleep(2000);
		driver.findElement(zipcode).sendKeys(ZipCode);
		// Thread.sleep(2000);

	}

	public void Enteraddress(String Address) throws InterruptedException {

		driver.findElement(address).sendKeys(Address);
		// Thread.sleep(2000);

	}

	public void Entercity(String City) throws InterruptedException {
		// Thread.sleep(2000);
		driver.findElement(city).sendKeys(City);
		// Thread.sleep(2000);

	}

	public void Enterstate(String State) throws InterruptedException {
		driver.findElement(state).sendKeys(State);
		// Thread.sleep(2000);

	}

	public void Enteremail(String Email) throws InterruptedException {

		driver.findElement(email).sendKeys(Email);
		// Thread.sleep(2000);

	}

	public void EnterwebsiteDescription(String WebDescription) throws InterruptedException {

		driver.findElement(websiteDecriptionRichtextbox).sendKeys(WebDescription);
		// Thread.sleep(2000);

	}

	public void ClickonSubmitbutton() throws InterruptedException {
		// Thread.sleep(10000);
		driver.findElement(Submitbutton).click();
		Thread.sleep(10000);

	}

	/*
	 * public void validateMobileNumber(String inputMobileNumber) throws
	 * ParseException {
	 * 
	 * // Locating firstname web element WebElement MobilenumberInputbox =
	 * driver.findElement(mobnumber);
	 * 
	 * /***************** Way 1
	 ********************************/
	/*
	 * // Type more than 11 characters as max limit is defined as 10 as per
	 * requirement MobilenumberInputbox.sendKeys("0950955586277777");
	 * 
	 * // Get the typed value String typedValue =
	 * MobilenumberInputbox.getAttribute("value");
	 * 
	 * // Get the length of typed value int size = typedValue.length();
	 * 
	 * // Assert with expected if (size == 10) {
	 * System.out.println("Max character functionality is working fine."); }
	 * 
	 * else { System.out.println("No limit is set."); }
	 * 
	 * }
	 */
	public void SuccessMsg() throws InterruptedException {
		// Thread.sleep(10000);
		WebElement MSG = driver.findElement(SuccessfulMsg);
		String Message = MSG.getText();
		Thread.sleep(1000);
		System.out.println("Message   : " + Message);
		// return;
	}

	public void SuccessMsgChangepassword() throws InterruptedException {

		Thread.sleep(10000);
		WebElement MSG = driver.findElement(SuccessfulMsgChangePassword);
		String Message = MSG.getText();
		Thread.sleep(1000);

		System.out.println("Message   : " + Message);
		// return;

	}

	public void clicksecurityMenuTab() throws InterruptedException {

		// Thread.sleep(10000);
		driver.findElement(clicksecurityMenuTab).click();
		Thread.sleep(10000);

	}

	public void enterNewPassword(String enterNewPassword) throws InterruptedException {
		// Thread.sleep(2000);
		driver.findElement(enternewPassword).sendKeys(enterNewPassword);
		// Thread.sleep(2000);

	}

	public void enterrepeatNewPassword(String enterrepeatNewPassword) throws InterruptedException {
		driver.findElement(enterRepeatNewPassword).sendKeys(enterrepeatNewPassword);
		// Thread.sleep(2000);

	}

	public void enterverifyurhuman(String enterverifyurhuman) throws InterruptedException {
		// Thread.sleep(2000);
		driver.findElement(verifyUrHuman).sendKeys(enterverifyurhuman);
		// Thread.sleep(2000);

	}

	public void clickonupdatepasswordbutton() throws InterruptedException {

		Thread.sleep(10000);
		driver.findElement(clickonUpdatepasswordbutton).click();
		Thread.sleep(10000);

		String newpasswordErrorMessage = driver.findElement(By.id("password")).getAttribute("validationMessage");
		System.out.println("passwordError  :" + newpasswordErrorMessage);

		String repeatNewpasswordErrorMessage = driver.findElement(By.id("repeat")).getAttribute("validationMessage");
		System.out.println("repeatpasswordError  :" + repeatNewpasswordErrorMessage);

		String humanErrorMessage = driver.findElement(By.id("number")).getAttribute("validationMessage");
		System.out.println("humanMessageError  :" + humanErrorMessage);

	}

	public void checkValidationFirstName(String inputFirstName) throws InterruptedException {
		String Firstnamemessage = driver.findElement(By.id("fname")).getAttribute("validationMessage");
		System.out.println("FirstnameError  :" + Firstnamemessage);
		System.out.println("inputFirstName  : " + inputFirstName);

		// Assert with expected
		if (inputFirstName == null || inputFirstName.trim().isEmpty()) {
			Assert.assertNotEquals("Validation should be failed for Firstname not provided", "", Firstnamemessage);
		} else {

			// String regex = "[`~!@#$%^&*()\\\\]\\\\[+={}/|:;\\\"\\'<>,.?-_][0-9]";
			String regex = "^[a-zA-Z]+$";
			System.out.println("inputFirstName  : " + inputFirstName);
			if (inputFirstName.trim().matches(regex)) {
				System.out.println("valid");

			} else {
				System.out.println("Invalid character in first Name field");
				Assert.assertNotEquals("Validation should be failed for first Name has non-alphabetic Charecter", "",
						Firstnamemessage);
			}

		}
	}

	public void checkValidationLastName(String inputLastName) throws InterruptedException {
		String Lastnamemessage = driver.findElement(By.id("lname")).getAttribute("validationMessage");
		System.out.println("LastnameError  : " + Lastnamemessage);
		System.out.println("inputLastName  : " + inputLastName);
		// Assert with expected
		if (inputLastName == null || inputLastName.trim().isEmpty()) {
			Assert.assertNotEquals("Validation should be failed for Lastname not provided", "", Lastnamemessage);
		} else {

			// String regex = "[`~!@#$%^&*()\\\\]\\\\[+={}/|:;\\\"\\'<>,.?-_][0-9]";
			String regex1 = "^[a-zA-Z]+$";
			// String regex = "/^[a-zA-Z0-9]+$/";
			Pattern pattern1 = Pattern.compile(regex1);
			Matcher m1 = pattern1.matcher(inputLastName);
			if (m1.matches()) {
				System.out.println("valid");
			} else {

				System.out.println("Invalid character in Last Name field");
				Assert.assertNotEquals("Validation should be failed for Last Name has non-alphabetic Charecter", "",
						Lastnamemessage);
			}

		}
	}

	public void validateDoBNegativeScenarios(String inputDoB) throws ParseException {
		String dobmessage = driver.findElement(By.id("dob")).getAttribute("validationMessage");
		System.out.println("DobError  : " + dobmessage);
		System.out.println("inputDoB  : " + inputDoB);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		if (inputDoB == null || inputDoB.trim().isEmpty()) {
			Assert.assertNotEquals("Validation should be failed for DOB not provided", "", dobmessage);
		} else {
			try {
				Date inputDate = sdf.parse(inputDoB);
				System.out.println("inputDate: " + sdf.format(inputDate));

				Date currentdate = new Date();
				if (inputDate.after(currentdate)) {
					Assert.assertNotEquals("Validation should be failed for DOB greater than current date", "",
							dobmessage);
				}
			} catch (ParseException e) {
				Assert.assertNotEquals("Validation should be failed for DOB not in proper format of MM/dd/yyyy", "",
						dobmessage);
			}
		}

	}

	public void validateAddressScenarios(String inputAddress) throws ParseException {
		String AddressErrormessage = driver.findElement(By.id("tel")).getAttribute("validationMessage");

		System.out.println("AddressError  : " + AddressErrormessage);
		System.out.println("inputAddress  : " + inputAddress);

		// Assert with expected
		if (inputAddress == null || inputAddress.trim().isEmpty()) {
			Assert.assertNotEquals("Validation should be failed for Address not provided", "", AddressErrormessage);
		}

	}

	public void validateCityScenarios(String inputCity) throws ParseException {
		// Assert with expected
		String citymessage = driver.findElement(By.id("city")).getAttribute("validationMessage");
		System.out.println("CityError  : " + citymessage);
		System.out.println("inputCity  : " + inputCity);
		if (inputCity == null || inputCity.trim().isEmpty()) {
			Assert.assertNotEquals("Validation should be failed for city not provided", "", citymessage);
		} else {

			String regex3 = "^[a-zA-Z]+$";
			Pattern pattern3 = Pattern.compile(regex3);
			Matcher m3 = pattern3.matcher(inputCity);
			if (!m3.matches()) {
				System.out.println("Invalid character in city field");
				Assert.assertNotEquals("Validation should be failed for city has non-alphabetic Charecter", "",
						citymessage);
			} else {
				System.out.println("valid");
			}

		}
	}

	public void validateStateScenarios(String inputState) throws ParseException {

		String statemessage = driver.findElement(By.id("state")).getAttribute("validationMessage");
		System.out.println("StateError  : " + statemessage);
		System.out.println("inputState  : " + inputState);
// Assert with expected
		if (inputState == null || inputState.trim().isEmpty()) {
			Assert.assertNotEquals("Validation should be failed for state not provided", "", statemessage);
		} else {

			String regex4 = "^[a-zA-Z]+$";
			// String regex = "/^[a-zA-Z0-9]+$/";
			Pattern pattern4 = Pattern.compile(regex4);
			Matcher m4 = pattern4.matcher(inputState);
			if (!m4.matches()) {
				System.out.println("Invalid character in state field");
				Assert.assertNotEquals("Validation should be failed for state has non-alphabetic Charecter", "",
						statemessage);
			} else {
				System.out.println("valid");
			}

		}
	}

	public void validateZipScenarios(String inputZipCode) throws ParseException {
		String ZipCodemessage = driver.findElement(By.id("zip")).getAttribute("validationMessage");
		System.out.println("ZipCodeError  : " + ZipCodemessage);
		System.out.println("inputZipCode  : " + inputZipCode);

		if (inputZipCode == null || inputZipCode.trim().isEmpty()) {
			Assert.assertNotEquals("Validation should be failed for zipcode not provided", "", ZipCodemessage);
		} else {

			String regex5 = "^[a-zA-Z]+$";
			// String regex = "/^[a-zA-Z0-9]+$/";
			Pattern pattern5 = Pattern.compile(regex5);
			Matcher m5 = pattern5.matcher(inputZipCode);
			if (m5.matches()) {
				System.out.println("Invalid character in ZipCode field");
				Assert.assertNotEquals("Validation should be failed for zipcode has non-alphabetic Charecter", "",
						ZipCodemessage);
			} else {
				System.out.println("ZipCode is valid for non-alphabets");
			}

			int size = inputZipCode.trim().replaceAll(" ", "").length();
			if (size != 6) {

				Assert.assertNotEquals("Validation should be failed for Zip Code not in 6 Digit format", "",
						ZipCodemessage);
			} else {
				System.out.println("ZipCode is valid for number of chars");
			}

			/*
			 * String ZipCodemessage1 =
			 * driver.findElement(By.id("zip")).getAttribute("value"); WebElement
			 * Value1=driver.findElement(ZipCodeErrorMsgXpath); boolean
			 * Value2=Value1.getText() != null; if(ZipCodemessage1 =="") {
			 * System.out.println("Value is Blank in Required Field"); }
			 * 
			 * else if (Value2="Please fill in the form" != null)
			 * 
			 * { System.out.println("Values is Available on Other Place"); }
			 */
		}
		int size = inputZipCode.trim().replaceAll(" ", "").length();
		if (size != 6) {

			Assert.assertNotEquals("Validation should be failed for Zip Code not in 6 Digit format", "",
					ZipCodemessage);
		} else {
			System.out.println("ZipCode is valid for number of chars");
		}

	}

	public void checkSpecialCharecterNotAllowed(String inputMobileNumber) throws InterruptedException {
		String Mobnumbermessage = driver.findElement(By.id("tel")).getAttribute("validationMessage");

		System.out.println("MobilenumberError  : " + Mobnumbermessage);
		System.out.println("inputMobileNumber  : " + inputMobileNumber);
		// Assert with expected
		if (inputMobileNumber == null || inputMobileNumber.trim().isEmpty()) {
			Assert.assertNotEquals("Validation should be failed for mobile not provided", "", Mobnumbermessage);
		} else {
			// String regex = "[`~!@#$%^&*()\\\\]\\\\[+={}/|:;\\\"\\'<>,.?-_][0-9]";
			String regex = "^[a-zA-Z]+$";
			// String regex = "/^[a-zA-Z0-9]+$/";
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(inputMobileNumber);
			if (m.matches()) {
				System.out.println("Invalid character in Mobile number field");
				Assert.assertNotEquals("Validation should be failed for Mobile number has non-alphabetic Charecter", "",
						Mobnumbermessage);
			} else {
				System.out.println("valid");
			}

			int size = inputMobileNumber.trim().replaceAll(" ", "").length();
			if (size != 11) {

				Assert.assertNotEquals("Validation should be failed for Mobile number not in 11 Digit format", "",
						Mobnumbermessage);
			} else {
				System.out.println("Mobile number is valid for number of chars");
			}

		}

	}
	// else if(inputMobileNumber.matches("(.*?0.*?){5}"))
	// {
	// Number does not pass validation
	// }

	public void verifyAllrightsReserve() {

		WebElement textofRights = driver.findElement(AllRightsReservertext);
		String Actualtext = textofRights.getText();
		Assert.assertNull("© 2017 BinaryOptions. All rights reserved.", Actualtext);

	}

	public void clickonterms() {

		WebElement textofRights = driver.findElement(Termslink);
		textofRights.click();

	}

	public void sendtermsname(String termsName) throws InterruptedException {
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[contains(@href,'viewMyDetails')]")).click();
		// driver.findElement(By.linkText("My Info")).click();
		driver.findElement(Termsname).sendKeys(termsName);
		Thread.sleep(2000);

	}

	public void sendtermsemail(String termsEmail) throws InterruptedException {
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[contains(@href,'viewMyDetails')]")).click();
		// driver.findElement(By.linkText("My Info")).click();
		driver.findElement(TermsEmail).sendKeys(termsEmail);
		Thread.sleep(2000);

	}

	public void sendtermsphone(String termsPhone) throws InterruptedException {
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[contains(@href,'viewMyDetails')]")).click();
		// driver.findElement(By.linkText("My Info")).click();
		driver.findElement(TermsPhone).sendKeys(termsPhone);
		Thread.sleep(2000);

	}

	public void sendMessage(String termsmsg) throws InterruptedException {
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[contains(@href,'viewMyDetails')]")).click();
		// driver.findElement(By.linkText("My Info")).click();
		driver.findElement(MessageRichTextbox).sendKeys(termsmsg);
		Thread.sleep(2000);

	}

	public void clickbuttonSend() throws InterruptedException {

		driver.findElement(buttonSend).click();
		Thread.sleep(2000);
		WebElement msg = driver.findElement(SuccessMsgonbuttonSend);
		String Msg1 = msg.getText();
		System.out.println("it is MSG" + Msg1);

		String nameErrordErrorMessage = driver.findElement(By.id("name")).getAttribute("validationMessage");
		System.out.println("NameError  :" + nameErrordErrorMessage);

		String emailErrorMessage = driver.findElement(By.id("email")).getAttribute("validationMessage");
		System.out.println("EmailError  :" + emailErrorMessage);
		String phoneErrorMessage = driver.findElement(By.id("phone")).getAttribute("validationMessage");
		System.out.println("PhoneError  :" + phoneErrorMessage);

		String errorMessageRichTextbox = driver.findElement(By.id("message")).getAttribute("validationMessage");
		System.out.println("MessageBoxError  :" + errorMessageRichTextbox);

		// return Msg1;

	}

	public void clickTermslink() throws InterruptedException {
		driver.findElement(Termslink).click();
		Thread.sleep(2000);

	}

}

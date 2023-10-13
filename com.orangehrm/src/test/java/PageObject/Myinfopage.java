package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Myinfopage {

	WebDriver driver;

	public Myinfopage(WebDriver driver)

	{
		this.driver = driver;

	}

	// a[contains(@href,'viewMyDetails')]
	// OwnerSite
	private By ousername = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	private By MyInfoSidebarMenu = By.xpath("//a[contains(@href,'viewMyDetails')]");
	private By opassword = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	private By LoginButton2 = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	private By buttonDOBCalender = By.xpath(
			"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/i");
	private By xpathDateOfBirth = By.xpath("//label[text()='Date of Birth']/../..//input");
	private By xpathDateOfBirth1 = By.xpath("//input[@class='oxd-input oxd-input--active']");
	private By ClickonSavebutton = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button");
	private By PopupMsg = By.xpath("//*[@id='oxd-toaster_1']");

	// https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewMyDetails
	// a[contains(.,'Google')]")).click();
	// driver.findElement(By.linkText("Google")).click();

	public String checkIfDateOfBirthElementIsPresent() {
		try {
			WebElement dateOfBirthElement = this.driver.findElement(xpathDateOfBirth);
			if (dateOfBirthElement != null) {
				System.out.println(" ##### ELEMENT FOUND ######## ");
				String value = dateOfBirthElement.getAttribute("value");
				System.out.println("Date Of Birth Value: " + value);
				if (value != null && !value.isEmpty()) {
					return value;
				}
			}
		} catch (Exception e) {
			System.out.println(" exception finding element: " + e.getMessage());
		}
		System.out.println(" ###### ELEMENT NOT FOUND #### ");
		return null;
	}

	public void ClickMyinfomenu() throws InterruptedException {
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[contains(@href,'viewMyDetails')]")).click();
		// driver.findElement(By.linkText("My Info")).click();
		driver.findElement(MyInfoSidebarMenu).click();
		Thread.sleep(2000);

	}

	public String clickSavebutton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(ClickonSavebutton).click();
		Thread.sleep(2000);
		WebElement msg = driver.findElement(PopupMsg);
		String Msg1 = msg.getText();
		System.out.println("it is MSG" + Msg1);
		return Msg1;

	}

	public String GettextboxDOB(String Actual) throws InterruptedException {
		driver.findElement(xpathDateOfBirth1).click();
		Thread.sleep(2000);

		WebElement locatorElement = driver.findElement(xpathDateOfBirth1);

		String Actual1 = locatorElement.getText();
		return Actual1;
		// return driver.findElement(xpathDateOfBirth1).getText();
	}

	public void updateDOB(String DOB) throws InterruptedException {
		// identify element
		Thread.sleep(2000);
		WebElement dobElement = driver.findElement(xpathDateOfBirth);
		dobElement.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), DOB);
		String val = dobElement.getAttribute("value");
		System.out.println("Entered text is: " + val);

	}

	/*
	 * public void clickonCalenderButton() throws InterruptedException {
	 * 
	 * 
	 * Thread.sleep(2000); driver.findElement(buttonDOBCalender).click();
	 * Thread.sleep(2000);
	 * 
	 * }
	 */

}

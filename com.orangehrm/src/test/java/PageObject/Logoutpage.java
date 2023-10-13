
package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Logoutpage {

	WebDriver driver;

	public Logoutpage(WebDriver driver)

	{
		this.driver = driver;

	}

	private By AccountSectionDropDown = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span");
	private By ClickonLogoutmenutab = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");

	public void ClickAccountSectionDropDownn() throws InterruptedException {

		driver.findElement(AccountSectionDropDown).click();
		Thread.sleep(2000);

	}

	public void ClickonLogoutmenutabb() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(ClickonLogoutmenutab).click();

	}
}
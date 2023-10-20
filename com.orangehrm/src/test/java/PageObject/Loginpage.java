package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver driver)

	{
		this.driver = driver;

	}

	// OwnerSite
	private By ousername = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	private By opassword = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	private By LoginButton2 = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	

	public void enterGUsername(String Username) {
		driver.findElement(ousername).sendKeys(Username);

	}

	public void enterGPassword(String Password) {
		driver.findElement(opassword).sendKeys(Password);
	}

	public void clickonLoginButton() {
		driver.findElement(LoginButton2).click();
	}

}

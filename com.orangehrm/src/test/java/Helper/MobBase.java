package Helper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MobBase {

	public static WebDriver driver;

	public static void initialization() {

		// String browserName="IE";
		// String browserName=System.getenv("Chrome");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		Map<String, String> devicemobmu = new HashMap<>();
		devicemobmu.put("deviceName", "Nexus 5");

		ChromeOptions chromeOpt = new ChromeOptions();
		chromeOpt.setExperimentalOption("mobileEmulation", devicemobmu);
		driver = new ChromeDriver(chromeOpt);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://derivfe.github.io/qa-test/settings");
		driver.manage().window().maximize();
		// Dimension dimension = new Dimension(1280,900);
		// driver.manage().window().setSize(dimension);

		// driver.manage().window().resize_to(1280,900);

	}

	/*
	 * 
	 * public static void initialization11() { //System.out.println("Responsive: " +
	 * Responsive); // String browserName="IE"; // String
	 * browserName=System.getenv("Chrome");
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "D:\\Automation NIIT\\MSD Automation\\Config\\chromedriver.exe"); //driver =
	 * new ChromeDriver(); //driver.manage().window().maximize(); Map<String
	 * ,String> devicemobmu =new HashMap<>();
	 * devicemobmu.put("deviceName","Galaxy Fold");
	 * 
	 * 
	 * ChromeOptions Chromeopt =new ChromeOptions();
	 * Chromeopt.setExperimentalOption("mobileEmulation", devicemobmu); driver = new
	 * ChromeDriver(Chromeopt); driver.get(
	 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 * driver.manage().window().maximize(); //Dimension dimension = new
	 * Dimension(1280,900); //driver.manage().window().setSize(dimension);
	 * 
	 * //driver.manage().window().resize_to(1280,900);
	 * 
	 * 
	 * 
	 * }
	 */
}
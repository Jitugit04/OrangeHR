
package runners;

import org.testng.annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(

		features = "src/test/resources/Features/",
		// , tags=("@Browser,BrowserDOB")
		glue = { "Testcases" }, plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true

)

public class TestRunner extends io.cucumber.testng.AbstractTestNGCucumberTests{
	@Override
	@DataProvider()
	public Object[][] scenarios()
	{
	return super.scenarios();
	
}
}
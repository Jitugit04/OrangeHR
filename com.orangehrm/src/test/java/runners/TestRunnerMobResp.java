package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/MobileFeauture/",
		// , tags=("@Browser,BrowserDOB")
		glue = { "TestcasesMobileResponsive" }, plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true

)

public class TestRunnerMobResp {
}
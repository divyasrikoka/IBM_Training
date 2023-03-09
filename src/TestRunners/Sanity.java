package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
		features= "src/Features",glue = {"stepdefinitions"},plugin = {"html:reporting/CucumberHTMLReports/Sanity",}
		)

public class Sanity {

}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.Base;

@CucumberOptions(features= {"src/test/java/feature"},
				glue= {"stepDefinition"},
				publish=true,
				monochrome=true,
				tags="@CreateLead")
public class CucumberTest extends Base {

}

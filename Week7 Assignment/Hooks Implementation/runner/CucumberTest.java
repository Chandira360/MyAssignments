package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.Base;

@CucumberOptions(features= {"src/test/java/features"},
				glue= {"stepDefinition","hooks"},
				publish=true,
				monochrome=true,
				tags="@Account")
public class CucumberTest extends AbstractTestNGCucumberTests {

}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features=  {"src/test/java/feature/SalesForce.feature"},
				 glue= {"steps"},
				 publish=true,
				 monochrome=true)
				 
public class SalesForceRunner extends AbstractTestNGCucumberTests {

}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features=  {"src/test/java/feature/StaticParam.feature"},
				 glue= {"steps"},
				 publish=true,
				 monochrome=true,
				 tags= "@staticParameter")
public class StaticParamRunner extends AbstractTestNGCucumberTests {

}

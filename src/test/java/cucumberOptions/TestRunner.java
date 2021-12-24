package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/SearchItem.feature", monochrome=true, 
		glue="stepDefinitions", plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"})

public class TestRunner {

	
}

package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
/**
 * 
 * @author Ayaz (ayazhamiya@gmail.com)
 *
 */
@CucumberOptions(features = {"src/test/resources/features"}, 
					glue={"step_defination"}, 
						plugin = { "pretty", "html:Reports/cucumber-reports" }, 
							monochrome = true)
public class BddRunner extends AbstractTestNGCucumberTests{
 
}
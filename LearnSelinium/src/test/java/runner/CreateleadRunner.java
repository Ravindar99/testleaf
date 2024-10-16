package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/feature/CreateLead.feature",glue="stepDefinition",publish=true,monochrome=true)
public class CreateleadRunner extends AbstractTestNGCucumberTests{

}

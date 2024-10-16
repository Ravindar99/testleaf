package runner;

import hooks.ProjectSPecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/feature/Login.feature",glue="stepDefinition",publish=true,monochrome=true)
public class LoginRunner extends ProjectSPecificMethod{

}

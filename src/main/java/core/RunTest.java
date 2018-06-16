package core;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"resources\\features\\" },plugin = {
"json:target/surefire-reports/cucumber.json" }, glue = { "steps.FormularioStep" }, 
monochrome = true, dryRun = false,tags = "@TESTELOGIN002")

public class RunTest {

}

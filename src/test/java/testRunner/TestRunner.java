package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Features",
glue="stepDefinition",
monochrome=true,
plugin= {"html:Reports//HTMLReports//report.html",},
dryRun=false,
tags= "@Weather"
)

public class TestRunner {

}

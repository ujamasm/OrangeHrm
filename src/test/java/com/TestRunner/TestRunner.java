package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/OrangeHrm.feature",
		glue="comStepDefination",
		dryRun=false )

public class TestRunner extends AbstractTestNGCucumberTests
{

}

package com.qa.actitime.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="E:\\Work\\javaworkspace\\ActiTimeBDDCucumber\\src\\main\\java\\com\\qa\\actitime\\FeaturesFile\\taggedhooks.feature"
		,glue= {"com\\qa\\actitime\\StepDenition"}
		,format = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"}
		,monochrome=true
		,strict=true
		//,tags = {"@smokeTest"}//This is and operation
		,dryRun=false 
		)
public class TestRunner {
	
} 

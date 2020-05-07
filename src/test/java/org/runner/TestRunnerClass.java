package org.runner;

import org.junit.runner.RunWith;				


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src//test//resources"},glue= {"com.step"},dryRun=false,monochrome=true,strict=true,tags= {"@sanity"},plugin={"html:Report","json:Report//output.json"})
public class TestRunnerClass {

}

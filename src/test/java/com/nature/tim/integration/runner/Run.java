package com.nature.tim.integration.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/User.feature"},
        plugin = {"pretty", "html:target/cucumber/htmlReport", "json:target/cucumber/report.json"},
        glue = {"com.nature.tim.integration.steps"})
public class Run {
}

package com.fuatkara.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"
    },
    features = "src/main/resources/login.feature",
    glue = "com/fuatkara/step_definitions",
    dryRun = false
)
public class CukesRunner {

}

package com.upgenix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"
    },
    features = "src/main/resources/features",
    glue = "com/upgenix/step_definitions",
    dryRun = false,
<<<<<<< HEAD
    tags = "@Calendar"
=======
    tags = "@Deneme"
>>>>>>> e560522 (Merged)
)
public class CukesRunner {



}

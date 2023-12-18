package com.quaspareparts.qa_gm3.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/quaspareparts/qa_gm3/stepdefinitions",
        tags = "@remoteUnit",
        dryRun = false
)
public class US_010_Runner {
}

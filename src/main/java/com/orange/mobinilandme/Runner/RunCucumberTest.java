package com.orange.mobinilandme.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.orange.mobinilandme.stepdefinitions",
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunCucumberTest {
}
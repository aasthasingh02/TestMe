package skeleton;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber .api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:target/cucumber.json"},
features="arget/generated-test-resources/",
strict=true,
tags="@data-driven"
)
public class Stepdefs {
	
   
}

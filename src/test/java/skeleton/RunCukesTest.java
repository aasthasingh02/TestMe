package skeleton;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber .api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"json:target/cucumber.json"},
tags="@datatable"
)
public class RunCukesTest {
	
   
}

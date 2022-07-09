package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/features", 
	glue = {"stepDefinitions"},
	monochrome=true, 
	plugin = {
			"pretty", 
			"html:target/htmlReport/report.html",
			"json:target/jsonReport/report.json",
			"junit:target/junitReport/report.xml"
			},
	tags = "@cenario2",
	publish = false,
	stepNotifications = false
)

public class RunnerTest {

}

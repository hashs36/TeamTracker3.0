package stepdef;
import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import io.cucumber.junit.Cucumber;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//@SuppressWarnings("unused")
@RunWith(Cucumber.class)
@CucumberOptions(
		features="TeamTracker/src/test/java/feature/applogin.feature",
		glue= {"TeamTracker/src/test/java/stepdef/Stepst.java"},
		dryRun=false,
		monochrome =true,
		plugin= {"pretty"}
				)
public class RunnerclassTest {}

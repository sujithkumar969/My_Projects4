package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\My_Projects\\Work_Space_03\\newcucumber\\src\\login.feature",
		glue = {"StepDefinition"},
		//plugin = {"pretty","html:E:\\My_Projects\\Work_Space_03\\newcucumber\\reports"}
		plugin = {"pretty","json:E:\\My_Projects\\Work_Space_03\\newcucumber\\reports\\suji.json"}
		)

public class Run {

}

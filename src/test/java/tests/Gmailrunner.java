package tests;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features={"E:\\selenium1\\bddgmail\\src\\test\\resources\\features\\feature1.feature","E:\\selenium1\\bddgmail\\src\\test\\resources\\features\\feature2.feature"},
					plugin={"pretty","html:target"},
					monochrome=true)
	public class Gmailrunner
	{
	
	}

package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"StepDefinition"})	
public class test {

}

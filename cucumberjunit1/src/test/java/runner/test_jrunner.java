package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import io.cucumber.*;
//import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(features={"src/test/resources/login/login.feature"},glue= {"defination_cucu"},tags="@PositiveTesting",plugin= {"pretty"})
public class test_jrunner {

}




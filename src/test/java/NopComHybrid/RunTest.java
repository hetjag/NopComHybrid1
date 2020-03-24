package NopComHybrid;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", tags = "@changeCurrency",
         monochrome = true,
         plugin = {"pretty","html:target/Destination/cucumber-html-report"})
public class RunTest {
}

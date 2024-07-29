package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/features/Category"},
        glue = {"stepdefinition.Category", "project.com.hooks"},
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)

@Test
public class RunCategoryTests extends AbstractTestNGCucumberTests {

}
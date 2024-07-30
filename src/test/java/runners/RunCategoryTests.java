package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/features/Category"},
        glue = {"project.com.hooks",
                "stepdefinition.common",
                "stepdefinition.Category",
        },
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)

@Test
public class RunCategoryTests extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }
}
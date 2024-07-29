package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/features/Login"}, // dấu / tượng trưng cho foder
        glue = {"stepdefinition.login", "project.com.hooks"}, // chỉ hiểu dấu chấm - dấu . tương trưng cho packet
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)

@Test
public class RunCucumberTests extends AbstractTestNGCucumberTests {

}
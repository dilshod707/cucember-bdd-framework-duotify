package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
//        tags = "redirect",
        features = "/Users/Dave/IdeaProjects/cucember-bdd-framework-duotify/src/test/resources/login.feature",
        glue = "stepDefinitions"
)

@RunWith(Cucumber.class)
public class CucumberRunner {
}
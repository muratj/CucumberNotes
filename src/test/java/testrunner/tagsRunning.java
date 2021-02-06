package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/tagsPractice.feature"},
        glue = {"steps"},
        plugin = {"pretty"},
        tags = "@Smoke or @Regression"
//        tags = "@Smoke and @SomeUS"
//        tags = "@All"
//        tags = "@Smoke"
)

public class tagsRunning {
}

package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/dryrun.feature"},
        glue = {"steps"},
        plugin = {"pretty"},
        dryRun = true
)

public class DryRun {
}

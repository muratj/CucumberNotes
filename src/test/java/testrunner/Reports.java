package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/example.feature"},
        glue = {"steps"},
        plugin = {"pretty",
//                "json:target/test-reports/report.json",
//                "junit:target/test-reports/report.xml"
        },
        publish = true
)

public class Reports {
}

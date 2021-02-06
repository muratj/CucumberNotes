package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class HooksPractice {
    @Before
    public void setup(Scenario sc) {
        System.out.println("before method");
        System.out.println(sc.getName());
    }
    @After
    public void tearDown() {
        System.out.println("after method");
    }


    @Given("Hooks implemented on the steps definition class")
    public void hooks_implemented_on_the_steps_definition_class() {
        System.out.println("Given Scenario1");
    }

    @When("We want to write Before and After Scenario actions")
    public void we_want_to_write_before_and_after_scenario_actions() {
        System.out.println("Given Scenario2");
    }

    @Then("Actions will implement")
    public void actions_will_implement() {
        System.out.println("Given Scenario3");
    }

}

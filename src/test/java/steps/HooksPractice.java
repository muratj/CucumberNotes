package steps;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class HooksPractice {

    @Before("@Tag")
    public void setup(Scenario sc) {
        System.out.println("before method");
        System.out.println(sc.getName());
    }
    @Before
    public void setup2() {
        System.out.println("before2 method");
    }
    @After(order = 1)
    public void tearDown() {
        System.out.println("after method");
    }
    @After(order = 2)
    public void tearDown2() {
        System.out.println("after2 method");
    }




// Step definition of feature file
    @Given("Hooks implemented on the steps definition class")
    public void hooks_implemented_on_the_steps_definition_class() {
        System.out.println("Given Scenario1");
    }

    @When("We want to write Before and After Scenario actions")
    public void we_want_to_write_before_and_after_scenario_actions() {
        System.out.println("Given Scenario1");
    }

    @Then("Actions will implement")
    public void actions_will_implement() {
        System.out.println("Given Scenario1");
    }

}

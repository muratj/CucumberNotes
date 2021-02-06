package steps;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class HooksPractice {

    @Before("@Hook and @Tag")
    public void setup(Scenario sc) {
        System.out.println("before method");
        System.out.println(sc.getName());
    }
    @Before("@Hook")
    public void setup2() {
        System.out.println("before2 method");
    }
    @After("@Hook")
    public void tearDown() {
        System.out.println("after method");
    }
    @After("@Hook")
    public void tearDown2() {
        System.out.println("after2 method");
    }
    @BeforeStep("@Hook")
    public void screenshot() {
        System.out.println("Screenshot before every step");
    }
    @AfterStep("@Hook")
    public void reload() {
        System.out.println("Reload after every step");
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

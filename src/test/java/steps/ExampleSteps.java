package steps;

import io.cucumber.java.en.*;

public class ExampleSteps {

    @Given("Example given")
    public void example_given() {
        System.out.println("Example given");
    }

    @When("Example when")
    public void example_when() {
        System.out.println("Example when");
    }

    @Then("Example then")
    public void example_then() {
        System.out.println("Example then");
    }

}

package steps;

import io.cucumber.java.en.*;

public class BackgroundPractice {

    @Given("Common given for all scenarios")
    public void common_given_for_all_scenarios() {
        System.out.println("Common given");
    }

    @When("Common next step")
    public void common_next_step() {
        System.out.println("Common when");
    }

    @Then("This result expected")
    public void this_result_expected() {
        System.out.println("Common then");
    }

    @When("Goes after background for only scenario1")
    public void goes_after_background_for_only_scenario1() {
        System.out.println("when scenario1");
    }

    @Then("Result of the scenario for only scenario1")
    public void result_of_the_scenario_for_only_scenario1() {
        System.out.println("then scenario1");
    }

    @When("Goes after background for only scenario2")
    public void goes_after_background_for_only_scenario2() {
        System.out.println("when scenario2");
    }

    @Then("Result of the scenario for only scenario2")
    public void result_of_the_scenario_for_only_scenario2() {
        System.out.println("then scenario2");
    }

    @When("Goes after background for only scenario3")
    public void goes_after_background_for_only_scenario3() {
        System.out.println("when scenario3");
    }

    @Then("Result of the scenario for only scenario3")
    public void result_of_the_scenario_for_only_scenario3() {
        System.out.println("then scenario3");
    }

}

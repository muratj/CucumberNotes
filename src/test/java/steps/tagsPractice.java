package steps;

import io.cucumber.java.en.*;

public class tagsPractice {

    @Given("I am on feature file")
    public void i_am_on_feature_file() {
    }

    @When("I want to run my code with groups")
    public void i_want_to_run_my_code_with_groups() {
    }

    @Then("I have to use @GroupName annotation")
    public void i_have_to_use_group_name_annotation() {
    }

    @Then("We can call them from testRunner class or terminal")
    public void we_can_call_them_from_test_runner_class_or_terminal() {
    }

    @Given("Some given {int}")
    public void some_given(int i) {
        System.out.println("given from "+i+" scenario");
    }

    @When("Some when {int}")
    public void some_when(int i) {
        System.out.println("when from "+i+" scenario");
    }

    @Then("Some then {int}")
    public void some_then(int i) {
        System.out.println("then from "+i+" scenario");
    }

}

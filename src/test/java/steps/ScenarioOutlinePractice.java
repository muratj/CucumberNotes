package steps;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

public class ScenarioOutlinePractice {
    // Feature 1
    @Given("Login page")
    public void login_page() {
    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {
        System.out.println("username = "+username);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {
        System.out.println("password = " + password);
    }

    @When("Clicks Login button")
    public void clicks_login_button() {
    }

    @Then("Error message should be displayed")
    public void error_message_should_be_displayed() {
    }

    // Feature 2

    int num1, num2, result;

    @Given("Calculator page")
    public void calculator_page() {
    }

    @When("user enters first number as {int}")
    public void user_enters_first_number_as(Integer num1) {
        this.num1 = num1;
    }

    @When("user enters second number as {int}")
    public void user_enters_second_number_as(Integer num2) {
        this.num2 = num2;
    }

    @Then("result should be {int}")
    public void result_should_be(Integer result) {
        this.result = num1 + num2;
        System.out.println("expected " + result);
        System.out.println("actual " + this.result);

        assertEquals(this.result, (int) result);
    }

}

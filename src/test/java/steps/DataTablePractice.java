package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTablePractice {
    @Given("Some registration page")
    public void some_registration_page() {
        System.out.println("Registration page");
    }

    @When("User enters following user details")
    public void user_enters_following_user_details(DataTable data) {
        List<List<String>> dataList = data.asLists(String.class);
        dataList.forEach(System.out::println);
    }

    @Then("User registration should be successful")
    public void user_registration_should_be_successful() {
        System.out.println("registration successfully");
    }
}

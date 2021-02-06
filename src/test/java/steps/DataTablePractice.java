package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

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

    @When("User enters following user details with columns")
    public void user_enters_following_user_details_with_columns(DataTable dataTable) {
        List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

//        users.forEach(System.out::println);

        users.forEach(e -> {
            System.out.print("|\t" + e.get("firstname"));
            System.out.print("\t|\t" + e.get("lastname"));
            System.out.print("\t|\t" + e.get("year"));
            System.out.print("\t|\t" + e.get("phone") + "\t|" );
            System.out.println();
        });
    }

    @Then("User registration should be successful")
    public void user_registration_should_be_successful() {
        System.out.println("registration successfully");
    }
}

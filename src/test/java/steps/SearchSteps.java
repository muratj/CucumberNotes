package steps;

import io.cucumber.java.en.*;

public class SearchSteps {
    @Given("I am on the Amazon main page search field")
    public void i_am_on_amazon_main_page_search_field() {
        System.out.println("I am on the Amazon main page search field");
    }

    // Cucumber expression
    @When("I search for a product with {string} and price {int}")
    public void i_search_for_a_product_with_and_price(String productName, Integer price) {
        System.out.println("Searching for the '" + productName + "' with price " + price);
    }


    // Regular expression
//    @When("^I search for a product with \"([^\"]+)\" and price (\\d+)$")
//    public void i_search_for_a_product_with_and_price(String productName, Integer price) {
//        System.out.println("Searching for the '" + productName + "' with price " + price);
//    }

    @Then("Search results should be displayed")
    public void search_results_should_be_displayed() {
        System.out.println("Search results are  displayed");
    }
}

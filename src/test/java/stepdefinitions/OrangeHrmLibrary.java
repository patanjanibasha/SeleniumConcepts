package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class OrangeHrmLibrary {

    @Given("I open the browser with url {string}")
    public void open_browser_with_url(String url) {
        // Implement the logic to open the browser and navigate to the URL
    }

    @Then("I should see the login page")
    public void should_see_login_page() {
        // Implement the logic to verify that the login page is displayed
    }

    @When("I enter username as {string}")
    public void enter_username(String username) {
        // Implement the logic to enter the username
    }

    @When("I enter password as {string}")
    public void enter_password(String password) {
        // Implement the logic to enter the password
    }

    @When("I click the login button")
    public void click_login_button() {
        // Implement the logic to click the login button
    }

    @Then("I should see the admin module")
    public void should_see_admin_module() {
        // Implement the logic to verify the admin module is visible
    }

    @When("I click the logout button")
    public void click_logout_button() {
        // Implement the logic to click the logout button
    }
}

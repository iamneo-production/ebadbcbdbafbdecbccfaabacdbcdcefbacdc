package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {

    @Given("the user is on the Home page")
    public void userIsOnHomePage() {
        // Code to navigate to the Home page
    }

    @Given("the user navigates to the Login page")
    public void userNavigatesToLoginPage() {
        // Code to navigate to the Login page
    }

    @When("the user enters username and password")
    public void userEntersUsernameAndPassword() {
        // Code to enter username and password
    }

    @Then("the successful login message is displayed with text:")
    public void successfulLoginMessageIsDisplayed(String message) {
        // Code to verify the successful login message
    }
}

}

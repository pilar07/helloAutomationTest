package web.wiki.steps.functional;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import web.wiki.steps.serenity.functional.HomeSubSteps;
import web.wiki.steps.serenity.functional.LoginSubSteps;

/**
 * Created by pilar07 on 2020-03-20.
 */
public class LoginFeatureSteps {

    @Steps
    HomeSubSteps homeSteps;

    @Steps
    LoginSubSteps loginSteps;

    @Given("Usuario navega hasta la página home")
    public void userIsOnHomePage() {
        homeSteps.open_home_page();
        homeSteps.request_login();
    }

    @Then("Usuario (.*) requiere login")
    public void userRequestsLogin(String usuario) {
        loginSteps.enter_user(usuario);
        loginSteps.enter_password("1234567ocho");
        loginSteps.request_to_access();
    }

}

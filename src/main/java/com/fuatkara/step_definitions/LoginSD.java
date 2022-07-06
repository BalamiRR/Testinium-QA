package com.fuatkara.step_definitions;

import com.fuatkara.pages.LoginP;
import com.fuatkara.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSD {

    LoginP login = new LoginP();

    @Given("User is on the upgenix login page")
    public void user_is_on_the_upgenix_login_page() {
        String expectedTitle = "Login | Best solution for startups";
        String actualTitle = Driver.getDriver().getTitle();
        //String url = ConfigurationReader.getProperty("web.table.url");

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("User enters {string} username")
    public void user_enters_username(String username) {
        login.inputEmail.sendKeys(username);
    }

    @When("User enters {string} password")
    public void user_enters_password(String password) {
        login.inputPassword.sendKeys(password);
    }

    @When("User clicks the login button")
    public void user_clicks_the_login_button() {
        login.button.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

    }

}

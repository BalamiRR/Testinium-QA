package com.upgenix.step_definitions;

import com.upgenix.pages.LogOutP;
import com.upgenix.pages.LoginP;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LogOutSD {

    LoginP loginP = new LoginP();
    LogOutP logOutP = new LogOutP();
    @Given("User is on the upgenix logout page")
    public void user_is_on_the_upgenix_logout_page() {
        String expectedPage = "Odoo";
        String actualPage = loginP.dashboard.getText();

        Assert.assertEquals(expectedPage, actualPage);
    }
    @Then("User clicks the account icon and then click Log out option")
    public void user_clicks_the_account_icon_and_then_click_log_out_option() {
        loginP.dashboard.click();
        logOutP.logOutButton.click();

        Assert.assertEquals("Odoo", loginP.dashboard.getText());

    }
}

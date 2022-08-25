package com.upgenix.step_definitions;

import com.upgenix.pages.SessionP;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.When;

public class Session {

    SessionP session = new SessionP();

    @When("User login to test other features")
    public void user_login_to_test_other_features() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        session.inputLogin.sendKeys(ConfigurationReader.getProperty("username"));
        session.inputPass.sendKeys(ConfigurationReader.getProperty("password"));
        session.loginButton.click();
    }
}

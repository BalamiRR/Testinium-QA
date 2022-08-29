package com.testinium.step_definitions;

import com.testinium.pages.LoginP;
import com.testinium.utilities.ConfigurationReader;
import com.testinium.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSD {

    LoginP loginP = new LoginP();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);

    @Given("User is on the upgenix login page")
    public void user_is_on_the_upgenix_login_page() {
        //String expectedTitle = "Login | Best solution for startups";
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }

    @When("User enters {string} username")
    public void user_enters_username(String username) {
        loginP.inputEmail.sendKeys(username);
    }

    @When("User enters {string} password")
    public void user_enters_password(String password) {
        loginP.inputPassword.sendKeys(password);
    }

    @When("User clicks the login button")
    public void user_clicks_the_login_button() {
        loginP.button.click();
    }

    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {
        wait.until(ExpectedConditions.visibilityOf(loginP.dashboard));
        String expectedDashboard = "Odoo";
        String actualDashboard = Driver.getDriver().getTitle();
        Assert.assertEquals("The title is not same as the expected! ", expectedDashboard, actualDashboard);
    }

    @Then("User sees error message")
    public void user_sees_error_message() {
        Assert.assertTrue(loginP.alertErrorMessage.isDisplayed());
    }

    @Then("User sees {string} message")
    public void user_sees_please_fill_out_this_field_message(String alertMessage) {
        String expectedMessage = Driver.getDriver().findElement(By.name("login")).getAttribute("validationMessage");
        Assert.assertEquals(expectedMessage, alertMessage);
    }

    @Then("User should see the password in bullet signs")
    public void user_should_see_the_password_in_bullet_signs() {
        Assert.assertTrue(loginP.bulletPass.getAttribute("type").equals("password"));
    }

    @When("User clicks the enter button")
    public void user_clicks_the_enter_button() {
        loginP.button.click();
    }
}

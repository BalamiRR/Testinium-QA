package com.upgenix.step_definitions;

import com.upgenix.pages.LoginP;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class LoginSD {

    LoginP loginP = new LoginP();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);

    @Given("User is on the upgenix login page")
    public void user_is_on_the_upgenix_login_page() {
        String expectedTitle = "Login | Best solution for startups";
        //String url = ConfigurationReader.getProperty("web.table.url");
        //Driver.getDriver().get(url);
        Assert.assertTrue(Driver.getDriver().getTitle().equals(expectedTitle));
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

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        wait.until(ExpectedConditions.visibilityOf(loginP.dashboard));
//        String expectedElement = "SalesManager";
//        //String actualElement = loginP.dashboard.getAttribute("span");
//        String actualElement = loginP.dashboard.getText();
//
//        //Assert.assertEquals("They are the same ! ", expectedElement,actualElement);
//        Assert.assertTrue((loginP.dashboard.getText()).equals(expectedElement));

//        Set<String> allWindow = Driver.getDriver().getWindowHandles();
//
//        for(String each : allWindow){
//            Driver.getDriver().switchTo().window(each);
//            System.out.println("Current title : " + Driver.getDriver().getTitle());
//        }
//
//        String expectedDashboard = "#Inbox - Odoo";
//        String actualDashboard = Driver.getDriver().getTitle();


        String expectedDashboard = Driver.getDriver().getCurrentUrl();
        String actualDashboard = "https://qa.upgenix.net/web?";

        Assert.assertEquals("Evertying is NOT OK ! ", expectedDashboard, actualDashboard);
    }

}

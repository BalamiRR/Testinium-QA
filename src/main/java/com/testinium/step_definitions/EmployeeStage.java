package com.testinium.step_definitions;

import com.testinium.pages.EmployeeP;
import com.testinium.utilities.ConfigurationReader;
import com.testinium.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeeStage {
    EmployeeP employeePage = new EmployeeP();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);

    @When("User is on upgenix login page")
    public void user_is_on_upgenix_login_page() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }

    @When("User is on the dashboard")
    public void user_is_on_the_dashboard() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        employeePage.login();
    }

    @When("User clicks Employees stage")
    public void user_clicks_employees_stage() {
        employeePage.emplStage.click();
        wait.until(ExpectedConditions.titleIs(ConfigurationReader.getProperty("EmplTitle")));
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Employees - Odoo"));
    }

    @When("User clicks Challenges stage")
    public void user_clicks_challenges_stage() {
        employeePage.badgesBtn.click();
        wait.until(ExpectedConditions.visibilityOf(employeePage.badgesBtn));
        employeePage.challengesBtn.click();
        wait.until(ExpectedConditions.visibilityOf(employeePage.challengesBtn));
        employeePage.goalsHistoryBtn.click();
        wait.until(ExpectedConditions.visibilityOf(employeePage.goalsHistoryBtn));
    }

    @When("User clicks Departments stage")
    public void user_clicks_departments_stage() throws InterruptedException {
        employeePage.departmentsBtn.click();
        Thread.sleep(7000);
    }
    @Then("User should see the last stage title")
    public void user_should_see_the_last_stage_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Departments - Odoo"));
        //String act = Driver.getDriver().getTitle();
        //String exp = "Departments - Odoo";
        //Assert.assertEquals(exp,act);
    }

    @When("User is on the employees dashboard")
    public void user_is_on_the_employees_dashboard() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        employeePage.login();
        Thread.sleep(3000);
        employeePage.emplStage.click();
    }

    @When("User creates new employees {string} in the Employees stage")
    public void user_creates_new_employees_in_the_employees_stage(String name) throws InterruptedException {
        Thread.sleep(3000);
        employeePage.createBtn.click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.titleIs("New - Odoo"));
        employeePage.employeesName.sendKeys(name);
        employeePage.savedMessage.click();
    }

    @Then("User should see the Employee created message under full profile")
    public void user_should_see_the_message_under_full_profile() {
        Assert.assertTrue(employeePage.createdMessage.isDisplayed());
        //String expected = "Employee created";
        //String actual = employeePage.createdMessage.getText();
        //Assert.assertEquals(expected,actual);
    }

    @Then("User should see listed employees in the Employees stage")
    public void user_should_see_listed_employees_in_the_employees_stage() throws InterruptedException {
        employeePage.emplStage.click();
        wait.until(ExpectedConditions.titleIs("Employees - Odoo"));
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Employees - Odoo"));
    }

    @When("User edits created employees in the Employees module")
    public void user_edits_created_employees_in_the_employees_module() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        employeePage.login();
        Thread.sleep(3000);
        employeePage.emplStage.click();
        Thread.sleep(3000);
        employeePage.chooseEmployee.click();
        employeePage.editEmployee.click();
        Thread.sleep(3000);
        employeePage.nameEdit.clear();
        employeePage.nameEdit.sendKeys("Sterling");
        Thread.sleep(3000);
        employeePage.savedMessage.click();
    }

    @Then("User should see the edited name in the Employees module")
    public void user_should_see_the_edited_name_in_the_employees_module() {
        employeePage.emplStage.click();
    }


}
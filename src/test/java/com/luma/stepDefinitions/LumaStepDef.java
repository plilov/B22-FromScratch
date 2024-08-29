package com.luma.stepDefinitions;

import com.luma.pages.CreateAccountPage;
import com.luma.pages.LumaMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class LumaStepDef {

    WebDriver driver = DriverHelper.getDriver();
    LumaMainPage lumaMainPage = new LumaMainPage(driver);
    CreateAccountPage createAccountPage = new CreateAccountPage(driver);

    @Given("user is on main page of Luma user clicks on create account button")
    public void user_is_on_main_page_of_luma_user_clicks_on_create_account_button() {
        lumaMainPage.clickOnCreateAccount();
    }
    @When("user is on create account page user enters first name name as {string} and last name as {string}")
    public void user_is_on_create_account_page_user_enters_first_name_name_as_and_last_name_as(String firstName, String lastName) {
       createAccountPage.enterFirstNameLastName(firstName, lastName);
    }
    @Then("user enters email as {string} and password as {string} and confirms password as {string}")
    public void user_enters_email_as_and_password_as_and_confirms_password_as(String email, String password, String confirmPassword) {
        createAccountPage.enterEmailPaswordConfirm(email, password, confirmPassword);
    }
    @Then("user clicks on create account button and validates success message as {string}")
    public void user_clicks_on_create_account_button_and_validates_success_message_as(String successMessage) {
        createAccountPage.clickOnCreateAccountButton(successMessage);
    }

}

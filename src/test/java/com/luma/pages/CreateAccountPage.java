package com.luma.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import javax.sql.rowset.BaseRowSet;

public class CreateAccountPage {

    private WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "#firstname")
    WebElement firstName;

    @FindBy(css = "#lastname")
    WebElement lastName;

    @FindBy(css = "#email_address")
    WebElement email;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "#password-confirmation")
    WebElement paswordConfirmation;

    @FindBy(xpath = "//button[.='Create an Account']")
    WebElement createAccountButton;

    @FindBy(xpath = "//div[@data-ui-id='message-success']")
    WebElement successMessage;

    public void enterFirstNameLastName(String firstName, String lastName){
        BrowserUtils.sendKeys(this.firstName, driver, firstName);
        BrowserUtils.sendKeys(this.lastName, driver, lastName);
    }

    public void enterEmailPaswordConfirm(String email, String password, String confirmPassword){
        BrowserUtils.sendKeys(this.email, driver, email);
        BrowserUtils.sendKeys(this.password, driver, password);
        BrowserUtils.sendKeys(this.paswordConfirmation, driver, confirmPassword);
    }

    public void clickOnCreateAccountButton(String successMessage){
        BrowserUtils.click(this.createAccountButton, driver);
        Assert.assertEquals(successMessage, BrowserUtils.getText(this.successMessage));
    }



}

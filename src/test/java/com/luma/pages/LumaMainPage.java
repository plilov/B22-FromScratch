package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LumaMainPage {

    private WebDriver driver;

    public LumaMainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[.='Create an Account']")
    WebElement createAccountLink;

    public void clickOnCreateAccount(){
        BrowserUtils.click(this.createAccountLink, driver);
    }



}

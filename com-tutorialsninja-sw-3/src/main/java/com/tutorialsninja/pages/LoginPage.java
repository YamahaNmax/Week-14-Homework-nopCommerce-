package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Login")
    WebElement login;
    @CacheLookup
    @FindBy(xpath = "//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/h2")
    WebElement returningCustomerText;
    @CacheLookup
    @FindBy(xpath = "//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2[1]")
    WebElement loginSuccess;


    public void setLogin(String Login) {
        clickOnElement(login);
    }

    public String verifyReturningCustomerText() {
        return getTextFromElement(returningCustomerText);
    }

    public void setEmail() {
        sendTextToElement(email, "codebusterm4mitz1@gmail.com");
    }

    public void setPassword() {
        sendTextToElement(password, "Codebuster@1234");
    }

    public void setContinueButton() {
        clickOnElement(continueButton);
    }

    public String verifyLoginSuccess() {
        return getTextFromElement(loginSuccess);
    }


}

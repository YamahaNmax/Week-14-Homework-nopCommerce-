package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//nav[@id='top']/div[1]/div[2]/ul/li[2]")
    WebElement accountLink;


    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement register;

    @CacheLookup
    @FindBy(linkText = "Logout")
    WebElement logout;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/h1")
    WebElement registerAccountText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/form/fieldset[1]/div[2]/div[1]/input[1]")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/form/fieldset[1]/div[3]/div[1]/input[1]")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/form/fieldset[1]/div[4]/div[1]/input[1]")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/form/fieldset[1]/div[5]/div[1]/input[1]")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/form/fieldset[2]/div[1]/div[1]/input[1]")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/form/fieldset[2]/div[2]/div[1]/input[1]")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/form/div[1]/div[1]/input[1]")
    WebElement privacyPolicy;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/form/div[1]/div[1]/input[2]")
    WebElement continueRegisterButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement successRegister;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[1]/a")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement logoutSuccess;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[1]/a")
    WebElement finalContinueButton;





    public void setAccountLink() {
        clickOnElement(accountLink);
    }

    public void setRegister(String Register) {
        clickOnElement(register);
    }

    public void setLogout(String Logout) {
        clickOnElement(logout);
    }

    public String verifyRegisterAccountText() {
        return getTextFromElement(registerAccountText);
    }

    public void setFirstName() {
        sendTextToElement(firstName, "Mit");
    }

    public void setLastName() {
        sendTextToElement(lastName, "Patel");
    }

    public void setEmail() {
        sendTextToElement(email, "codebusterm4mitz1@gmail.com");
    }

    public void setPhoneNumber() {
        sendTextToElement(phoneNumber, "0123456789");
    }

    public void setPassword() {
        sendTextToElement(password, "Codebuster@1234");
    }

    public void setConfirmPassword() {
        sendTextToElement(confirmPassword, "Codebuster@1234");
    }

    public void setPrivacyPolicy() {
        clickOnElement(privacyPolicy);
    }

    public void setContinueRegisterButton() {
        clickOnElement(continueRegisterButton);
    }

    public String verifySuccessRegister() {
        return getTextFromElement(successRegister);
    }

    public void setContinueButton() {
        clickOnElement(continueButton);
    }

    public String verifyLogoutSuccess() {
        return getTextFromElement(logoutSuccess);
    }

    public void setFinalContinueButton() {
        clickOnElement(finalContinueButton);
    }

}

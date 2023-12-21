package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-checkout']/div[1]/div[1]/h1")
    WebElement verifyCheckoutPage;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]")
    WebElement verifyNewCustomerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label/input")
    WebElement guestCheckoutButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[2]/input[1]")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[3]/input")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[4]/input")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[5]/input")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[1]/input")
    WebElement company;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[2]/input")
    WebElement add1;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[3]/input")
    WebElement add2;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[4]/input")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[5]/input")
    WebElement postCode;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[6]/select")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[7]/select")
    WebElement region;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/input")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[3]/div[2]/div[1]/p[2]/textarea")
    WebElement comments;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]")
    WebElement termsAndCon;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[2]")
    WebElement continueOfCheckout;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[1]")
    WebElement paymentWarning;


    public String setVerifyCheckoutPage() {
        return getTextFromElement(verifyCheckoutPage);
    }

    public String setVerifyNewCustomerText() {
        return getTextFromElement(verifyNewCustomerText);
    }

    public void setGuestCheckoutButton() {
        clickOnElement(guestCheckoutButton);
    }

    public void setContinueButton() {
        clickOnElement(continueButton);
    }

    public void setFirstName() {
        sendTextToElement(firstName, "Raj");
    }

    public void setLastName() {
        sendTextToElement(lastName, "Patel");
    }

    public void setEmail() {
        sendTextToElement(email, "m4mitzcodebuster@gmail.com");
    }

    public void setPhoneNumber() {
        sendTextToElement(phoneNumber, "0123456789");
    }

    public void setCompany() {
        sendTextToElement(company, "Codebuster");
    }

    public void setAdd1() {
        sendTextToElement(add1, "3, Stan Stat");
    }

    public void setAdd2() {
        sendTextToElement(add2, "london Road");
    }

    public void setCity() {
        sendTextToElement(city, "Stan");
    }

    public void setPostCode() {
        sendTextToElement(postCode, "HA7 4PD");
    }

    public void setCountry() {
        selectByVisibleTextFromDropDown(country, "United Kingdom");
    }

    public void setRegion() {
        selectByVisibleTextFromDropDown(region, "Greater London");
    }

    public void setContinueBtn() {
        clickOnElement(continueBtn);
    }

    public void setComments() {
        sendTextToElement(comments, "Please, Deliver ASAP. Thank you.!");
    }

    public void setTermsAndCon() {
        clickOnElement(termsAndCon);
    }

    public void setContinueOfCheckout() {
        clickOnElement(continueOfCheckout);
    }

    public String setPaymentWarning() {
        return getTextFromElement(paymentWarning);
    }


}



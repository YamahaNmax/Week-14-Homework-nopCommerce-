package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]/h1")
    WebElement verifyTextHPLP3065;

    @CacheLookup
    @FindBy(id = "input-option225")
    WebElement enterDate;

    @CacheLookup
    @FindBy(id = "input-quantity")
    WebElement enterQuantity;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement verifyTextPopUp;

    @CacheLookup
    @FindBy(linkText = "shopping cart")
    WebElement clickOnShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]/h1")
    WebElement verifyTextMacbook;

    @CacheLookup
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    WebElement verifySuccess;


    public String setVerifyTextHPLP3065() {
        return getTextFromElement(verifyTextHPLP3065);
    }

    public void setEnterDate(String date) {
        enterDate.clear();
        sendTextToElement(enterDate, "2022-11-30");
    }

    public void setEnterQuantity(String qty) {
        enterQuantity.clear();
        sendTextToElement(enterQuantity, "1");
    }

    public void setAddToCart() {
        clickOnElement(addToCart);
    }

    public String setVerifyTextPopUp() {
       return getTextFromElement(verifyTextPopUp);
    }

    public void setClickOnShoppingCart(){
        clickOnElement(clickOnShoppingCart);
    }

    public String setVerifyTextMacbook() {
        return getTextFromElement(verifyTextMacbook);
    }

    public String setVerifySuccess() {
        return getTextFromElement(verifySuccess);
    }


}




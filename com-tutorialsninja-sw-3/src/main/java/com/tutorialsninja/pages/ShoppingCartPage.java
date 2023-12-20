package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='breadcrumb']/li[2]/a")
    WebElement verifyTextShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[2]/A")
    WebElement verifyTextHPLP3065;

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[2]/small[1]")
    WebElement verifyDeliveryDate;

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[3]")
    WebElement verifyProductModel;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]")
    WebElement verifyTotal;


    public String setVerifyTextShoppingCart() {
        return getTextFromElement(verifyTextShoppingCart);
    }

    public String setVerifyTextHPLP3065() {
        return getTextFromElement(verifyTextHPLP3065);
    }

    public String setVerifyDeliveryDate() {
        return getTextFromElement(verifyDeliveryDate);
    }

    public String setVerifyProductModel() {
        return getTextFromElement(verifyProductModel);
    }

    public String setVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }

}






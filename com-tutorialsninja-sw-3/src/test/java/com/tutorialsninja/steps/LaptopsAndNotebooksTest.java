package com.tutorialsninja.steps;

import com.tutorialsninja.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class LaptopsAndNotebooksTest {

    @And("^I click on show all laptop and notebook$")
    public void iClickOnShowAllLaptopAndNotebook() {
        new HomePage().setShowAllDesktopsAndNotebooks();
    }

    @And("^I select product sort by Price \\(High > Low\\)$")
    public void iSelectProductSortByPriceHighLow() {
        new LaptopsAndNotebooksPage().setHighToLow();
    }

    @And("^I select product Macbook$")
    public void iSelectProductMacbook() {
        new LaptopsAndNotebooksPage().setSelectProductMacbook();
    }

    @Then("^I should navigate to MacBook product page$")
    public void iShouldNavigateToMacBookProductPage() {
        Assert.assertEquals(new ProductPage().setVerifyTextMacbook(), "MacBook", "Text Verified");
    }

    @Then("^I should see product macbook added successfully message$")
    public void iShouldSeeProductMacbookAddedSuccessfullyMessage() {
        Assert.assertEquals(new ProductPage().setVerifySuccess(), "Success: You have added MacBook to your shopping cart!\n" + "×", "Text Verified");
    }

    @And("^I should see \"([^\"]*)\" product$")
    public void iShouldSeeProduct(String productName) {
        Assert.assertEquals(new ShoppingCartPage().setVerifyTextMacbook(), productName, "Text Verified");
    }

    @And("^I change quantity \"([^\"]*)\" for product$")
    public void iChangeQuantityForProduct(String qty) {
        new ShoppingCartPage().setUpdateQty(qty);
    }

    @And("^I click on update quantity$")
    public void iClickOnUpdateQuantity() {
        new ShoppingCartPage().setUpdateButton();
        System.out.println( new ShoppingCartPage().setVerifyUpdateMessage());
    }

    @Then("^I should see cart modified message$")
    public void iShouldSeeCartModifiedMessage() {
       Assert.assertEquals( new ShoppingCartPage().setVerifyUpdateMessage(),"Success: You have modified your shopping cart!\n" + "×", "Text Verified");

    }

    @And("^I should see total price for macbook products$")
    public void iShouldSeeTotalPriceForMacbookProducts() {
        Assert.assertEquals(new ShoppingCartPage().setVerifyUpdateTotal(), "$1,204.00", "Product Total Verified");
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().setCheckoutButton();
    }

    @Then("^I should navigate to checkout page$")
    public void iShouldNavigateToCheckoutPage() {
        Assert.assertEquals(new CheckoutPage().setVerifyCheckoutPage(), "Checkout", "Text Verified");
    }

    @And("^I should see new customer text$")
    public void iShouldSeeNewCustomerText() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new CheckoutPage().setVerifyNewCustomerText(), "New Customer", "Text Verified");
    }

    @And("^I click on guest checkout button$")
    public void iClickOnGuestCheckoutButton() {
        new CheckoutPage().setGuestCheckoutButton();
    }

    @And("^I click on continue button of guest checkout page$")
    public void iClickOnContinueButtonOfGuestCheckoutPage() {
        new CheckoutPage().setContinueButton();
    }


    @And("^I enter billing details$")
    public void iEnterBillingDetails() {
        new CheckoutPage().setFirstName();
        new CheckoutPage().setLastName();
        new CheckoutPage().setEmail();
        new CheckoutPage().setPhoneNumber();
        new CheckoutPage().setCompany();
        new CheckoutPage().setAdd1();
        new CheckoutPage().setAdd2();
        new CheckoutPage().setCity();
        new CheckoutPage().setPostCode();
        new CheckoutPage().setCountry();
        new CheckoutPage().setRegion();

    }

    @And("^I click on continue after fill billing details on checkout page$")
    public void iClickOnContinueAfterFillBillingDetailsOnCheckoutPage() {
        new CheckoutPage().setContinueBtn();
    }

    @And("^I add notes to text area about product order$")
    public void iAddNotesToTextAreaAboutProductOrder() {
        new CheckoutPage().setComments();
    }

    @And("^I click checkbox of terms n condition$")
    public void iClickCheckboxOfTermsNCondition() {
        new CheckoutPage().setTermsAndCon();
    }

    @And("^I click on continue of checkout$")
    public void iClickOnContinueOfCheckout() {
        new CheckoutPage().setContinueOfCheckout();
    }

    @Then("^I should see warning message regarding Payment method$")
    public void iShouldSeeWarningMessageRegardingPaymentMethod() {
        Assert.assertEquals(new CheckoutPage().setPaymentWarning(), "Warning: No Payment options are available. Please contact us for assistance!", "Text Verified");
    }
}

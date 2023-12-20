package com.tutorialsninja.steps;

import com.tutorialsninja.pages.Desktops;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DesktopPageTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover and click on desktop tab$")
    public void iMouseHoverAndClickOnDesktopTab() {
        new HomePage().mouseHoverToDesktop();
    }

    @And("^I click on show all desktops$")
    public void iClickOnShowAllDesktops() {
        new HomePage().setShowAllDesktops();
    }

    @And("^I select product sort by Name \\(Z - A\\)$")
    public void iSelectProductSortByNameZA() {
        new Desktops().sortByPositionZtoA();
    }

    @Then("^I should see product arrange in alphabetical order successfully$")
    public void iShouldSeeProductArrangeInAlphabeticalOrderSuccessfully() {
    }

    @And("^I select product sort by Name \\(A - Z\\)$")
    public void iSelectProductSortByNameAZ() {
        new Desktops().sortByPositionAtoZ();
    }

    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String productName) {
        new Desktops().setSelectProductHPLP3065(productName);
    }

    @Then("^I should navigate to \"([^\"]*)\" product page$")
    public void iShouldNavigateToProductPage(String productName) {
        Assert.assertEquals(new ProductPage().setVerifyTextHPLP3065(), productName, "Text Verified");
    }

    @And("^I select date \"([^\"]*)\"$")
    public void iSelectDate(String date) {
        new ProductPage().setEnterDate(date);
    }

    @And("^I add quantity \"([^\"]*)\" for product$")
    public void iAddQuantityForProduct(String qty) {
        new ProductPage().setEnterQuantity(qty);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().setAddToCart();
    }

    @Then("^I should see product added successfully message$")
    public void iShouldSeeProductAddedSuccessfullyMessage() {
        Assert.assertEquals(new ProductPage().setVerifyTextPopUp(), "Success: You have added HP LP3065 to your shopping cart!\n" + "×", "Text Verified");
    }

    @And("^I click on shopping cart button$")
    public void iClickOnShoppingCartButton() {
        new ProductPage().setClickOnShoppingCart();
    }

    @Then("^I should see shopping cart text$")
    public void iShouldSeeShoppingCartText() {
        Assert.assertEquals(new ShoppingCartPage().setVerifyTextShoppingCart(), "Shopping Cart", "Text Verified");
    }

    @And("^I should see \"([^\"]*)\" product name$")
    public void iShouldSeeProductName(String productName) {
        Assert.assertEquals(new ShoppingCartPage().setVerifyTextHPLP3065(), productName, "Product Text Verified");
    }

    @And("^I should see \"([^\"]*)\" delivery date$")
    public void iShouldSeeDeliveryDate(String deliveryDate) {
        Assert.assertEquals(new ShoppingCartPage().setVerifyDeliveryDate(), "Delivery Date:"+ deliveryDate, "Delivery Date Verified");
    }

    @And("^I should see \"([^\"]*)\" model name$")
    public void iShouldSeeModelName(String productModel)  {
        Assert.assertEquals(new ShoppingCartPage().setVerifyProductModel(), productModel, "Product Model Verified");
    }

    @And("^I should see total price$")
    public void iShouldSeeTotalPrice() {
        Assert.assertEquals(new ShoppingCartPage().setVerifyTotal(), "$122.00", "Product Total Verified");
    }
}
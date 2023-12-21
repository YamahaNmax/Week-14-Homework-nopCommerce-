package com.tutorialsninja.steps;

import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyAccountTest {
    @When("^I click on my account link$")
    public void iClickOnMyAccountLink() {
        new RegisterPage().setAccountLink();
    }

    @And("^I select \"([^\"]*)\" option from account options$")
    public void iSelectOptionFromAccountOptions(String register)  {
        new RegisterPage().setRegister(register);
    }

    @Then("^I should navigate to Register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals(new RegisterPage().verifyRegisterAccountText(), "Register Account", "Text Verified");
    }

    @And("^I select \"([^\"]*)\" option from my account options$")
    public void iSelectOptionFromMyAccountOptions(String login)  {
        new LoginPage().setLogin(login);
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals(new LoginPage().verifyReturningCustomerText(), "Returning Customer", "Text Verified");
    }

    @And("^I filled all mandatory field of registration$")
    public void iFilledAllMandatoryFieldOfRegistration() {
        new RegisterPage().setFirstName();
        new RegisterPage().setLastName();
        new RegisterPage().setEmail();
        new RegisterPage().setPhoneNumber();
        new RegisterPage().setPassword();
        new RegisterPage().setConfirmPassword();
    }

    @And("^I click checkbox of privacy policy$")
    public void iClickCheckboxOfPrivacyPolicy() {
        new RegisterPage().setPrivacyPolicy();
    }

    @And("^I click on continue button of registration page$")
    public void iClickOnContinueButtonOfRegistrationPage() {
        new RegisterPage().setContinueRegisterButton();
    }

    @Then("^I should see account successfully created message$")
    public void iShouldSeeAccountSuccessfullyCreatedMessage() {
        Assert.assertEquals(new RegisterPage().verifySuccessRegister(), "Your Account Has Been Created!", "Text Verified");
    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new RegisterPage().setContinueButton();
    }

    @And("^I select \"([^\"]*)\" option from my account option$")
    public void iSelectOptionFromMyAccountOption(String logout) {
        new RegisterPage().setLogout(logout);
    }

    @Then("^I should logout successfully$")
    public void iShouldLogoutSuccessfully() {
        Assert.assertEquals(new RegisterPage().verifyLogoutSuccess(), "Account Logout", "Text Verified");
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new RegisterPage().setFinalContinueButton();
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        new LoginPage().setEmail();
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new LoginPage().setPassword();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().setContinueButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals(new LoginPage().verifyLoginSuccess(), "My Account", "Text Verified");
    }
}

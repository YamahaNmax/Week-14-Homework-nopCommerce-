Feature: Login/LogOut Test

  As a user i want to check login/logout and Register functionality of tutorial ninja website

  Background: I am on homepage of tutorial ninja website
    Given I am on homepage
    When I click on my account link

  @sanity @regression
  Scenario: User should navigate to login page successfully
    And I select "Register" option from account options
    Then I should navigate to Register page successfully

  @sanity @regression
  Scenario: User should navigate to login page successfully
    And I select "Login" option from my account options
    Then I should navigate to login page successfully

  @smoke @regression
  Scenario: User should register account successfully
    And I select "Register" option from account options
    And I filled all mandatory field of registration
    And I click checkbox of privacy policy
    And I click on continue button of registration page
    Then I should see account successfully created message
    And I click on continue
    When I click on my account link
    And I select "Logout" option from my account option
    Then I should logout successfully
    And I click on continue button

  @smoke @regression @try
  Scenario: User should login and logout successfully
    And I select "Login" option from my account options
    And I enter email
    And I enter password
    And I click on login button
    Then I should login successfully
    When I click on my account link
    And I select "Logout" option from my account option
    Then I should logout successfully
    And I click on continue button

@RegressionTest
Feature: Retail Website

  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username 'qaiss@gmail.net' and password 'Kabul003'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @Register
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website       | taxID      | paymentMethod | payeeName |
      | TEK1    | Tekschool.com | NY-7654321 | Cheque        | TekName   |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @EditRegisteration
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate information link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName  | abaNumber | swiftCode | accountName | accountNumber  |
      | chaseBank | B-123453  | C-123     | ahamdQ      | 888-999-000-44 |
    And User click on Continue button
    Then User should see a success message

  @EditAccount
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstName | lastName | email   | telephone |
      | Qais      | and      | aqa.com |      9900 |
    And User click on continue button
    Then User should see a message "Success: Your account has been successfully updated."

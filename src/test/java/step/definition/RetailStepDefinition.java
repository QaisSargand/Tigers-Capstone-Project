package step.definition;

import java.util.List;
import java.util.Map;
import org.junit.Assert;

import core.Base;
//import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {
	RetailPageObject retailPageObject = new RetailPageObject();

	@Given("User is on Retail website")
	public void user_is_on_Retail_website() {
		String expectedLogoOfRetailWebsite = "TEST ENVIRONMENT";
		String webStelogo = retailPageObject.getTheRetailWebSite();
		Assert.assertEquals(expectedLogoOfRetailWebsite, webStelogo);
		logger.info("user is on Retail Website");
		Utils.takeScreenshotForStep();

	}

	@And("User click  on MyAccount")
	public void user_click_on_MyAccount() {
		retailPageObject.clickOnMyAccount();
		logger.info("user clicked on MyAccount");

	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailPageObject.clickOnLogin();
		logger.info("user clicked on Login");
		Utils.takeScreenshotForStep();
	}

	@And("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) {
		retailPageObject.enterUserNameAndPassword("qaiss@gmail.net", "Kabul003");
		logger.info(" Email and Password were entered successfully");
		Utils.takeScreenshotForStep();
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		retailPageObject.clickOnLoginButton();
		logger.info("Login button was clicked successfully");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		retailPageObject.LoginMyAccountDashboard();
		logger.info("User should be logged in to MyAccount dashboard");
	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPageObject.clickOnRegisterForAnAffiliateAccountLink();
		logger.info("User click on Register for an Affiliate Account link");
	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> affiliateInformation = dataTable.asMaps(String.class, String.class);
		retailPageObject.writeCompanyName(affiliateInformation.get(0).get("company"));
		retailPageObject.writeWebSite(affiliateInformation.get(0).get("website"));
		retailPageObject.enterTaxID(affiliateInformation.get(0).get("taxID"));
		retailPageObject.selectpaymentMethod(affiliateInformation.get(0).get("paymentMethod"));
		retailPageObject.enterpayPalEmailAcount(affiliateInformation.get(0).get("payeeName"));
		logger.info("user filled affiliate form");
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPageObject.checkTheAboutUsBox();
		logger.info("User check on About us check box");
	}

	@And("User click on Continue button")
	public void user_click_on_continue_button() {
		retailPageObject.clickOnContinueButton();
		logger.info("User click on Continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retailPageObject.isSuccessMessagePresent();
		logger.info("User should see a success message " + " Success: Your account has been successfully updated.");
		Utils.takeScreenshotForStep();
	}

	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retailPageObject.clickOnEditYourAffiliateInfolink();
		logger.info("User click on Edit your affiliate information link");
	}

	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPageObject.clickOnBankTransferBtn();
		logger.info("user click on Bank Transfer radio button");

	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> editaAffiliateInformation = dataTable.asMaps(String.class, String.class);
		retailPageObject.enterBankName(editaAffiliateInformation.get(0).get("bankName"));
		retailPageObject.enterBranchNumber(editaAffiliateInformation.get(0).get("abaNumber"));
		retailPageObject.enterSwiftCode(editaAffiliateInformation.get(0).get("swiftCode"));
		retailPageObject.enterAccountName(editaAffiliateInformation.get(0).get("accountName"));
		retailPageObject.enterAccountNumber(editaAffiliateInformation.get(0).get("accountNumber"));
		logger.info("User fill Bank information with below information");
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailPageObject.clickOnEditAccountInfoLink();
		logger.info("User click on Edit your account information link");

	}

	@And("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> ModifyBelowInformation = dataTable.asMaps(String.class, String.class);
		retailPageObject.modifyFirstName(ModifyBelowInformation.get(0).get("firstName"));
		retailPageObject.modifyLastName(ModifyBelowInformation.get(0).get("lastName"));
		retailPageObject.modifyEmail(ModifyBelowInformation.get(0).get("email"));
		retailPageObject.modifyTelephoneNum(ModifyBelowInformation.get(0).get("telephone"));
		logger.info("User modify below information");
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@And("User click on continue button")
	public void User_click_on_continue_button() {
		retailPageObject.clickOnContinueBtn();
		logger.info("User click on continue button");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		retailPageObject.isSuccessMessageDisplayed();
		logger.info("User should see a message" + "\n" + " Success: Your account has been successfully updated.");
		Utils.takeScreenshotForStep();
		Utils.hardWait();

	}

}

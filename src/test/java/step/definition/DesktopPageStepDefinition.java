package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base {
	DesktopPageObject desktopPageObj = new DesktopPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPageObj.clickonDesktopsTab();
		Utils.hardWait();
		logger.info("User click on Desktops tab");
		Utils.takeScreenshotForStep();

	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPageObj.clickOnShowAllDesktops();
		logger.info("User click on Show all desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> elementsDesktops = desktopPageObj.desktopsTapItems();
		for (WebElement element : elementsDesktops) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + " is present");
		}
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@And("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopPageObj.addHPLP3065_ToCart();
		logger.info("User click ADD TO CART option on HP LP3065 item");

	}

	@And("User select quantity {string}")
	public void user_select_quantity(String int1) {
		desktopPageObj.enterQuantity(int1);
		logger.info("User select quantity {string}");

	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPageObj.clickOnAddToCart();
		logger.info("User click add to Cart button");
	}

	@And("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopPageObj.clickOnCanonEOS5DCamera();
		logger.info("User click ADD TO CART option on Canon EOS 5D item");
	}

	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPageObj.clickTheColorField();
		desktopPageObj.selectRedColorFromDropdown();
		logger.info("User select color from dropdown Red");
	}

	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPageObj.clickOnCanonEOS5DItem();
		logger.info("User click on Canon EOS 5D item");
	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPageObj.clickOnReviewLink();
		logger.info("User click on write a review link");
	}

	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> fillReviewInformation = dataTable.asMaps(String.class, String.class);
		desktopPageObj.writeYourName(fillReviewInformation.get(0).get("yourName"));
		desktopPageObj.writeYourReview(fillReviewInformation.get(0).get("yourReview"));
		desktopPageObj.selectRating(fillReviewInformation.get(0).get("Rating"));
		Utils.takeScreenshotForStep();
		Utils.hardWait();
		logger.info("user fill the review information with below information");
	}

	@And("User click on Continue Button")
	public void user_click_on_continue_Button() {
		desktopPageObj.clickOnContinueButton();
		logger.info("User click on Continue Button");
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		desktopPageObj.isApprovalMessageShown();
		logger.info("User should see a message with {string}");
	}

}

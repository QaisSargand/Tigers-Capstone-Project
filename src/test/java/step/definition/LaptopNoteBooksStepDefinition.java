package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base {
	LaptopNoteBooksPageObject laptopNoteBooksPageObject = new LaptopNoteBooksPageObject();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNoteBooksPageObject.clickOnlaptopNoteBookTab();
		logger.info("User click on Laptop &NoteBook tab");
	}

	@And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopNoteBooksPageObject.clickOnShowAllLaptopNoteBook_Link();
		logger.info("User click on Show all Laptop &NoteBook option");
	}

	@And("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopNoteBooksPageObject.clickOnMacBook_Item();
		logger.info("User click on MacBook item");
	}

	@And("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		laptopNoteBooksPageObject.see_AddednOneItemToCart();
		logger.info("User should see {1 Item(s)-$602.00} showed to the cart");
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() {
		laptopNoteBooksPageObject.clickOnCartOptionField();
		logger.info("User click on cart option");
	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNoteBooksPageObject.clickOnRed_X_Button();
		logger.info("user click on red X button to remove the item from cart");
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		laptopNoteBooksPageObject.see_ZeroItemCart();
		logger.info("item should be removed and cart should show {0 item(s)}");
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@And("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
		laptopNoteBooksPageObject.click_On_comparison_Icon();
		laptopNoteBooksPageObject.click_On_comparison_MacBookAir();
		logger.info("User click on product comparison icon on {MacBook}");
		logger.info("User click on product comparison icon on {MacBook Air}");
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopNoteBooksPageObject.clik_On_comparison_Link();
		logger.info("User click on Product comparison link");
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopNoteBooksPageObject.seeThe_product_Comparison_Chart();
		logger.info("User should see Product Comparison Chart");
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@And("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		laptopNoteBooksPageObject.clickOnHeartIconOfSonyVaIO();
		logger.info("User click on heart icon to add {Sony VaIO} laptop to wish list");
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String expectedSuccessMessage) {
		Assert.assertEquals(laptopNoteBooksPageObject.macSonyVAIOSuccessMsg(), expectedSuccessMessage);
		logger.info(expectedSuccessMessage + " equals to " + laptopNoteBooksPageObject.macSonyVAIOSuccessMsg());
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@And("User click on {string} item")
	public void user_click_on_item(String string) {
		laptopNoteBooksPageObject.click_OnMacBookProItem();
		logger.info("User click on MacBook Pro item");
	}

	@Then("User should see {string} price tag is present on UI")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		laptopNoteBooksPageObject.is$200000PricePresentInCart();
		logger.info("User click on {$2,000.00} item");
		Utils.takeScreenshotForStep();
		Utils.hardWait();

	}

}

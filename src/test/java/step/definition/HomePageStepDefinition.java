package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {
	HomePageObject homePageObject = new HomePageObject();

	@When("User click on Currency")
	public void user_click_on_currency() {
		homePageObject.clickOnCurrency();
		logger.info("User click on Currency");

	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePageObject.clickToChoseEuro();
		logger.info("User Chose Euro from dropdown");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Object expectedValueOfEuro = "€ Currency";
		Assert.assertEquals(expectedValueOfEuro, homePageObject.getValueOfEuroFromUI());
		logger.info(expectedValueOfEuro);
		Utils.takeScreenshotForStep();
		Utils.hardWait();
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePageObject.clickOnShopingCart();
		logger.info("User click on shopping cart");

	}

	@Then("{string} message should display")
	public void message_should_display(String expectetMseeaget) {
		Assert.assertTrue(homePageObject.getEmptyShopingCartMessage());
		logger.info("Your shopping cart is empty!");
		Utils.takeScreenshotForStep();
		logger.info("{string} message should display");
		Utils.hardWait();

	}

}

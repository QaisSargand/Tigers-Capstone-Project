package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
	private WebElement laptopNoteBookTab;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopNoteBookLink;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookItem;

	@FindBy(id = "button-cart")
	private WebElement addToCard;

	@FindBy(xpath = "(//a[text()='MacBook'])[3]")
	private WebElement macBooksuccessMessage;

	@FindBy(xpath = "//*[@id=\"cart-total\"]")
	private String addednOneItemToCart;

	@FindBy(xpath = "//*[@id=\"cart-total\"]")
	private WebElement cartOption;

	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement redX_Button;

	@FindBy(xpath = "//*[@id=\"cart-total\"]")
	private String removedZeroItemCart;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement comparison_Icon_MacBook;

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement comparison_Icon_MacBookAir;

	@FindBy(xpath = "//a[text()='MacBook Air'][1]")
	private WebElement comparisonSuccessMsgOfMacBookAir;

	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement comparison_Link;

	@FindBy(tagName = "img")
	private String product_Comparison_Chart;

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement heartIconOfSonyVaIO;

	@FindBy(xpath = "(//a[text()='Sony VAIO'])[1]")
	private WebElement sonyVAIOSuccessMsg;

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[2]/button[1]/span")
	private WebElement macBookProItem;

	@FindBy(xpath = "//*[@id=\"cart\"]/button")
	private WebElement $200000PriceMsg;

	public void clickOnlaptopNoteBookTab() {
		laptopNoteBookTab.click();
	}

	public void clickOnShowAllLaptopNoteBook_Link() {
		showAllLaptopNoteBookLink.click();
	}

	public void clickOnMacBook_Item() {
		macBookItem.click();
	}

	public void clickToaddToCard() {
		addToCard.click();
	}

	public String getMsgOfMacBookAirSFromUI() {
		String actualmacBookMessage = "Success: You have added " + macBooksuccessMessage.getText()
				+ " to your shopping cart!";
		return actualmacBookMessage;
	}

	public String see_AddednOneItemToCart() {
		return addednOneItemToCart;
	}

	public void clickOnCartOptionField() {
		cartOption.click();
	}

	public void clickOnRed_X_Button() {
		redX_Button.click();
	}

	public String see_ZeroItemCart() {
		return removedZeroItemCart;

	}

	public void click_On_comparison_Icon() {
		comparison_Icon_MacBook.click();
	}

	public void click_On_comparison_MacBookAir() {
		comparison_Icon_MacBookAir.click();
	}

	public String macBookAirSuccessMsg() {
		String actualMacBookAirMessage = "Success: You have added " + comparisonSuccessMsgOfMacBookAir.getText()
				+ "to your product comparison!";
		return actualMacBookAirMessage;
	}

	public void clik_On_comparison_Link() {
		comparison_Link.click();
	}

	public String seeThe_product_Comparison_Chart() {
		return product_Comparison_Chart;
	}

	public void clickOnHeartIconOfSonyVaIO() {
		heartIconOfSonyVaIO.click();
	}

	public String macSonyVAIOSuccessMsg() {
		String actualMacBookAirMessage = "You must login or create an account to save " + sonyVAIOSuccessMsg.getText()
				+ " to your wish list!";
		return actualMacBookAirMessage;
	}

	public void click_OnMacBookProItem() {
		macBookProItem.click();
	}

	public boolean is$200000PricePresentInCart() {
		if ($200000PriceMsg.isDisplayed())
			return true;
		else
			return false;
	}

}

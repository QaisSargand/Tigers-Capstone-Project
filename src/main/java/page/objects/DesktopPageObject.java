package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTap;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	@FindBy(tagName = "img")
	private List<WebElement> items;

	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement optionOfHpLP3065;

	@FindBy(xpath = "//*[@name=\"quantity\"]")
	private WebElement inputOfquantity;

	@FindBy(xpath = "//*[@id=\"button-cart\"]")
	private WebElement addToCartBtn;

	@FindBy(xpath = "(//*[text()='HP LP3065'])[4]")
	private WebElement successMessageOfHPLP;

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;

	@FindBy(xpath = "//*[@id=\"input-option226\"]")
	private WebElement colorFromDropdown;

	@FindBy(xpath = "//*[@id=\"input-option226\"]/option[2]")
	private WebElement red;

	@FindBy(xpath = "(//*[text()=\"Canon EOS 5D Camera\"])[3]")
	private WebElement successMessageOfCanonEOS5D;

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DItem;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeA_ReviewLink;

	@FindBy(xpath = "//*[@id=\"input-name\"]")
	private WebElement yourNameField;

	@FindBy(xpath = "//*[@id=\"input-review\"]")
	private WebElement yourReviewField;

	@FindBy(xpath = "//input[4][@type='radio']")
	private List<WebElement> ratingField;

	@FindBy(xpath = "//*[@id=\\\"form-review\\\"]/div[2]")
	private String seeApprovalMessage;

	@FindBy(xpath = "//*[@id=\"button-review\"]")
	private WebElement ContinueButton;

	public void clickonDesktopsTab() {
		desktopsTap.click();
	}

	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}

	public List<WebElement> desktopsTapItems() {
		List<WebElement> itemsOfDesktops = items;
		return itemsOfDesktops;
	}

	public void addHPLP3065_ToCart() {
		optionOfHpLP3065.click();
	}

	public void enterQuantity(String valueOfQty) {
		inputOfquantity.clear();
		inputOfquantity.sendKeys(valueOfQty);
	}

	public void clickOnAddToCart() {
		addToCartBtn.click();
	}

	public String getSuccessMessageFromUI() {
		String actualValueOfEuro = "Success: You have added " + successMessageOfHPLP.getText()
				+ "to your shopping cart!";
		return actualValueOfEuro;
	}

	public boolean isSuccessMessageDisplayed() {
		if (successMessageOfHPLP.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnCanonEOS5DCamera() {
		canonEOS5DCamera.click();
	}

	public void clickTheColorField() {
		colorFromDropdown.click();

	}

	public void selectRedColorFromDropdown() {
		red.click();
	}

	public String isCanonEOS5DSuccessMessage() {
		String actualValueOfEuro = "Success: You have added " + successMessageOfCanonEOS5D.getText()
				+ "to your shopping cart!";
		return actualValueOfEuro;
	}

	public boolean isCanonEOS5DSuccessMessageDisplayed() {
		if (successMessageOfCanonEOS5D.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnCanonEOS5DItem() {
		canonEOS5DItem.click();
	}

	public void clickOnReviewLink() {
		writeA_ReviewLink.click();
	}

	public void writeYourName(String yourName) {
		yourNameField.sendKeys(yourName);
	}

	public void writeYourReview(String yourReview) {
		yourReviewField.sendKeys(yourReview);
	}

	public void selectRating(String Rating) {
		List<WebElement> ratingElements = ratingField;
		for (WebElement element : ratingElements) {
			if (element.getAttribute("value").equalsIgnoreCase(Rating.trim())) {
				element.click();
				break;
			}
		}
	}

	public void clickOnContinueButton() {
		ContinueButton.click();
	}

	public String isApprovalMessageShown() {
		return seeApprovalMessage;
	}

}

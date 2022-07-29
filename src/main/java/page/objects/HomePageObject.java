package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	public HomePageObject() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath = "//span[text()='Currency']")
	private WebElement currency;
	
	@FindBy (name = "EUR")
	private WebElement euro;
	
	@FindBy (xpath = "//*[text()=\"€\"]")
	private WebElement valueEuro;
	
	@FindBy (xpath = "//*[text()=\"Shopping Cart\"]")
	private WebElement shopingCart;
	
	@FindBy (xpath = "//*[@id=\"content\"]/p")
	private WebElement displiedMessage;
	
	
	public void clickOnCurrency() {
		currency.click();
	}
	
	public void clickToChoseEuro() {
		euro.click();
	}
	public String getValueOfEuroFromUI() {
		String actualValueOfEuro = valueEuro.getText()+ " Currency";
		return actualValueOfEuro;
	}
	
	public void clickOnShopingCart() {
		shopingCart.click();
		
	}
	public boolean getEmptyShopingCartMessage() {
			if(displiedMessage.isDisplayed())
				return true;
			else 
				return false;
		}
		
	}
	
	
	
			
	
	
	



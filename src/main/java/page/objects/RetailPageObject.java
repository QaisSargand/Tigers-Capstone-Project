package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	public WebElement retailWebsite;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	@FindBy(id = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-password")
	private WebElement passWordField;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccount;

	@FindBy(id = "input-company")
	private WebElement companyField;

	@FindBy(id = "input-website")
	private WebElement webSiteField;

	@FindBy(id = "input-tax")
	private WebElement taxField;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeButton;

	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypalButton;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferButton;

	@FindBy(xpath = "//*[@id=\"input-cheque\"]")
	private WebElement chequePayeeName;

	@FindBy(xpath = "//input[@value='1']")
	private WebElement aboutUsCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]")
	private WebElement successMessageOnAffiliatePage;

	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li[1]/a")
	private WebElement editAffiliateInfo;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement BankTransferBtn;

	@FindBy(name = "bank_name")
	private WebElement bankNameField;

	@FindBy(name = "bank_branch_number")
	private WebElement branchNumberField;

	@FindBy(name = "bank_swift_code")
	private WebElement swiftCodeField;

	@FindBy(name = "bank_account_name")
	private WebElement accountNameField;

	@FindBy(name = "bank_account_number")
	private WebElement accountNumberField;

	@FindBy(linkText = "submit")
	private WebElement continueBtn;

	@FindBy(xpath = "//*[@id=\"content\"]/ul[1]/li[1]/a")
	private WebElement editYourAccounInformation;

	@FindBy(xpath = "//*[@name=\"firstname\"]")
	private WebElement firstnameField;

	@FindBy(xpath = "//*[@id=\"input-lastname\"]")
	private WebElement lastnameField;

	@FindBy(xpath = "//*[@id=\"input-email\"]")
	private WebElement emailfield;

	@FindBy(xpath = "//*[@id=\"input-telephone\"]")
	private WebElement telephoneField;

	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
	private WebElement continueBttn;

	@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]")
	private WebElement seeSuccessMessage;

	public String getTheRetailWebSite() {
		String textFromUI = retailWebsite.getText();
		return textFromUI;
	}

	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLogin() {
		login.click();
	}

	public boolean isLogoPresent() {
		if (retailWebsite.isDisplayed())
			return true;
		else
			return false;
	}

	public void enterUserNameAndPassword(String username, String password) {
		emailField.sendKeys(username);
		passWordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public boolean LoginMyAccountDashboard() {
		if (myAccountDashboard.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnRegisterForAnAffiliateAccountLink() {
		registerForAnAffiliateAccount.click();
	}

	public void writeCompanyName(String company) {
		companyField.sendKeys(company);
	}

	public void writeWebSite(String website) {
		webSiteField.sendKeys(website);
	}

	public void enterTaxID(String taxID) {
		taxField.sendKeys(taxID);
	}

	public void selectpaymentMethod(String paymentType) {
		if (paymentType.trim().equalsIgnoreCase("cheque")) {
			if (!chequeButton.isSelected()) {
				chequeButton.click();
			}
		} else if (paymentType.trim().equalsIgnoreCase("paypal")) {
			paypalButton.click();
		} else
			bankTransferButton.click();
	}

	public void enterpayPalEmailAcount(String payPalEmailAccount) {
		chequePayeeName.sendKeys(payPalEmailAccount);
	}

	public void checkTheAboutUsBox() {
		aboutUsCheckBox.click();
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public boolean isSuccessMessagePresent() {
		if (successMessageOnAffiliatePage.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnEditYourAffiliateInfolink() {
		editAffiliateInfo.click();

	}

	public void clickOnBankTransferBtn() {
		BankTransferBtn.click();
	}

	public void enterBankName(String bankName) {
		bankNameField.sendKeys(bankName);
	}

	public void enterBranchNumber(String abaNumber) {
		branchNumberField.sendKeys(abaNumber);
	}

	public void enterSwiftCode(String swiftCode) {
		swiftCodeField.sendKeys(swiftCode);
	}

	public void enterAccountName(String accountName) {
		accountNameField.sendKeys(accountName);
	}

	public void enterAccountNumber(String accountNumber) {
		accountNumberField.sendKeys(accountNumber);
	}

	public void clickOnsubmitBtn() {
		continueBtn.click();
	}

	public void clickOnEditAccountInfoLink() {
		editYourAccounInformation.click();

	}

	public void modifyFirstName(String firstName) {
		firstnameField.sendKeys(firstName);

	}

	public void modifyLastName(String lastName) {
		lastnameField.sendKeys(lastName);
	}

	public void modifyEmail(String email) {
		emailfield.sendKeys(email);
	}

	public void modifyTelephoneNum(String telephone) {
		telephoneField.sendKeys(telephone);

	}

	public void clickOnContinueBtn() {
		continueBttn.click();
	}

	public WebElement isSuccessMessageDisplayed() {
		return seeSuccessMessage;
	}

}
package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

	public WebDriver driver = Configuration.browser();

	@FindBy(className = Elements.Logout)
	private WebElement Logout;

	@FindBy(name = Elements.Search_Btn)
	private WebElement Search_Btn;

	@FindBy(id = Elements.Login_Btn)
	private WebElement Login_Btn;

	@FindBy(id = Elements.SearchBox)
	private WebElement SearchBox;

	@FindBy(xpath = Elements.ResultsDisplayed)
	private WebElement ResultsDisplayed;

	@FindBy(xpath = Elements.ShoppingCartSummary)
	private WebElement ShoppingCartSummary;

	@FindBy(xpath = Elements.productDescription)
	private WebElement productDescription;

	@FindBy(xpath = Elements.SummaryAmount)
	private WebElement SummaryAmount;

	@FindBy(xpath = Elements.DeleteBtn)
	private WebElement DeleteBtn;

	@FindBy(xpath = Elements.ContinueShopping)
	private WebElement ContinueShopping;

	@FindBy(xpath = Elements.AddressCheckBox)
	private WebElement AddressCheckBox;

	@FindBy(xpath = Elements.NextBtn)
	private WebElement NextBtn;

	@FindBy(name = Elements.AddressNext)
	private WebElement AddressNext;

	@FindBy(xpath = Elements.NewAddress)
	private WebElement NewAddress;

	@FindBy(id = Elements.TermsAndConditionsChkBox)
	private WebElement TermsAndConditionsChkBox;

	@FindBy(xpath = Elements.ProductDescription)
	private WebElement ProductDescription;

	@FindBy(xpath = Elements.ErrorMessage)
	private WebElement ErrorMessage;

	@FindBy(xpath = Elements.SuccessMessage)
	private WebElement SuccessMessage;

	public MyAccount() {

		PageFactory.initElements(driver, this);
	}

}

package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	public WebDriver driver = Configuration.browser();

	public ReadExcel read;

	@FindBy(xpath = Elements.Login)
	private WebElement Login;

	@FindBy(xpath = Elements.Image_Logo)
	private WebElement Image_Logo;

	@FindBy(id = Elements.ShoppingCart)
	private WebElement shoppingCart;
	
	@FindBy(className = Elements.Logout)
	private WebElement Logout;

	@FindBy(xpath = Elements.Search_Btn)
	private WebElement Search_Btn;

	@FindBy(id = Elements.Login_Btn)
	private WebElement Login_Btn;

	@FindBy(id = Elements.SearchBox)
	private WebElement SearchBox;

	@FindBy(xpath = Elements.ResultsDisplayed)
	private WebElement ResultsDisplayed;

	@FindBy(xpath = Elements.Bags)
	private WebElement Bags;

	@FindBy(xpath = Elements.SelectItem)
	private WebElement SelectItem;

	@FindBy(xpath = Elements.SelectSize)
	private WebElement SelectSize;
	
	@FindBy(xpath = Elements.AddToBag)
	private WebElement AddToBag;
	
	@FindBy(xpath = Elements.PopUpClose)
	private WebElement PopUpClose;
	
	@FindBy(xpath = Elements.RegionSelectionClose)
	private WebElement RegionSelectionClose;
	
	public HomePage() {

		PageFactory.initElements(driver, this);
		read = new ReadExcel();
	}

	public void shoppingCart() {
		Assert.assertTrue(shoppingCart.isDisplayed());
		shoppingCart.click();
	}
	
	public void loginLink() {

		Login.click();
		Assert.assertEquals(driver.getTitle(), read.readData("Login_Title"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		closePopUp();
		closeRegionSelectionPopUp();
	}

	public void validateHomePage() {
		Assert.assertEquals(driver.getTitle(), read.readData("Home_Title"));

	}

	public void logout() {

		Logout.click();
		Login_Btn.click();
	}
	
	public void searchProduct(String product){
		
		SearchBox.sendKeys(product);
		Search_Btn.click();
	}
	
	public void validateResults(){
		Assert.assertTrue(ResultsDisplayed.isDisplayed());
		Assert.assertTrue(Bags.isDisplayed());
	}
	
	public void navigateToHome(){
		
		Image_Logo.click();
	}
	
	public void clickAddToCart(){
		Assert.assertTrue(SelectItem.isDisplayed());
		SelectItem.click();
		Assert.assertTrue(SelectSize.isDisplayed());
		SelectSize.click();
		AddToBag.click();
	}
	
	public void closePopUp() {
		
		try {
			PopUpClose.click();
		}catch (Exception e) {
			
		}
	}
	
	public void closeRegionSelectionPopUp() {
		
		try {
			RegionSelectionClose.click();
		}catch (Exception e) {
			
		}
	}

}

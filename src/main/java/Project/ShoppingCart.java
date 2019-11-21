package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ShoppingCart {
	public WebDriver driver = Configuration.browser();
	
	@FindBy(xpath = Elements.ItemDescription)
	private WebElement itemDescription;
	
	@FindBy(xpath = Elements.ContinueSecurely)
	private WebElement ContinueSecurely;
	
	@FindBy(id = Elements.CheckTandC)
	private WebElement CheckTandC;
	
	@FindBy(xpath = Elements.Delete)
	private WebElement delete;
	
	@FindBy(xpath = Elements.CheckBox)
	private WebElement checkBox;

	@FindBy(xpath = Elements.DeliveryOption)
	private WebElement DeliveryOption;
	
	@FindBy(xpath = Elements.ContinueSecurely2)
	private WebElement ContinueSecurely2;
	
	@FindBy(xpath = Elements.PayByCheck)
	private WebElement paybycheck;

	@FindBy(xpath = Elements.Submit)
	private WebElement submit;
	
	public ShoppingCart(){
		PageFactory.initElements(driver, this);
	}
	
	public void validateItemDescription(String expItemDesc){
		String actItemDesc = itemDescription.getText();
		if(actItemDesc.contains(expItemDesc)) {
			System.out.println("Item added to bag successfully");
		}
	}
	
	public void clickContinueSecurely(){
		Assert.assertTrue(ContinueSecurely.isDisplayed());
		ContinueSecurely.click();
	}
	
	
	
	public void deleteItem(){
		delete.click();
	}
	
	public void uncheckAddress(){
		checkBox.click();
		//Assert.assertEquals(checkBox.getAttribute(arg0), expected);
	}
	
	public void selectDeliveryOption(){
		DeliveryOption.click();
	}
	
	
	public void selectContinue(){
		ContinueSecurely2.click();
	}
	
	public void clickPaybycheck(){
		paybycheck.click();
	}
	
	public void clickSubmit(){
		submit.click();
	}
}

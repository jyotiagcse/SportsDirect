package Project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNGAnnotationsTest {

	public WebDriver driver = Configuration.browser();
	public ReadExcel read;
	public HomePage home;
	public LoginPage login;

	public TestNGAnnotationsTest() {

		read = new ReadExcel();
		home = new HomePage();
		login = new LoginPage();
	}

	@BeforeSuite(alwaysRun = true)
	public void loginToApp() {

		driver.get(Configuration.LoginURL());
		driver.manage().window().maximize();
		home.closePopUp();
		home.closeRegionSelectionPopUp();
		home.validateHomePage();

	}


	@AfterSuite(alwaysRun=true)
	public void closeBrowser(){
		driver.quit();
	}

	
	
}

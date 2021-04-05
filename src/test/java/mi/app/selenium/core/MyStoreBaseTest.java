package mi.app.selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import mi.app.selenium.pages.MyAccount_page;
import mi.app.selenium.pages.Register_page;
import mi.app.selenium.pages.Sign_in_page;
import mi.app.selenium.pages.Start_page;
import mi.app.selenium.pages.Store_page;
import mi.app.selenium.pages.WishLists_page;

public abstract class MyStoreBaseTest {
	
	public WebDriver driver;
	
	public Start_page pagDeInicio;       
	public Sign_in_page pagDeRegistro;
	public Register_page pagDeCreacion;
	public MyAccount_page pagMiCuenta;
	public Store_page pagDeTienda;
	public WishLists_page pagDeDeseos;
		
		@BeforeMethod
		public void setupDriver() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			
			pagDeInicio = new Start_page(driver);
			pagDeRegistro = new Sign_in_page(driver);
			pagDeCreacion = new Register_page(driver);
			pagMiCuenta = new MyAccount_page (driver);
			pagDeTienda = new Store_page (driver);	
			pagDeDeseos = new WishLists_page(driver);
		}
		
		@AfterMethod
		public void afterTest() {			
			driver.quit();
		}		
	}
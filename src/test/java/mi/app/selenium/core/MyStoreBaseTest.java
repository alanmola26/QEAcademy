package mi.app.selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class MyStoreBaseTest {
	
	public WebDriver driver;
		
		@BeforeTest
		public void setupDriver() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		
		@AfterTest
		public void closeDriver() {
			//driver.quit();
		}
	}
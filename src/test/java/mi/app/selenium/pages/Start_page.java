package mi.app.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Start_page {
	
	private WebDriver driver;
	
	public Start_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='login']")
	private WebElement loginButton;
	
	//------------------------------------------

	public void clickSigninLogin() throws InterruptedException {
		
		loginButton.click();	
		Thread.sleep(2000);
	}
}

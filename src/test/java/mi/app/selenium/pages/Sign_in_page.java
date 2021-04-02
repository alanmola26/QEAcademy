package mi.app.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in_page {
	
    private WebDriver driver;

	public Sign_in_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//*[@id='email_create']")
	private WebElement emailtextbox;
	
	@FindBy(xpath="//*[@id='SubmitCreate']")
	private WebElement clickButtonCreate;
	
	//---------------------------------------------
	
	public void createAccount(String email) throws InterruptedException {
		
		emailtextbox.sendKeys(email);		
		clickButtonCreate.click();	
		Thread.sleep(2000);
	}
}
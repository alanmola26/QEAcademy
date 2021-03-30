package mi.app.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ropa_Account_page {
	
    private WebDriver driver;

	public Ropa_Account_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}

	@FindBy(xpath="//*[@id='email_create']")
	private WebElement emailtextbox;
	
	@FindBy(xpath="//*[@id='SubmitCreate']")
	private WebElement clickButtonCreate;

	public void sendmailbox(String email) {
		emailtextbox.sendKeys(email);
	}	
	public void clickcreatebutton() {
		clickButtonCreate.click();		
	}
}
package mi.app.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Sign_in_page {

	private WebDriver driver;
	private WebDriverWait wait;

	public Sign_in_page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='email_create']")
	private WebElement emailtextbox;

	@FindBy(xpath = "//*[@id='SubmitCreate']")
	private WebElement clickButtonCreate;

	@FindBy(xpath = "//*[@id='email']")
	private WebElement textboxemailsignin;

	@FindBy(xpath = "//*[@id='passwd']")
	private WebElement textboxpasswd;

	@FindBy(xpath = "//*[@id='SubmitLogin']")
	private WebElement signInEmailButton;

	@FindBy(xpath="//div[contains(@class, 'alert')]//li")
	private WebElement errorMessage;
	
	// -------------------------------------------------------------------------

	public void createAccount(String email) throws InterruptedException {
		emailtextbox.sendKeys(email);
		clickButtonCreate.click();
		Thread.sleep(2000);
	}
	public void signInEmail(String emailsignin, String emailpasswd) throws InterruptedException {		
		textboxemailsignin.sendKeys(emailsignin);
		textboxpasswd.sendKeys(emailpasswd);
		signInEmailButton.click();
		Thread.sleep(2000);
	}
	public void signInWrngEmail(String incorrectEmail, String correctPasswd) throws InterruptedException {	
		textboxemailsignin.sendKeys(incorrectEmail);
		textboxpasswd.sendKeys(correctPasswd);
		signInEmailButton.click();
		WebElement alertError = wait.until(ExpectedConditions.visibilityOf(errorMessage));	
		Assert.assertTrue(alertError.getText().contains("Authentication failed"), "El texto no se encontró");		
		Thread.sleep(2000);
	}
	public void signInWrngPass(String correctEmail, String incorrectPasswd) throws InterruptedException {		
		textboxemailsignin.sendKeys(correctEmail);
		textboxpasswd.sendKeys(incorrectPasswd);
		signInEmailButton.click();
		WebElement alertError = wait.until(ExpectedConditions.visibilityOf(errorMessage));	
		Assert.assertTrue(alertError.getText().contains("Authentication failed"), "El texto no se encontró");		
		Thread.sleep(2000);	
	}	
}
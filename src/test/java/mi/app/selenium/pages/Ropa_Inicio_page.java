package mi.app.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ropa_Inicio_page {
	
	private WebDriver driver;
	
	public Ropa_Inicio_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@class='login']")
	private WebElement loginButton;

	public void ClickSigninButton() {
		loginButton.click();		
	}
}

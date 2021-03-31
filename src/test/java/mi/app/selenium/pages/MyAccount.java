package mi.app.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount {

	final WebDriver driver;
	
	public MyAccount(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement searchButton;
	
	@FindBy(xpath="//a[@title='View my shopping cart']")
	WebElement viewCart;
	
	@FindBy(xpath="//a[@title='My wishlists']")
	WebElement wishListButton;
	
	@FindBy(xpath="//a[@title='Orders']")
	WebElement ordersButton;
	
	@FindBy(xpath="//a[@title='Credit slips']")
	WebElement creditButton;
	
	@FindBy(xpath="//a[@title='Addresses']")
	WebElement addressesButton;
	
	@FindBy(xpath="//a[@title='Information']")
	WebElement informationButton;
	
	@FindBy(xpath="//a[@title='Women']")
	WebElement womenButton;
	
	@FindBy(xpath="//a[@title='Dresses']")
	WebElement dressesButton;
	
	@FindBy(xpath="//a[@title='T-shirts']")
	WebElement tShirtButton;
	
	
	
	public void goWishList() throws InterruptedException {
		wishListButton.click();
		Thread.sleep(1000);
	}
	
	
	
	
}
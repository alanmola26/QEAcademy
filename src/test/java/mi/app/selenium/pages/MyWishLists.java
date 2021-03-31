package mi.app.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishLists {

	final WebDriver driver;
	
	public MyWishLists(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement searchButton;
	
	@FindBy(xpath="//a[@title='View my shopping cart']")
	WebElement viewCart;
	
	@FindBy(xpath="//a[@title='Women']")
	WebElement womenButton;
	
	@FindBy(xpath="//a[@title='Dresses']")
	WebElement dressesButton;
	
	@FindBy(xpath="//a[@title='T-shirts']")
	WebElement tShirtButton;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement inputBox;
	
	@FindBy(xpath="//button[@name='submitWishlist']")
	WebElement wishListButton;
	
	
	public void goWishList() throws InterruptedException {
		wishListButton.click();
		Thread.sleep(1000);
	}
	
	
	
	
}
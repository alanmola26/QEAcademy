package mi.app.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_page {
	
	 private WebDriver driver;
		
		public MyAccount_page(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);	
     }
		
		@FindBy(xpath="//*[@id='search_query_top']")
		private WebElement textboxsearch;
		
		@FindBy(xpath="//*[@name='submit_search']")
		private WebElement searchbutton;
		
		@FindBy(xpath="//a[@title='My wishlists']")
		private WebElement wLButton;
		
		//------------------------------------------------

		public void searchClothes(String search) throws InterruptedException {			
			textboxsearch.sendKeys(search);			
			searchbutton.click();	
			Thread.sleep(2000);
	}
		public void myWishListsButton() throws InterruptedException {
			wLButton.click();
			Thread.sleep(2000);
	}
}

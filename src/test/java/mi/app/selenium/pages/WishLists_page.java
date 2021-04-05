package mi.app.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishLists_page {
	
	 private WebDriver driver;
		
		public WishLists_page(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);	
    }
		
		@FindBy(xpath="//*[@href='javascript:;']")
		private WebElement myWlButton;
		
		@FindBy (xpath="//*[@id='showSendWishlist']")
		private WebElement sendWLButton;
		
		@FindBy (xpath="//*[@id='email1']")
		private WebElement sendEmail1Box;
		
		@FindBy (xpath="(//*[@name='submitWishlist'])[2]")
		private WebElement submitSendButton;
		
		//-----------------------------------------------
		
		public void sendWL(String wLEmail) throws InterruptedException {
			myWlButton.click();
			Thread.sleep(2000);
			sendWLButton.click();			
			sendWLButton.click();			
			sendEmail1Box.sendKeys(wLEmail);
			submitSendButton.click();
			Thread.sleep(3000);
	}
}

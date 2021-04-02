package mi.app.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Store_page {
	
	 private WebDriver driver;
		
		public Store_page(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);	
     }
		
		@FindBy(xpath="//*[@class='replace-2x img-responsive']")
		private WebElement dressbutton;
		
		@FindBy(xpath="//*[@class='exclusive']")
		private WebElement addtocartbutton;
		
		//----------------------------------------------

		public void selectClothes() {
			
			dressbutton.click();				
			addtocartbutton.click();			
	}
}

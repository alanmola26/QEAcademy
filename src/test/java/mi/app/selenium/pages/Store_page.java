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
		
		@FindBy(xpath="//*[@title='Printed Summer Dress']")
		private WebElement dressbutton;
		
		@FindBy(xpath="//*[@class='exclusive']")
		private WebElement addtocartbutton;
		
		@FindBy(xpath="//*[@title='Proceed to checkout']")
		private WebElement proceedCheckout;
		
		@FindBy(xpath="//*[@class='button btn btn-default standard-checkout button-medium']")
		private WebElement proceedCheckout02;
		
		@FindBy(xpath="//*[@name='processAddress']")
		private WebElement proceedCheckout03;
		
		@FindBy(xpath="//input[@id='cgv']")
		private WebElement checkCGV;
		
		@FindBy(xpath="//*[@name='processCarrier']")
		private WebElement proceedCheckout04;
		
		@FindBy(xpath="//a[@title='Pay by bank wire']")
		private WebElement btnbankwire;
		
		@FindBy(xpath="//a[@title='Pay by check.']")
		private WebElement btncheque;
		
		@FindBy(xpath="//*[@class='button btn btn-default button-medium']")
		private WebElement btnConfirm;
		
		@FindBy(xpath="//*[@class='cross']")
		private WebElement btnClose;
		
		@FindBy(xpath="//a[@title='View my shopping cart']")
		private WebElement btnViewCart;
		
		@FindBy(xpath="//*[@id='wishlist_button']")
		private WebElement addwishlitbutton;
		
		//----------------------------------------------

		public void selectClothesAndAddToCart() throws InterruptedException {
			
			dressbutton.click();				
			addtocartbutton.click();
			Thread.sleep(3000);			
	}
		public void payByBankWire() throws InterruptedException {
			proceedCheckout.click();		
			proceedCheckout02.click();			
			proceedCheckout03.click();			
			checkCGV.click();
			proceedCheckout04.click();			
			btnbankwire.click();			
			btnConfirm.click();
			Thread.sleep(3000);
	}		
		public void payByCheck() throws InterruptedException {
			proceedCheckout.click();		
			proceedCheckout02.click();			
			proceedCheckout03.click();			
			checkCGV.click();
			proceedCheckout04.click();			
			btncheque.click();			
			btnConfirm.click();
			Thread.sleep(3000);
	}		
		public void cartTDC() throws InterruptedException {
			btnClose.click();
			btnViewCart.click();
			proceedCheckout02.click();			
			proceedCheckout03.click();			
			checkCGV.click();
			proceedCheckout04.click();			
			btnbankwire.click();			
			btnConfirm.click();
			Thread.sleep(3000);
	}		
		public void cartCheck() throws InterruptedException {
			btnClose.click();
			btnViewCart.click();
			proceedCheckout02.click();			
			proceedCheckout03.click();			
			checkCGV.click();
			proceedCheckout04.click();			
			btncheque.click();			
			btnConfirm.click();
			Thread.sleep(3000);
	}		
		public void addWL() throws InterruptedException {
			dressbutton.click();
			Thread.sleep(2000);
			addwishlitbutton.click();
			Thread.sleep(3000);				
	}
}

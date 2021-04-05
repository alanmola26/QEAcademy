package mi.app.selenium.tsd;

import org.testng.annotations.Test;
import mi.app.selenium.core.MyStoreBaseTest;

public class MyStoreTest extends MyStoreBaseTest {
	
	@Test
	public void createAccountUser() throws InterruptedException {		 		
		pagDeInicio.clickSigninLogin();
		pagDeRegistro.createAccount("prueba_896_@prueba.com");		
		pagDeCreacion.registerUser("Cristiano", "Ronaldo", "12345678", "26", "3", "1992", "Accenture", "México", "Nuevo León", 				               
				"Monterrey", "27", "12345", "21", "vamo a calmarno", "8888888888", "5555555");											
	}			
	@Test
	public void happySignIn() throws InterruptedException {		
		pagDeInicio.clickSigninLogin();
		pagDeRegistro.signInEmail("jorge@hotmail.com", "123456");
    }	
	@Test
	public void wrongSignInEmail() throws InterruptedException {
		pagDeInicio.clickSigninLogin();				
		pagDeRegistro.signInWrngEmail("jorge666@hotmail.com", "123456");
	}
	@Test
	public void wrognSignInPasswd() throws InterruptedException {
		pagDeInicio.clickSigninLogin();				
		pagDeRegistro.signInWrngPass("jorge@hotmail.com", "654321");
	}	
	@Test
	public void addCart() throws InterruptedException {
		happySignIn();
		pagMiCuenta.searchClothes("dress");
		pagDeTienda.selectClothesAndAddToCart();
	}
	@Test
	public void purchaseTDC() throws InterruptedException {
		addCart();
		pagDeTienda.payByBankWire();
	}
	@Test
	public void purchaseCheck() throws InterruptedException {
			addCart();
			pagDeTienda.payByCheck();	
    }
	@Test
	public void purchaseFromCartTDC() throws InterruptedException {
			addCart();
			pagDeTienda.cartTDC();	
    }
	@Test
	public void purchaseFromCartCheck() throws InterruptedException {
			addCart();
			pagDeTienda.cartCheck();	
    }
	@Test
	public void addToWishList() throws InterruptedException {
		happySignIn();
		pagMiCuenta.searchClothes("dress");
		pagDeTienda.addWL();		
    }
	@Test
	public void sendWishList() throws InterruptedException {
		happySignIn();
		pagMiCuenta.myWishListsButton();
		pagDeDeseos.sendWL("akari@gmail.com");
    }
}
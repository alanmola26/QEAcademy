package mi.app.selenium.tsd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mi.app.selenium.core.MyStoreBaseTest;
import mi.app.selenium.pages.Sign_in_page;
import mi.app.selenium.pages.Register_page;
import mi.app.selenium.pages.Start_page;
import mi.app.selenium.pages.MyAccount_page;
import mi.app.selenium.pages.Store_page;

public class MyStoreTest extends MyStoreBaseTest {
	
	public Start_page pagDeInicio;       
	public Sign_in_page pagDeRegistro;
	public Register_page pagDeCreacion;
	public MyAccount_page pagMiCuenta;
	public Store_page pagDeTienda;
	
	@BeforeClass
	public void setupClasses() {
		pagDeInicio = new Start_page(driver);
		pagDeRegistro = new Sign_in_page(driver);
		pagDeCreacion = new Register_page(driver);
		pagMiCuenta = new MyAccount_page (driver);
		pagDeTienda = new Store_page (driver);
	}
	
	@Test
	public void createRopaAccount() throws InterruptedException {
		 		
		pagDeInicio.clickSignin();
		
		pagDeRegistro.createAccount("prueba_024_@prueba.com");		
		
		pagDeCreacion.registerUser("Cristiano", "Ronaldo", "12345678", "26", "3", "1992", "Accenture", "México", "Nuevo León", 
				               "Monterrey", "27", "12345", "21", "vamo a calmarno", "8888888888", "5555555");
		
		pagMiCuenta.searchClothes("dress");
				
		pagDeTienda.selectClothes();								
	}	
}

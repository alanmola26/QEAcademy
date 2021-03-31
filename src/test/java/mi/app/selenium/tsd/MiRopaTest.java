package mi.app.selenium.tsd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mi.app.selenium.core.MiBaseTest;
import mi.app.selenium.pages.Ropa_Account_page;
import mi.app.selenium.pages.Ropa_Info_page;
import mi.app.selenium.pages.Ropa_Inicio_page;

public class MiRopaTest extends MiBaseTest {
	
	public Ropa_Inicio_page inicio_page;
	public Ropa_Account_page account_page;
	public Ropa_Info_page info_page;
	
	@BeforeClass
	public void setupClasses() {
		inicio_page = new Ropa_Inicio_page(driver);
		account_page = new Ropa_Account_page(driver);
		info_page = new Ropa_Info_page(driver);
	}
	
	@Test
	public void createRopaAccount() throws InterruptedException {
		
		// hola que hace 
		
		inicio_page.ClickSigninButton();
		Thread.sleep(1000);
		
		account_page.sendmailbox("422@live.com.mx");
		Thread.sleep(1000);
		
		account_page.clickcreatebutton();
		Thread.sleep(2000);
		
		info_page.clickgenderbutton();
		Thread.sleep(2000);
		
		info_page.sendfirstname("Alan Molina");
		Thread.sleep(1000);
		
		info_page.sendlastname("Molina Aguillon");
		Thread.sleep(1000);
		
		info_page.sendemail();
		Thread.sleep(1000);
		
		info_page.sendpassword("1234567");
		Thread.sleep(1000);
		
		info_page.chooseday("26");
		Thread.sleep(1000);
		
		info_page.choosemonth("3");
		Thread.sleep(1000);
		
		info_page.chooseyear("1992");
		Thread.sleep(1000);
		
		info_page.clicknewsletter();
		Thread.sleep(1000);
		
		info_page.againsendname();
		Thread.sleep(1000);
		
		info_page.againsendlastname();
		Thread.sleep(1000);
		
		info_page.sendcompany("Accenture");
		Thread.sleep(1000);
		
		info_page.sendaddress("México");
		Thread.sleep(1000);
		
		info_page.sendaddress2("Nuevo León");
		Thread.sleep(1000);
		
		info_page.sendcity("Monterrey");
		Thread.sleep(1000);
		
		info_page.choosestate("43");
		Thread.sleep(1000);
		
		info_page.sendpostalcode("12345");
		Thread.sleep(1000);
		
		info_page.choosecountry("21");
		Thread.sleep(1000);
		
		info_page.sendanotherinfo("todo bien papu");
		Thread.sleep(1000);
		
		info_page.sendhomephone("11111111111");
		Thread.sleep(1000);
		
		info_page.sendmobilephone("2222222222");
		Thread.sleep(1000);
		
		info_page.sendaliasaddress();
		Thread.sleep(1000);
		
		info_page.ClickRegister();
		Thread.sleep(1000);
	}	
}

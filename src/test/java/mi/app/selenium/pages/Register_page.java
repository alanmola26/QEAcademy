package mi.app.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register_page {
	
    private WebDriver driver;
	
	public Register_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
			
	@FindBy(xpath="//*[@id='id_gender1']")
	private WebElement genderbutton;
	
	@FindBy(xpath="//*[@id='customer_firstname']")
	private WebElement firstnametextbox;
	
	@FindBy(xpath="//*[@id='customer_lastname']")	
	private WebElement lastnametextbox;
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement emailtextbox;	
	
	@FindBy(xpath="//*[@id='passwd']")	
	private WebElement passwordtextbox;	
	
	@FindBy(xpath="//*[@id='newsletter']")
	private WebElement checkboxnewsletter;	
	
	@FindBy(xpath="//*[@id='optin']")
	private WebElement checkboxoffers;
	
	@FindBy(xpath="//*[@id='firstname']")	
	private WebElement textboxagainname;	
	
	@FindBy(xpath="//*[@id='lastname']")	
	private WebElement textboxagainlastname;
	
	@FindBy(xpath="//*[@id='company']")	
	private WebElement textboxcompany;
	
	@FindBy(xpath="//*[@id='address1']")	
	private WebElement textboxaddress;
	
	@FindBy(xpath="//*[@id='address2']")	
	private WebElement textboxaddress2;
	
	@FindBy(xpath="//*[@id='city']")	
	private WebElement textboxcity;
	
	@FindBy(xpath="//*[@id='postcode']")	
	private WebElement textboxpostcode;
	
	@FindBy(xpath="//*[@id='other']")	
	private WebElement textboxother;
	
	@FindBy(xpath="//*[@id='phone']")	
	private WebElement textboxhomephone;
	
	@FindBy(xpath="//*[@id='phone_mobile']")	
	private WebElement textboxmobilephone;
	
	@FindBy(xpath="//*[@id='alias']")	
	private WebElement textboxaliasaddress;
	
	@FindBy(xpath="//*[@id='submitAccount']")
	private WebElement registerButton;
	
	//----------------------------------------------------

	public void registerUser(String firstName, String lastName, String pass, String day, String month, 
			String year, String company, String address, String address2, String city, String state, 
			String postcode, String country, String other, String homephone, String mobilephone ) throws InterruptedException {
		
		genderbutton.click();
		firstnametextbox.sendKeys(firstName);
		lastnametextbox.sendKeys(lastName);
		emailtextbox.click();
		passwordtextbox.sendKeys(pass);	
		Select selectDays = new Select(driver.findElement(By.id("days")));
		selectDays.selectByValue(day);
		Select selectmonths = new Select(driver.findElement(By.id("months")));
		selectmonths.selectByValue(month);	
		Select selectyears = new Select(driver.findElement(By.id("years")));
		selectyears.selectByValue(year);
		checkboxnewsletter.click();	
		checkboxoffers.click();	
		textboxagainname.click();
		textboxagainlastname.click();
		textboxcompany.sendKeys(company);
		textboxaddress.sendKeys(address);
		textboxaddress2.sendKeys(address2);	
		textboxcity.sendKeys(city);	
		Select selectstate = new Select(driver.findElement(By.id("id_state")));
		selectstate.selectByValue(state);	
		textboxpostcode.sendKeys(postcode);	
		Select selectcountry = new Select(driver.findElement(By.id("id_country")));
		selectcountry.selectByValue(country);	
		textboxother.sendKeys(other);
		textboxhomephone.sendKeys(homephone);
		textboxmobilephone.sendKeys(mobilephone);
		textboxaliasaddress.click();
		registerButton.click();	
		Thread.sleep(3000);
	}	
}

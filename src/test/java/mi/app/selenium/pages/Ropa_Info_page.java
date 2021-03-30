package mi.app.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ropa_Info_page {
	
    private WebDriver driver;
	
	public Ropa_Info_page(WebDriver driver) {
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

	public void clickgenderbutton() {
		genderbutton.click();		
	}
	public void sendfirstname(String name) {
		firstnametextbox.sendKeys(name);		
	}
	public void sendlastname(String lastname) {
		lastnametextbox.sendKeys(lastname);
	}
	public void sendemail() {
		emailtextbox.click();
	}
	public void sendpassword(String pass) {
		passwordtextbox.sendKeys(pass);		
	}
	public void chooseday(String day) {
		Select selectDays = new Select(driver.findElement(By.id("days")));
		selectDays.selectByValue(day);				
	}
	public void choosemonth(String month) {
		Select selectmonths = new Select(driver.findElement(By.id("months")));
		selectmonths.selectByValue(month);				
	}
	public void chooseyear(String year) {
		Select selectyears = new Select(driver.findElement(By.id("years")));
		selectyears.selectByValue(year);				
	}
	public void clicknewsletter() {
		checkboxnewsletter.click();		
	}
	public void againsendname() {
		textboxagainname.click();		
	}
	public void againsendlastname() {
		textboxagainlastname.click();	
	}
	public void sendcompany(String company) {
		textboxcompany.sendKeys(company);
	}
	public void sendaddress(String address) {
		textboxaddress.sendKeys(address);		
	}
	public void sendaddress2(String address2) {
		textboxaddress2.sendKeys(address2);		
	}
	public void sendcity(String city) {
		textboxcity.sendKeys(city);		
	}
	public void choosestate(String state) {
		Select selectstate = new Select(driver.findElement(By.id("id_state")));
		selectstate.selectByValue(state);		
	}
	public void sendpostalcode(String postcode) {
		textboxpostcode.sendKeys(postcode);		
	}
	public void choosecountry(String country) {
		Select selectcountry = new Select(driver.findElement(By.id("id_country")));
		selectcountry.selectByValue(country);					
	}
	public void sendanotherinfo(String other) {
		textboxother.sendKeys(other);			
	}
	public void sendhomephone(String homephone) {
		textboxhomephone.sendKeys(homephone);	
	}
	public void sendmobilephone(String mobilephone) {
		textboxmobilephone.sendKeys(mobilephone);			
	}
	public void sendaliasaddress() {
		textboxaliasaddress.click();		
	}
	public void ClickRegister() {
		registerButton.click();		
	}
}

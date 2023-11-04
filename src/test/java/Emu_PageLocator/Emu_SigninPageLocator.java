package Emu_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Emu_Utility.Emu_Base;

public class Emu_SigninPageLocator extends Emu_Base{

	
	public Emu_SigninPageLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id="ap_customer_name")
	public WebElement name;
	
	@FindBy(id="ap_email")
	public WebElement number;
	@FindBy(id="ap_password")
	public WebElement passW;
	
	@FindBy(id="ap_password_check")
	public WebElement rPassw;
	
	@FindBy(id="continue")
	public WebElement cont;
	
	@FindBy(xpath ="//div[contains(text(),'Wrong or Invalid email address or mobile phone number. Please correct and try again.')]")
	public WebElement error;
}

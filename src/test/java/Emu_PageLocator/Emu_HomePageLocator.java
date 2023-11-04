package Emu_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Emu_Utility.Emu_Base;

public class Emu_HomePageLocator extends Emu_Base{

	public Emu_HomePageLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id="nav-link-accountList-nav-line-1")
	public WebElement mhOnSign;
	
	@FindBy(linkText ="Start here.")
	public WebElement clStartHere;
	
	@FindBy(id ="searchDropdownBox")
	public WebElement clAll;
	
	@FindBy(id ="nav-search-submit-button")
	public WebElement clSearch;
}

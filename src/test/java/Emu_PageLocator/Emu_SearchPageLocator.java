package Emu_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Emu_Utility.Emu_Base;

public class Emu_SearchPageLocator extends Emu_Base{

	public Emu_SearchPageLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(css ="a[aria-label='Clothing, You are currently on a drop-down. To open this drop-down, Press Enter.'] span[class='nav-a-content']")
	public WebElement mouseOnClothing;
	
	@FindBy(linkText ="Dresses")
	public WebElement clDresses;
	
	@FindBy(css ="li[aria-label=\"The Children's Place\"] span a div label i")
	public WebElement clBox;
	
	@FindBy(css ="div[id='p_36-title'] span[class='a-size-base a-color-base puis-bold-weight-text']")
	public WebElement verify;
}

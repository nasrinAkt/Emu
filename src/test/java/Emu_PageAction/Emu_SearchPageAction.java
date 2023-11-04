package Emu_PageAction;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Emu_PageLocator.Emu_SearchPageLocator;
import Emu_Utility.Emu_Base;
import Emu_Utility.Emu_Utiliti;

public class Emu_SearchPageAction extends Emu_Base{
	Emu_SearchPageLocator emu_SearchPageLocator = new Emu_SearchPageLocator();
	
	
	public void mousehoveronclothing() throws Exception {
		Actions actions = new Actions(driver);
		actions.moveToElement(emu_SearchPageLocator.mouseOnClothing).build().perform();
		Thread.sleep(2000);
		
	}
	public void clickdresses() throws Exception {
		emu_SearchPageLocator.clDresses.click();	
		Thread.sleep(2000);
	}
	public void scrolldownandclickonthechildrenplacecheckbox() throws Exception {
		Actions actions = new Actions(driver);
		actions.moveToElement(emu_SearchPageLocator.verify);
		actions.perform();
		Thread.sleep(2000);
		emu_SearchPageLocator.clBox.click();
		Emu_Utiliti.takeMyScreenshot(driver, "checkBox");
	}
	
}

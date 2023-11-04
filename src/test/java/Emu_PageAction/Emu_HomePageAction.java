package Emu_PageAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Emu_PageLocator.Emu_HomePageLocator;
import Emu_Utility.Emu_Base;
import Emu_Utility.Emu_TestData;

public class Emu_HomePageAction extends Emu_Base {

	Emu_HomePageLocator emu_HomePageLocator = new Emu_HomePageLocator();
	
	public void mousehoveronsigninem() {
	Actions ac = new Actions(driver);
	ac.moveToElement(emu_HomePageLocator.mhOnSign).build().perform();
		
	}
	public void clickstarthere() {
	emu_HomePageLocator.clStartHere.click();	
		
	}
	public void selectbabyfromdropdownclickonsearchbutton() throws Exception {
		Select sl = new Select(emu_HomePageLocator.clAll);
		sl.selectByVisibleText(Emu_TestData.visibletext);
		Thread.sleep(2000);
		emu_HomePageLocator.clSearch.click();
		
		
	}
	
}

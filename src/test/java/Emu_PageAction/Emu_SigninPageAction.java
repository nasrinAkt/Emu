package Emu_PageAction;

import org.testng.Assert;

import Emu_PageLocator.Emu_SigninPageLocator;
import Emu_Utility.Emu_Base;
import Emu_Utility.Emu_TestData;

public class Emu_SigninPageAction extends Emu_Base{
	Emu_SigninPageLocator emu_SigninPageLocator = new Emu_SigninPageLocator();
	
	public void enterinvalidnamemobilenumberenterpasswordrepasswordclickcontinue() throws Exception {
		Thread.sleep(2000);
		emu_SigninPageLocator.name.sendKeys(Emu_TestData.firstN);
		Thread.sleep(2000);
		emu_SigninPageLocator.number.sendKeys(Emu_TestData.emailP);
		Thread.sleep(2000);
		emu_SigninPageLocator.passW.sendKeys(Emu_TestData.password);
		Thread.sleep(2000);
		emu_SigninPageLocator.rPassw.sendKeys(Emu_TestData.rePassword);
		Thread.sleep(2000);
		emu_SigninPageLocator.cont.click();
		Thread.sleep(2000);
		
	}
	
	public void Verifyusercannotcreateaccountwithwronginformation() {
		boolean verify = emu_SigninPageLocator.error.isDisplayed();
		Assert.assertTrue(verify);
		
		
	}
}

package Emu_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Emu_Utility.Emu_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = {"src/test/resources/Emu_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Emu_StepDefinition",tags = {"@tag1"})
public class Emu_TestRunner extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void emStartURL() {
	Emu_Base emm = new Emu_Base();
	emm.EmBrowser();	
	}
	
	@AfterTest
	public void emCloseURL() throws Exception {
		Thread.sleep(2000);
	Emu_Base emm = new Emu_Base();	
	emm.driver.quit();	
		
	}
	
	
}

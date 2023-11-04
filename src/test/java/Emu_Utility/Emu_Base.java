package Emu_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;





public class Emu_Base {

	public static WebDriver driver;
	public static Properties EmPro;
	
	public Emu_Base() {
	try {
		FileInputStream emFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Emu_Config//Emu_Config.Properties"));
		EmPro = new Properties();
		EmPro.load(emFle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	public void EmBrowser() {
		
	String EmAllBrowser	= EmPro.getProperty("EmBrowser1");
	if(EmAllBrowser.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+("//Emu_ChromeDriver//chromedriver.exe"));
		ChromeOptions fff = new ChromeOptions();
		fff.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Emu_Utiliti .pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Emu_Utiliti .implicitlyWait));
		driver.manage().window().maximize();
		
	
		}
	else if (EmAllBrowser.equalsIgnoreCase("Edge")) {
		System.setProperty("Webdriver.edge.driver",System.getProperty("user.dir")+("//Emu_EdgeDriver//msedgedriver.exe"));
		EdgeOptions fff1 = new EdgeOptions();
		fff1.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Emu_Utiliti.pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Emu_Utiliti.implicitlyWait));
		driver.manage().window().maximize();
			
		
		
	}
		
	}
	
	public static void EmLaunchURL(String URL) {
		driver.get(EmPro.getProperty("EmURL"));
		
		
	}
	
	
	
	
	
}

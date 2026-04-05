package Stepdefs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import GenaricLib.Baseclass;
import GenaricLib.Propertyfiles;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	WebDriver driver=Baseclass.driver;
	Propertyfiles pfile=new Propertyfiles();
	@Before
	public void openApp() throws IOException {
	 driver.get(pfile.getProperty("URL"));
	 driver.manage().window().maximize();
	}
	@After
	public void closeApp() {
		driver.quit();
	}

}

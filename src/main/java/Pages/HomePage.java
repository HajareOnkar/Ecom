package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//a[normalize-space()='Home']")
	private WebElement moduleName;
	
	@FindBy(xpath="//h2[normalize-space()='Category']")
	private WebElement catagorytab;
	
	
	@FindBy(xpath="//div[@id=\"accordian\"]//div//h4/a")
	private WebElement catagorytabvalues;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String actualHomePageTitle() {
		return driver.getTitle();
	}

	public WebElement getCatagorytab() {
		return catagorytab;
	}
	
	public WebElement getcatagorytabvalues() {
		return catagorytabvalues;
	}
	
	

}

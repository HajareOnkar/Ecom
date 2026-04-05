package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	public WebDriver driver;
	
	//dropdown
	public void selectDropDownValueByIndex(WebElement ele,int index) {
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	public void selectDropDownValueByvalue(WebElement ele,String value) {
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	public void selectDropDownValueByVisibletext(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	public void deselectDropDownValueByIndex(WebElement ele,int index) {
		Select s=new Select(ele);
		s.deselectByIndex(index);
	}
	public void deselectDropDownValueByvalue(WebElement ele,String value) {
		Select s=new Select(ele);
		s.deselectByValue(value);
	}
	public void deselectDropDownValueByVisibletext(WebElement ele,String text) {
		Select s=new Select(ele);
		s.deselectByVisibleText(text);
	}
	public void checkDropDownIsmultiple(WebElement ele) {
		Select s=new Select(ele);
		s.isMultiple();
	}
	public void getAllDropDownValue(WebElement ele) {
		Select s=new Select(ele);
		s.getOptions();
	}
	public void getAllSelectedDropDownValue(WebElement ele) {
		Select s=new Select(ele);
		s.getAllSelectedOptions();
	}
	
	//Actions
	
	public void hoverOnEle(WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void doubleClickOnEle(WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void rightClickOnEle(WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void dragAndDrop(WebElement src,WebElement trg) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src,trg).perform();
	}
	
	//Scrollbar
	
	public void scrollPage(int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void scrollToEle(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",ele);
	}
	
	//frame
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	public void switchBackFromFrame() {
		driver.switchTo().defaultContent();
	}
	
	//

}

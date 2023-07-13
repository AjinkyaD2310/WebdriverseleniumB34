package TestPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		Select sinSel = new Select(driver.findElement(By.id("select-demo")));
		sinSel.selectByValue("Wednesday");
		sinSel.selectByVisibleText("Wednesday");
		
		Select mulSel = new Select(driver.findElement(By.id("multi-select")));
		
		mulSel.selectByVisibleText("Florida");
		mulSel.selectByVisibleText("Ohio");
		mulSel.selectByVisibleText("Texas");

	}

}

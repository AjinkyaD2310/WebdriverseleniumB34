package TestPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxradio {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		WebElement optchk = driver.findElement(By.xpath("//input[@class=\"cb1-element\"]"));
		

	}

}

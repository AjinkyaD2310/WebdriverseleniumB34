package TestPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepagetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		
//		WebElement schBox = driver.findElement(By.name("q"));
//		WebElement schBox = driver.findElement(By.id("APjFqb"));
		
//		WebElement schBox = driver.findElement(By.className("gLFyf"));
		WebElement schBox = driver.findElement(By.tagName("textarea"));
		schBox.sendKeys("Java Tutorial");
		
//		schBox.sendKeys(Keys.ENTER);
		schBox.submit();
		System.out.println("Page title : " + driver.getTitle());
		System.out.println("Current url  : "+driver.getCurrentUrl());
		driver.navigate().back();
		//wait commands
		System.out.println("Page title : " + driver.getTitle());
		driver.navigate().forward();
//		driver.getPageSource();
		
		
		
	}

	}



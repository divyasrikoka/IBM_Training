package seleniumtest;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivertest1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		

	}

}

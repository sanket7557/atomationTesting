package day1browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.setProperty("wedriver.chrome.driver",".\\drivers\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://demo.vtiger.com/vtigercrm.index.php");
          System.out.println("Login page title :"+driver.getTitle());
          driver.findElement(By.id("username")).sendKeys("admin");
          driver.findElement(By.name("Password")).sendKeys("manager");
          driver.findElement(By.id("login button")).click();
          
	}

}

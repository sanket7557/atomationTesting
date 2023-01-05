package day10browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileBlazePath {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.get("https://demoblaze.com");
        
        driver.findElement(By.cssSelector("a[onclick=\"byCat('phone')\"]")).click();
        WebElement price1=driver.findElement(By.xpath("//div[h4[a[text()='Samsung galaxy s6']]]/h5"));
        System.out.println("Samsung Galaxy S6 Price :"+price1.getText());

	}
}

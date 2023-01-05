package day9browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String
         ChromeExepath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
         System.setProperty("WebDriver.chrome.driver", ChromeExepath);
         WebDriver driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.get("https://www.redbus.in/");
         
         
	}

}

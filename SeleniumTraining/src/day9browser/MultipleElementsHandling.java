package day9browser;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webriver.chrome.driver","./drivers/chromeriver,exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.com/");
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         driver.manage().window().maximize();
         WebElement searchInputFiled=driver.findElement(By.name("q"));
         searchInputFiled.sendKeys("Selenium Testing");
         List<WebElement> suggList=driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div[2]/div[1]/span"));
	     int suggCount=suggList.size();
	     System.out.println(suggCount);
	     for(int i=0;i<suggCount;i++);{
	     System.out.println(suggList.get(suggCount).getText());
	     }
	     driver.close();
	}
	

}

package day10browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeColorandFont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String
        chromeExePath=System.getProperty("user.dir")+".\\drivers\\Chromedriver.exe";
        System.setProperty("WebDriver.chrome.driver", chromeExePath);
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.id("LoginButton")).click();
      WebDriverWait Wait=new WebDriverWait(driver,30); 
      Wait.until(ExpectedConditions.textToBe(By.cssSelector(".errormsg"),"Username or Password is invalid.please try again."));
      WebElement
      errorMsg=driver.findElement(By.cssSelector(".erromsg"));
      String
      errorColorInRGBA=errorMsg.getCssValue("color");
      System.out.println("Error msg color code :"+errorColorInRGBA);
      String
      errorFontSize=errorMsg.getCssValue("font-size");
      System.out.println("Error msg Font size :"+errorFontSize);
      
	}

}

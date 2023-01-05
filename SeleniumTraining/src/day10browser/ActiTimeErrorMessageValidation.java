package day10browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeErrorMessageValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
     System.setProperty("Webdriver.chrome.driver",chromeExePath);
     WebDriver driver=new ChromeDriver();
     //Implicit wait
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.get("https://demo.actitime.com/login.do");
     driver.findElement(By.id("LoginButton")).click();
     //Explicit wait
     WebDriverWait wait=new WebDriverWait(driver,30);
     wait.until(ExpectedConditions.textToBe(By .cssSelector(".errormsg"),"username or password is invaild.please try again."));
     WebElement errormsg=driver.findElement(By.cssSelector	(".errormsg"));
     String errorColorInRGBA=errormsg.getCssValue("Color");
     String errorFontSize=errormsg.getCssValue("Font-Size");
     System.out.println("ErrorMsg Color Code:"+errorColorInRGBA);
     System.out.println("Error Font Size :"+errorFontSize);
	}

}

package mouseandkeyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       String ChromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
       System.setProperty("webdriver.chrome.driver", ChromeExePath);
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       driver.get("https://demo.actitime.com/login.do");
       driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
       Thread.sleep(2000);
       driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
      
	}

}

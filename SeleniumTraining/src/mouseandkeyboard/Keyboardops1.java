package mouseandkeyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String ChromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
       System.setProperty("webdriver.chrome.driver",ChromeExePath);
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.get("http://demo.automationtesting.in/Register.html");
       WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
       firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
       firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
       
	}

}

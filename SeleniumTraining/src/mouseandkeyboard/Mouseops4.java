package mouseandkeyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ChromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();	
		WebElement userNameInputField=driver.findElement(By.name("firstname"));
        userNameInputField.sendKeys("admin");
        action.doubleClick(userNameInputField).perform();
        userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
        driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}

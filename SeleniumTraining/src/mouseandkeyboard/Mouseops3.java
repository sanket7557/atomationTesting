package mouseandkeyboard;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseops3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      String ChromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", ChromeExePath);
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
      WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
      driver.switchTo().frame(frame);
      Actions act=new Actions(driver);
      List<WebElement>sourceElements= driver.findElements(By.cssSelector("ul#gallery>li"));
      WebElement target=driver.findElement(By.id("trash"));
      for(int i=0;i<sourceElements.size();i++) {
    	  performDranAndDrop(act, sourceElements.get(i), target);
			Thread.sleep(1000);
    	  
      }
	}

	private static void performDranAndDrop(Actions act, WebElement webElement, WebElement target) {
		
		
	}

}

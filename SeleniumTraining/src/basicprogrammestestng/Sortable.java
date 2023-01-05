package basicprogrammestestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Sortable extends SeleniumUtility {
  @Test
  public void testjquery() {
	  WebDriver driver=setUp("chrome","https://jqueryui.com/sortable/");
	  
	  driver.switchTo().frame(0);
	  List<WebElement>items=driver.findElements(By.cssSelector("#sortable>li"));
	  for(int i = 0;i<items.size()-1;i++) {
		  performDranAndDrop(items.get(items.size()), items.get(i));
	  }
	  
  }
}

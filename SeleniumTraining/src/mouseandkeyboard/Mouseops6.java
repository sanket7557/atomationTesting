package mouseandkeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mouseops6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SeleniumResuableFunctions s1=new SeleniumResuableFunctions();
        WebDriver driver=s1.setUp("Chrome","https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium");
	}

}

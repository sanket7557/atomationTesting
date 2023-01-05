package day9browser;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String
          chromeExePath=System.getProperty("user.dir")+"\\Executables\\Chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver",chromeExePath);
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://demo.actitime.com");
		   WebElement
		   userNameInputField=driver.findElement(By.id("username"));
		   userNameInputField.clear();
		   userNameInputField.sendKeys("admin");
		   WebElement
		   passwordInputField=driver.findElement(By.name("pwd"));
		   passwordInputField.clear();
		   passwordInputField.sendKeys("manager");
		   WebElement
		   loginButton=driver.findElement(By.id("loginButton"));
		   loginButton.click();
		   driver.findElement(By.id("container_tasks")).click();
		   List <WebElement>
		   taskName=driver.findElement(By.cssSelector(".taskRowsTable.names.title"));
		   List <String> tasklist=new ArrayList<String>();
		   for(WebElement task: taskName) {
			   tasklist.add(task.getText());
		   }
		   
	System.out.println(tasklist.contains("3D modelling"));
		   
	}

}

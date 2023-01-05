package day9browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeErrorMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String
		chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome,driver",chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBe(By.cssSelector(".errormsg"),"Username or Password is invalid. Please try again."));
		WebElement
		errorMsg=driver.findElement(By.cssSelector(".errormsg"));
		WebElement
        usernameInputField=driver.findElement(By.id("username"));
		Point
		errorPosition=errorMsg.getLocation();
		int error_X_Cord=errorPosition.getX();
		int error_Y_Cord=errorPosition.getY();
		System.out.println("msg x-cords-->"+error_X_Cord);
		System.out.println("msg y-cotds-->"+error_Y_Cord);
		Point
		usernamePosition=usernameInputField.getLocation();
		int username_X_Cord=usernamePosition.getX();
		int username_Y_Cord=usernamePosition.getY();
		System.out.println("username x cord-->"+username_X_Cord);
		System.out.println("username y cord-->"+username_Y_Cord);
		System.out.println("Is error msg getting displayed above username input field:"+(error_Y_Cord));
	}
}

	

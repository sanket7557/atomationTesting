package day1browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //set the driver executable path using system.set properties
	
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				//enter the required URL
				driver.get("https://demo.automationtesting.in/Register.html");
				
				String pageTitle=driver.getTitle();
				System.out.println("Page title is: "+pageTitle);
				System.out.println("Page title validation: "+pageTitle.equals("Register"));
				
				//get current page url
				System.out.println("Page url is: "+driver.getCurrentUrl() );
				
				//get page source code
				String sourceCode=driver.getPageSource();
				System.out.println("Page source code is: "+sourceCode);
				System.out.println("Source code lenght: "+sourceCode.length());
				//close current browser instance opened by webdriver
				driver.close();
			}
		}

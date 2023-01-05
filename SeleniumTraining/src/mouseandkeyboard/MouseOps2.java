package mouseandkeyboard;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOps2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String ChromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");
		List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("Main menu Option Count:"+mainMenu.size());
		Actions act=new Actions (driver);
	//	for(int i=0;i<mainMenu.size();i++) {
	//		WebElement option=mainMenu.get(i);
	//		act.moveToElement(option).perform();
	//		Thread.sleep(1000);
	//	rightClick(act, mainMenu.get(1));
		}

	static void mouseHoverOverInTheElement(Actions act, WebElement element) {
		act.moveToElement(element).perform();

		
	}
	static void rightClick(Actions act, WebElement option) {
		System.out.println("Option name is : " + option.getText());
		act.moveToElement(option).contextClick().build().perform();
		// act.contextClick(option).build().perform();
	}
	static void mouseHoverWithCords(Actions act, WebElement option, int x, int y) {
		System.out.println("Option name is : " + option.getText());
		act.moveToElement(option, x, y).perform();
	}
	static void mouseHover(Actions act, List<WebElement> mainMenu) throws InterruptedException {
		for (int i = 0; i < mainMenu.size(); i++) {
			WebElement option = mainMenu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1000);
}

}}
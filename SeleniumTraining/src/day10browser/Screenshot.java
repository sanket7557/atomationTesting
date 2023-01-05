package day10browser;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import mouseandkeyboard.SeleniumUtility;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SeleniumUtility m1=new SeleniumUtility();
    WebDriver driver=m1setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
    TakesScreenshot ts=(TakesScreenshot)driver;
    File file=ts.getScreenshotAs(OutPut.FILE);
    FileUtils.copyFile(file,new File(".\\screenshots\\vtiger.jpg"));
	}

	private static WebDriver m1setUp(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}

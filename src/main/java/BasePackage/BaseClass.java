package BasePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	
	
	public static void BrowserLanuch() {
		driver = new ChromeDriver();
		
	}
	
	public static void getURL(String url) {
		driver.get(url);
	}
	
	public static void maximise() {
		driver.manage().window().maximize();
	}
	
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public static void jsScroll(WebElement elements) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",elements);
	}
	
	public static void screenshot(WebDriver driver,String imgName) throws IOException {
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File ImgType = screenshot.getScreenshotAs(OutputType.FILE);
		
//		User screenshot folder path
		
		File ImgPath = new File("C:\\Users\\Revanth\\eclipse-workspace\\Testing_LumaWebsite\\Luma Screenshot\\"+imgName+".png");
		FileUtils.copyFile(ImgType, ImgPath);
	}
	
	public static void quit() {
		
		driver.quit();
		
	}
	
}

package New;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base8 {
	public static WebDriver driver;
	
	public static  WebDriver launchBrowser(WebDriver browsername,String url) {
	
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
		"D:\\User\\Selenium\\Driverchrome\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
}
	public static void sendmeth(WebElement element,String value) {
		element.sendKeys(value);
		
	}

	public static void clickmeth(WebElement element) {
		
		element.click();
		
		
		
	}
}

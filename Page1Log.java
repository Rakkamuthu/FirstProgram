package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1Log {
	public  WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement getUsername() {
		return username;
	}

	public static void setUsername(WebElement username) {
		Page1Log.username = username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static void setPassword(WebElement password) {
		Page1Log.password = password;
	}

	public static WebElement getLogin() {
		return login;
	}

	public static void setLogin(WebElement login) {
		Page1Log.login = login;
	}

	@FindBy(id="username")
  private static WebElement  username;
	@FindBy(id="password")
  private static WebElement password;
	@FindBy(id="login")
  private static WebElement login;
	
	public Page1Log (WebDriver driver1) {
		this .driver=driver1;
		PageFactory.initElements(driver, this);
	}

}//continued

package New;

import org.openqa.selenium.WebDriver;

public class PageHotel {

	public static void main(String[] args) {
		WebDriver driver = null;
	Page1Log a=new Page1Log(driver);
	Page2 b=new Page2();
	 Page3 c=new Page3();
	Page4 d=new Page4();
	Page5 e=new Page5();
	Base8 f=new Base8();
		
		f.launchBrowser("chrome", "https://adactinhotelapp.com/BookedItinerary.php");

	}

}

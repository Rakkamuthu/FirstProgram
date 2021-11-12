package New;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page4 {
	@FindBy(id="first_name")
	private static WebElement fname;
	@FindBy(id="last_name")
	private static WebElement lname;
	@FindBy(id="address")
	private static WebElement address;
	@FindBy(id="cc_num")
	private static WebElement credit;
	@FindBy(id="cc_type")
	private static WebElement cardtype;
	@FindBy(id="cc_exp_month")
	private static WebElement edate;
	@FindBy(id="cc_exp_year")
	private static WebElement eyear;
	@FindBy(id="cc_cvv")
	private static WebElement cvv;
	@FindBy(id="book_now")
	private static WebElement book;
	
	
	
	

}

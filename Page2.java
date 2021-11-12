package New;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page2 {

	@FindBy(id="location")
	private static WebElement location;
	@FindBy(id="hotels")

	private static WebElement hotel;
	@FindBy(id="room_type")
	private static WebElement roomtype;
@FindBy(id="room_nos")
	private static WebElement nosroom;
@FindBy(id="datepick_in")
	private static WebElement datein;
@FindBy(id="datepick_out")
	private static WebElement dateout;
@FindBy(id="adult_room")
	private static WebElement adultper;
@FindBy(id="child_room")
	private static WebElement childper;
@FindBy(id="Submit")
	private static WebElement Search;

}

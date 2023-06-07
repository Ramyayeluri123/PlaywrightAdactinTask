package Pages;

import com.DataManager.ReadDataFromJsom;
import com.microsoft.playwright.Page;

import java.io.FileNotFoundException;

public class SearchHotelPage {
    public Page page;
   ReadDataFromJsom readDataFromJsom;
    public SearchHotelPage(Page page) {
        this.page = page;
        readDataFromJsom=new ReadDataFromJsom();
    }
    String Location="#location";
    String hotelName="//select[@id='hotels']";
    String CheckInDate = "//input[@id='datepick_in']";
    String CheckOutDate = "//input[@id='datepick_out']";
String clickingSearch="#Submit";

    public void inputsOfSearchHotel() throws InterruptedException, FileNotFoundException {
        page.type(Location,readDataFromJsom.readValueFromJson("Location"));
        page.type(hotelName,readDataFromJsom.readValueFromJson("Hotels"));
        page.type(CheckInDate,readDataFromJsom.readValueFromJson("Check In Date"));
        page.type(CheckOutDate,readDataFromJsom.readValueFromJson("Check Out Date"));
//        Locator Location = page.locator("#location");
//        Location.selectOption(new SelectOption().setValue("New York")); //using index
//        Locator Hotels = page.locator("//select[@id='hotels']");
//        Hotels.selectOption(new SelectOption().setValue("Hotel Sunshine"));
////        Locator RoomType=page.locator("//select[@id='room_type']");
////        RoomType.selectOption(new SelectOption().setValue("Deluxe"));
//        Locator NumberOfRooms=page.locator("//select[@id='room_nos']");
//        NumberOfRooms.selectOption(new SelectOption().setValue("2"));
//        page.locator(CheckInDate).fill("28/05/2023");
//        page.locator(CheckOutDate).fill("31/05/2023");
//        Locator AdultsPerRoom=page.locator("//select[@id='adult_room']");
//        AdultsPerRoom.selectOption(new SelectOption().setValue("2"));
//        Locator ChildrenPerRoom=page.locator("#child_room");
//        ChildrenPerRoom.selectOption(new SelectOption().setValue("0"));
        page.click(clickingSearch);
    }
}

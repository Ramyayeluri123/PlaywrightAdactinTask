package Pages;

import com.DataManager.ReadDataFromJsom;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class BookedItineraryPage {
    public Page page;
    ReadDataFromJsom readDataFromJsom;

    public BookedItineraryPage(Page page) {
        this.page = page;
        readDataFromJsom =new ReadDataFromJsom();
    }
    String bookedItinerary="//a[normalize-space()='Booked Itinerary']";
    String selectingHotelFromBooked="//input[@value='803218']";
    public void selectedRooms() throws InterruptedException {
        page.click(bookedItinerary);
        Thread.sleep(3000);
        page.click(selectingHotelFromBooked);
        Locator BookedHotelItinerary= page.locator("input[value='803218']");
        BookedHotelItinerary.textContent();

    }
}
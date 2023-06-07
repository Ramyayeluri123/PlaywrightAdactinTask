package Pages;

import com.DataManager.ReadDataFromJsom;
import com.microsoft.playwright.Page;

import java.io.FileNotFoundException;
import java.nio.file.Paths;

public class BookingHotelPage {

    public Page page;
    ReadDataFromJsom readDataFromJsom;
    public BookingHotelPage(Page page){
        this.page=page;
        readDataFromJsom=new ReadDataFromJsom();

    }
//    String clickingContinue="//input[@id='continue']";
    String firstName="#first_name";
    String lastName="#last_name";
    String Address="#address";
    String creditCardNumber="#cc_num";
    String creditCardType="#cc_type";
    String expMonth="#cc_exp_month";
    String expYear="#cc_exp_year";
    String CvvNumber="#cc_cvv";
    String bookHotel="#book_now";
    String validationMessage="#process_span";
    String myItinerary="#my_itinerary";
    public void bookingAHotelCredentials() throws FileNotFoundException, InterruptedException {
//        page.click(clickingContinue);
        page.type(firstName,readDataFromJsom.readValueFromJson("FirstName"));
        Thread.sleep(3000);
        page.type(lastName,readDataFromJsom.readValueFromJson("LastName"));
        page.type(Address,readDataFromJsom.readValueFromJson("BillingAddress"));
        page.type(creditCardNumber,readDataFromJsom.readValueFromJson("CreditCard"));
        page.type(creditCardType,readDataFromJsom.readValueFromJson("CreditCardType"));
        page.type(expMonth,readDataFromJsom.readValueFromJson("expMonth"));
        page.type(expYear,readDataFromJsom.readValueFromJson("expYear"));
        page.type(CvvNumber,readDataFromJsom.readValueFromJson("CvvNumber"));
        page.click(bookHotel);
        page.click(myItinerary);
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(".BookingScreenshot/Booking.png")));//direct screenshot by playwright
//        page.click(myItinerary);
//        page.type(firstName,"Ramya");
//        page.type(lastName,"Yeluri");
//        page.type(Address,"Dallascenter");
//        page.type(creditCardNumber,"1234567892345678");
//        Locator creditCardType= page.locator("#cc_type");
//        creditCardType.selectOption(new SelectOption().setIndex(1));
//        Locator ExpirySelectMonth=page.locator("#cc_exp_month");
//        ExpirySelectMonth.selectOption(new SelectOption().setIndex(6));
//        Locator ExpirySelectYear=page.locator("#cc_exp_year");
//        ExpirySelectYear.selectOption(new SelectOption().setValue("2023"));
////        page.type(CvvNumber,"2345");
//        page.click(bookHotel);
//      Locator validationMessage=page.locator("#process_span");
//      validationMessage.textContent();
//        System.out.println(validationMessage);

    }
}

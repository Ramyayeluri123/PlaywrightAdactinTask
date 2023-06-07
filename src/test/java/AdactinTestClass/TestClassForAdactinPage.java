package AdactinTestClass;
import com.BaseClass.BaseClassTest;
import com.DataManager.ReadDataFromJsom;
import Pages.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

public class TestClassForAdactinPage extends BaseClassTest {
    ReadDataFromJsom readDataFromJsom;
    public LoginPage loginPage;
    public SearchHotelPage searchHotel;
    public SelectHotelPage selectHotel;
    public BaseClassTest baseClass1;
    public BookingHotelPage bookingHotel;
    public BookedItineraryPage bookedItinerary;
    @BeforeTest
    public void setup() {
//     baseClass1=new BaseClass1();
//        page = baseClass1.initBrowser("chrome");
        readDataFromJsom=new ReadDataFromJsom();
        loginPage=new LoginPage(page);
        searchHotel=new SearchHotelPage(page);
        selectHotel=new SelectHotelPage(page);
        bookingHotel=new BookingHotelPage(page);
        bookedItinerary=new BookedItineraryPage(page);

    }
    @Test(priority = 1)
    public void LoginPage() throws Exception {
        loginPage.clickingLogInButton();
    }
        @Test(priority = 2)
        public void searchHotel() throws InterruptedException, FileNotFoundException {

        searchHotel.inputsOfSearchHotel();
    }
    @Test(priority = 3)
    public void selectingHotelRooms(){
        selectHotel.SelectingHotel();

    }
    @Test(priority = 4)
    public void setBookingHotel() throws FileNotFoundException, InterruptedException {
        bookingHotel.bookingAHotelCredentials();
    }
    @Test(priority = 5)
    public void setBookedItinerary() throws InterruptedException {
        bookedItinerary.selectedRooms();
    }

    }



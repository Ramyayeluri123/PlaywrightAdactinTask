package Pages;

import com.DataManager.ReadDataFromJsom;
import com.microsoft.playwright.Page;
public class SelectHotelPage {
    public Page page;
    ReadDataFromJsom readDataFromJsom;
    public SelectHotelPage(Page page){
        this.page=page;
        readDataFromJsom=new ReadDataFromJsom();
    }
    String selectingHotel="#radiobutton_1";
    String clickingContinue="//input[@id='continue']";
    public void SelectingHotel(){
      page.click(selectingHotel);
      page.click(clickingContinue);
    }
}

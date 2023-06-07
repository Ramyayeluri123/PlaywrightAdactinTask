package Pages;

import com.DataManager.ReadDataFromExcel;
import com.DataManager.ReadDataFromJsom;
import com.microsoft.playwright.Page;

public class LoginPage {
    ReadDataFromJsom readDataFromJsom;
    ReadDataFromExcel readDataFromExcel;
    public Page page;
    public LoginPage(Page page){
        this.page=page;
        readDataFromJsom=new ReadDataFromJsom();
        readDataFromExcel=new ReadDataFromExcel();
    }

    String userName="#username";
    String Password="#password";
    String Login="#login";
    public void clickingLogInButton() throws Exception {
        page.type(userName,readDataFromJsom.readValueFromJson("UserName"));
        System.out.println(page.textContent(userName));
        page.type(Password,readDataFromJsom.readValueFromJson("Password"));
//        page.type(userName, ReadDataFromExcel.ExcelReading(1,0));
//        page.type(Password,ReadDataFromExcel.ExcelReading(1,1));
        page.click(Login);
    }
}

package Adc.CommonMethods.Adc;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
public class Common
{
Playwright playwright;
Browser browser;
Page page;
public void Common(Page page) {
    this.page = page;
}
public void clickOnElement(WebElement page){
        try {
         page.click();
        }catch (NoSuchElementException nse){
            nse.printStackTrace() ;
        }catch (ElementClickInterceptedException eci){
            eci.printStackTrace();
        }catch (ElementNotInteractableException ene){
            ene.printStackTrace();
        }
}
public void clickDropDown(WebElement element,String text){
    Locator clickOnDropDownElement=page.locator("element");
    clickOnDropDownElement.selectOption(new SelectOption().setValue(text));
    clickOnDropDownElement.selectOption(new SelectOption().setLabel(text));
    clickOnDropDownElement.selectOption(new SelectOption().setIndex(Integer.parseInt(text)));
}
public void sendingData(WebElement element,String text){
page.locator("element")  .type("text");
}
}

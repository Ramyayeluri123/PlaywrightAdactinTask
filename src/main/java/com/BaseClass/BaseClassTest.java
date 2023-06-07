package com.BaseClass;
import com.microsoft.playwright.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClassTest {
    Playwright playwright;
    Browser browser;
    BrowserContext browserContext;
    public  Page page;
    @BeforeTest
    public void launchingBrowser(){
        initBrowser("chrome");
    }
    public Page initBrowser(String browserName) {
        System.out.println("browser name is:"+browserName);
        playwright=Playwright.create();
        switch (browserName.toLowerCase()){
            case "firefox":
                browser=playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "chrome":
                browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
                break;
            case "Chromium":
                browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "safari":
                browser=playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
            default:
                System.out.println("please pass right browser");
                break;
        }
        browserContext=browser.newContext();
        page=browserContext.newPage();
        page.navigate("http://adactinhotelapp.com/");
        return page;
    }
    @AfterTest
    public void tearDown(){
        page.context().browser().close();
    }
}


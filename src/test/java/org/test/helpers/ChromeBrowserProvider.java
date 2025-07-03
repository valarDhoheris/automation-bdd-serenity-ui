package org.test.helpers;

import net.serenitybdd.annotations.Managed;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ChromeBrowserProvider implements DriverSource {

    @Managed
    static WebDriver driver;

    @Override
    public WebDriver newDriver(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }

}

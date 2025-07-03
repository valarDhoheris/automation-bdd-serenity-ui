package org.test.pages;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.test.helpers.ChromeBrowserProvider;

public class Login_Page extends PageObject {

    private static final Logger log = LoggerFactory.getLogger(Login_Page.class);
    @FindBy(xpath = "//span[text()='Hello, sign in']")
    WebElementFacade signInButton;

    @FindBy(xpath = "//input[@name='email']")
    WebElementFacade userNameTextField;

    @FindBy(xpath = "//input[@type='password']")
    WebElementFacade passwordTextField;

    @FindBy(xpath = "//input[@type='submit']")
    WebElementFacade submitButton;

    ChromeBrowserProvider chrome = new ChromeBrowserProvider();
    @Managed
    static WebDriver driver;

    public void launchUrl(String url) {

        driver = chrome.newDriver();
        setDriver(driver);
        getDriver().manage().window().maximize();
        getDriver().get(url);
    }

    public void signInClick() {
        signInButton.waitUntilClickable();
        clickOn(signInButton);
    }

    public void loginWithCredentials() {
        userNameTextField.waitUntilPresent();
        typeInto(userNameTextField, "1234567890");
        submitButton.click();
        passwordTextField.waitUntilPresent();
        typeInto(passwordTextField, "Test@123");
        submitButton.click();
    }

    public void closeBrowser(){
        getDriver().quit();
    }
}

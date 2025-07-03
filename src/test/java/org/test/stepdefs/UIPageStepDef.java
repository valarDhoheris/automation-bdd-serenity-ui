package org.test.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.test.pages.Login_Page;

public class UIPageStepDef {

    private static final Logger logger = LoggerFactory.getLogger(UIPageStepDef.class);

    @Steps
    Login_Page login;

    @Given("User launches browser with url {string}")
    public void user_is_on_Home_Page(String url) throws Throwable {
            login.launchUrl(url);
    }

    @When("^User Navigate to Sign-in Page$")
    public void user_Navigate_to_Signin_Page() throws Throwable {
        System.out.println("SSSS");
        login.signInClick();
    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        login.loginWithCredentials();
    }

    @And("User closes the browser")
    public void closeBrowser(){
        login.closeBrowser();
    }
}


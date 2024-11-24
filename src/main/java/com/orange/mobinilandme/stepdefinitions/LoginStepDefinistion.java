package com.orange.mobinilandme.stepdefinitions;

import com.orange.mobinilandme.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginStepDefinistion {
    private AppiumDriver driver;
    private LoginPage loginPage;
    private WebDriverWait wait;

    @Given("User opens the application")
    public void userOpensTheApplication() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Test");
        caps.setCapability(MobileCapabilityType.APP, "/Users/amrashraf/IdeaProjects/StareApp/STAR_V_1.0.0_1.apk");
        caps.setCapability("autoGrantPermissions", true);
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

        loginPage = new LoginPage(driver);

        wait = new WebDriverWait(driver, 30);
    }

    @When("User chooses Arabic language")
    public void userChoosesArabicLanguage() {
        loginPage.selectArabicLanguage();
    }

    @And("User accepts the terms and conditions")
    public void userAcceptsTheTermsAndConditions() {
       loginPage.Allowpermission();
    }

    @And("User presses the next button multiple times and starts login")
    public void userPressesNextButtonMultipleTimesAndStartsLogin() {

           loginPage.pressNextButton();
        loginPage.pressNextButton();
        loginPage.pressNextButton();
    }

    @And("User enters phone number and password")
    public void userEntersPhoneNumberAndPassword() throws InterruptedException {
        loginPage.Phoneclick();
        loginPage.Phone("01226885843"); // Consider passing parameters rather than hardcoding values
        loginPage.Passwordclick();
        loginPage.password("Sherry@2025");
        loginPage.loginbun();
        Thread.sleep(3333);
    }


}


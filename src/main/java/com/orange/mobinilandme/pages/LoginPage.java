package com.orange.mobinilandme.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private AppiumDriver driver;
    private WebDriverWait wait;

    // Locators
    private By ArabicLan = By.id("com.orange.mobinilandme:id/ar");
    private By EN = By.xpath("//android.widget.Button[@resource-id='com.orange.mobinilandme:id/eng']");
    private By AcceptTerms = By.id("com.android.permissioncontroller:id/permission_allow_button");
    private By NextHome = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    private By Statlogin = By.id("com.orange.mobinilandme:id/tv_getstarted");
    private By phone = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    private By password = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    private By Login = By.xpath("//android.widget.Button[@content-desc=\"Sign In\"]");
    private By Skip = By.xpath("//android.widget.Button[@content-desc=\"Skip\"]");

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30); // Sets a 10 second wait
    }

    public void selectArabicLanguage() {
        wait.until(ExpectedConditions.elementToBeClickable(ArabicLan)).click();
    }

    public void pressNextButton() {
        wait.until(ExpectedConditions.elementToBeClickable(NextHome)).click();
    }



    public void Startlogin() {
        wait.until(ExpectedConditions.elementToBeClickable(Statlogin)).click();
    }

    public void Phone(String phoneNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phone)).sendKeys(phoneNumber);
    }
    public void Phoneclick() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phone)).click();
    }
    public void Passwordclick() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).click();
    }
    public void password(String pwd) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(pwd);
    }
public  void Allowpermission(){
    wait.until(ExpectedConditions.elementToBeClickable(AcceptTerms)).click();
}
    public void loginbun() {
        wait.until(ExpectedConditions.elementToBeClickable(Login)).click();
    }
}
package com.orange.mobinilandme.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingupPage {
    private AppiumDriver driver;
    private WebDriverWait wait;

    // Locators
    private By ArabicLan = By.id("com.orange.mobinilandme:id/ar");
    private By EN = By.xpath("//android.widget.Button[@resource-id='com.orange.mobinilandme:id/eng']");
    private By AcceptTerms = By.id("com.orange.mobinilandme:id/accept");
    private By NextHome = By.id("com.orange.mobinilandme:id/tv_next");
    private By Statlogin = By.id("com.orange.mobinilandme:id/tv_getstarted");
    private By phone = By.id("com.orange.mobinilandme:id/edTxt_phoneNo");
    private By password = By.id("com.orange.mobinilandme:id/edTxt_password");
    private By Login = By.id("com.orange.mobinilandme:id/btn_login");
    private By allowPermision = By.id("com.android.packageinstaller:id/permission_allow_button");

    private By showPassword = By.id("عرض كلمة المرور");
    private By forgetpassword = By.id("com.orange.mobinilandme:id/tvForgotPassword");
    private By Sigup = By.id("com.orange.mobinilandme:id/txt_createAccount");

    private By phoneNumberReg = By.xpath("//android.widget.EditText[@resource-id=\"com.orange.mobinilandme:id/\" and @text=\"رقم الهاتف\"]");
    private By emailReg = By.xpath("//android.widget.EditText[@resource-id=\"com.orange.mobinilandme:id/\" and @text=\"البريد الإلكتروني\"]");
    private By denayPermission = By.id("com.android.packageinstaller:id/permission_deny_button");

    private By sigupButn = By.xpath("//android.widget.Button[@resource-id=\"com.orange.mobinilandme:id/\"]");
    public SingupPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30); // Sets a 10 second wait
    }

    public void selectArabicLanguage() {
        wait.until(ExpectedConditions.elementToBeClickable(ArabicLan)).click();
    }

    public void pressNextButton() {
        wait.until(ExpectedConditions.elementToBeClickable(NextHome)).click();
    }

    public void getAcceptTerms() {
        wait.until(ExpectedConditions.elementToBeClickable(AcceptTerms)).click();
    }

    public void Startlogin() {
        wait.until(ExpectedConditions.elementToBeClickable(Statlogin)).click();
    }

    public void Phone(String phoneNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phone)).sendKeys(phoneNumber);
    }

    public void password(String pwd) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(pwd);
    }

    public void loginbun() {
        wait.until(ExpectedConditions.elementToBeClickable(Login)).click();
    }
}
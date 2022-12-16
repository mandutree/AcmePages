package com.applitools.demo.page.web;

import com.appium.Page;
import com.applitools.demo.page.catalog.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebLoginPage extends Page implements LoginPage {
    public WebLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void enterUsername(String username) {
        super.sendKey(new By.ById("username"), username);
    }

    @Override
    public void enterPassword(String password) {
        super.sendKey(new By.ById("password"), password);
    }

    @Override
    public void clickSignIn() {
        super.click(new By.ById("log-in"));
    }
}

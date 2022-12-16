package com.applitools.demo.page.catalog;

import com.applitools.demo.page.common.PageType;
import com.applitools.demo.page.web.WebLoginPage;
import org.openqa.selenium.WebDriver;

public interface LoginPage {
    void enterUsername(String username);
    void enterPassword(String password);
    void clickSignIn();

    static LoginPage create(WebDriver driver, PageType type) {
        switch (type) {
            case WEB:
                return new WebLoginPage(driver);
            default:
                throw new RuntimeException("Unknown LoginPage type");
        }
    }
}

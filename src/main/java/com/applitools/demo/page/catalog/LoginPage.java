package com.applitools.demo.page.catalog;

import com.applitools.demo.ClientType;
import com.applitools.demo.page.web.WebLoginPage;
import org.openqa.selenium.WebDriver;

public interface LoginPage {
    void enterUsername(String username);
    void enterPassword(String password);
    void clickSignIn();

    static LoginPage create(WebDriver driver, ClientType clientType) {
        switch (clientType) {
            case WEB:
                return new WebLoginPage(driver);
            default:
                throw new RuntimeException("Client type has not been implemented for login page: " + clientType);
        }
    }
}

package com.applitools.demo
    ;

import com.applitools.demo.page.catalog.HomePage;
import com.applitools.demo.page.catalog.LoginPage;
import org.openqa.selenium.WebDriver;

public class AcmeCatalog {
    private final WebDriver driver;
    private final ClientType clientType;

    public AcmeCatalog(WebDriver driver, ClientType clientType) {
        this.driver = driver;
        this.clientType = clientType;
    }

    public LoginPage loginPage() {
        return LoginPage.create(driver, clientType);
    }

    public HomePage homePage() {
        return HomePage.create(driver, clientType);
    }
}

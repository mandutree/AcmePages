package com.applitools.demo
    ;

import com.applitools.demo.page.catalog.HomePage;
import com.applitools.demo.page.catalog.LoginPage;
import com.applitools.demo.page.common.PageType;
import org.openqa.selenium.WebDriver;

public class AcmeCatalog {
    private final WebDriver driver;
    private final PageType pageType;

    public AcmeCatalog(WebDriver driver, PageType type) {
        this.driver = driver;
        this.pageType = type;
    }

    public LoginPage loginPage() {
        return LoginPage.create(driver, pageType);
    }

    public HomePage homePage() {
        return HomePage.create(driver, pageType);
    }
}

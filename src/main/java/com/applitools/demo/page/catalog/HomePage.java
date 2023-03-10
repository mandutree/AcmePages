package com.applitools.demo.page.catalog;

import com.applitools.demo.component.catalog.HeaderBar;
import com.applitools.demo.component.catalog.LeftNav;
import com.applitools.demo.component.catalog.Overview;
import com.applitools.demo.component.catalog.Transactions;
import com.applitools.demo.ClientType;
import com.applitools.demo.page.web.WebHomePage;
import org.openqa.selenium.WebDriver;

public interface HomePage {
    Transactions recentTransactions();
    Overview financialOverview();
    HeaderBar headerBar();
    LeftNav leftNav();
    void clickAddAccount();
    void clickMakePayment();

    static HomePage create(WebDriver driver, ClientType clientType) {
        switch (clientType) {
            case WEB:
                return new WebHomePage(driver);
            default:
                throw new RuntimeException("Client type has not been implemented for home page: " + clientType);
        }
    }
}

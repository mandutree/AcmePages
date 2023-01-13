package com.applitools.demo.page.web;

import com.appium.Page;
import com.applitools.demo.component.catalog.HeaderBar;
import com.applitools.demo.component.catalog.LeftNav;
import com.applitools.demo.component.catalog.Overview;
import com.applitools.demo.component.catalog.Transactions;
import com.applitools.demo.component.web.WebHeaderBar;
import com.applitools.demo.component.web.WebLeftNav;
import com.applitools.demo.component.web.WebOverview;
import com.applitools.demo.component.web.WebTransactions;
import com.applitools.demo.page.catalog.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebHomePage extends Page implements HomePage {
    public WebHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public Transactions recentTransactions() {
        return new WebTransactions(this.driver, "//div[@class='element-wrapper'][h6[contains(text(),'Recent Transactions')]]");
    }

    @Override
    public Overview financialOverview() {
        return new WebOverview(this.driver, "//div[contains(@class,'element-wrapper')][h6[contains(text(),'Financial Overview')]]");
    }

    @Override
    public HeaderBar headerBar() {
        return new WebHeaderBar(this.driver, "//div[contains(@class,'top-bar')]");
    }

    @Override
    public LeftNav leftNav() {
        return new WebLeftNav(this.driver, "//div[contains(@class,'menu-w')]");
    }

    @Override
    public void clickAddAccount() {
        click(new By.ByXPath("//a[contains(@class,'btn-primary')]"));
    }

    @Override
    public void clickMakePayment() {
        click(new By.ByXPath("//a[contains(@class,'btn-success')]"));
    }
}

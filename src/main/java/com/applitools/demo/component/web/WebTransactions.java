package com.applitools.demo.component.web;

import com.appium.Component;
import com.applitools.demo.component.catalog.Grid;
import com.applitools.demo.component.catalog.Transactions;
import org.openqa.selenium.WebDriver;

public class WebTransactions extends Component implements Transactions {
    public WebTransactions(WebDriver driver, String xPath) {
        super(driver, xPath);
    }

    @Override
    public String title() {
        return getChildText("//h6[@class='element-header']");
    }

    @Override
    public Grid grid() {
        return new WebGrid(this.driver, xPathToSelf + "//table[contains(@class,'table')]");
    }
}

package com.applitools.demo.component.web;

import com.appium.Component;
import com.applitools.demo.component.catalog.GridRow;
import org.openqa.selenium.WebDriver;

public class WebGridRow extends Component implements GridRow {
    public WebGridRow(WebDriver driver, String xPath) {
        super(driver, xPath);
    }

    @Override
    public String status() {
        return getChildText("//span[contains(@class,'status-pill')]/following-sibling::span");
    }

    @Override
    public String date() {
        return getChildText("//td[@class='nowrap']/following-sibling::td[1]/span[1]");
    }

    @Override
    public String description() {
        return getChildText("//td[@class='cell-with-media']/span");
    }

    @Override
    public String category() {
        return getChildText("//a[contains(@class,'badge')]");
    }

    @Override
    public String amount() {
        return getChildText("//td[contains(@class,'text-right')]/span");
    }
}

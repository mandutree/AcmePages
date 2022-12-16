package com.applitools.demo.component.web;

import com.appium.Component;
import com.applitools.demo.component.catalog.HeaderBar;
import org.openqa.selenium.WebDriver;

public class WebHeaderBar extends Component implements HeaderBar {
    public WebHeaderBar(WebDriver driver, String xPath) {
        super(driver, xPath);
    }
}

package com.applitools.demo.component.web;

import com.appium.Component;
import com.applitools.demo.component.catalog.Overview;
import org.openqa.selenium.WebDriver;

public class WebOverview extends Component implements Overview {
    public WebOverview(WebDriver driver, String xPath) {
        super(driver, xPath);
    }
}

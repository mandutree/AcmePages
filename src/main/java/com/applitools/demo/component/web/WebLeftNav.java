package com.applitools.demo.component.web;

import com.appium.Component;
import com.applitools.demo.component.catalog.LeftNav;
import org.openqa.selenium.WebDriver;

public class WebLeftNav extends Component implements LeftNav {
    public WebLeftNav(WebDriver driver, String xPath) {
        super(driver, xPath);
    }
}

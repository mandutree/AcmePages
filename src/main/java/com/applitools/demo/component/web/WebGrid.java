package com.applitools.demo.component.web;

import com.appium.Component;
import com.applitools.demo.component.catalog.Grid;
import com.applitools.demo.component.catalog.GridRow;
import org.openqa.selenium.WebDriver;

public class WebGrid extends Component implements Grid {
    public WebGrid(WebDriver driver, String xPath) {
        super(driver, xPath);
    }

    @Override
    public int rowCount() {
        return countChild("//td[@class='nowrap']");
    }

    @Override
    public GridRow rowByIndex(int index) {
        return new WebGridRow(this.driver, String.format(xPathToSelf + "//tr[td[@class='nowrap']][%d]", index + 1));
    }

    @Override
    public GridRow rowByDescription(String descriptions) {
        return new WebGridRow(this.driver, String.format(xPathToSelf + "//tr[td[@class='nowrap']][descendant::span[text()='%s']]", descriptions));
    }
}

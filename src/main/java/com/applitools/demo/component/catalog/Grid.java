package com.applitools.demo.component.catalog;

public interface Grid {
    int rowCount();
    GridRow rowByIndex(int index);
    GridRow rowByDescription(String descriptions);
}

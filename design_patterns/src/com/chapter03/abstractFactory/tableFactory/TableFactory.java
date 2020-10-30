package com.chapter03.abstractFactory.tableFactory;

import com.chapter03.abstractFactory.factory.Factory;
import com.chapter03.abstractFactory.factory.Link;
import com.chapter03.abstractFactory.factory.Page;
import com.chapter03.abstractFactory.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}

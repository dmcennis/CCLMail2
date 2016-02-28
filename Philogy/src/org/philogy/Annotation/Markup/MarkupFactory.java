package org.philogy.annotation.markup;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class MarkupFactory {
    private static MarkupFactory ourInstance = new MarkupFactory();

    public static MarkupFactory getInstance() {
        return ourInstance;
    }

    private MarkupFactory() {
    }
}

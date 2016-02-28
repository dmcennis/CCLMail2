package org.philogy.textsource.textcomponent;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class TextComponentFactory {
    private static TextComponentFactory ourInstance = new TextComponentFactory();

    public static TextComponentFactory getInstance() {
        return ourInstance;
    }

    private TextComponentFactory() {
    }
}

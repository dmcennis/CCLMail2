package org.philogy.textsource;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class TextSourceFactory {
    private static TextSourceFactory ourInstance = new TextSourceFactory();

    public static TextSourceFactory getInstance() {
        return ourInstance;
    }

    private TextSourceFactory() {
    }
}

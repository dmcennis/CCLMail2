package org.philogy.textsource.texttree;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class TextTreeFactory {
    private static TextTreeFactory ourInstance = new TextTreeFactory();

    public static TextTreeFactory getInstance() {
        return ourInstance;
    }

    private TextTreeFactory() {
    }
}

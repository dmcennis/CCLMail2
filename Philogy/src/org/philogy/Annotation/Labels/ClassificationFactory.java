package org.philogy.annotation.labels;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class ClassificationFactory {
    private static ClassificationFactory ourInstance = new ClassificationFactory();

    public static ClassificationFactory getInstance() {
        return ourInstance;
    }

    private ClassificationFactory() {
    }
}

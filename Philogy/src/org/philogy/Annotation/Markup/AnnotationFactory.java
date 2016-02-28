package org.philogy.annotation.markup;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class AnnotationFactory {
    private static AnnotationFactory ourInstance = new AnnotationFactory();

    public static AnnotationFactory getInstance() {
        return ourInstance;
    }

    private AnnotationFactory() {
    }
}

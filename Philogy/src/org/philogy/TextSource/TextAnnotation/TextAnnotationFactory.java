package org.philogy.textsource.textannotation;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class TextAnnotationFactory {
    private static TextAnnotationFactory ourInstance = new TextAnnotationFactory();

    public static TextAnnotationFactory getInstance() {
        return ourInstance;
    }

    private TextAnnotationFactory() {
    }
}

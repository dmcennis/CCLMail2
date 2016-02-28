package org.philogy.transform.translation;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class TranslationFactory {
    private static TranslationFactory ourInstance = new TranslationFactory();

    public static TranslationFactory getInstance() {
        return ourInstance;
    }

    private TranslationFactory() {
    }
}

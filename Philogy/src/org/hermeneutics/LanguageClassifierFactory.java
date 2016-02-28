package org.hermeneutics;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class LanguageClassifierFactory {
    private static LanguageClassifierFactory ourInstance = new LanguageClassifierFactory();

    public static LanguageClassifierFactory getInstance() {
        return ourInstance;
    }

    private LanguageClassifierFactory() {
    }
}

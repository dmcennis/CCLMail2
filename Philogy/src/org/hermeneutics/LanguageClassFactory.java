package org.hermeneutics;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class LanguageClassFactory {
    private static LanguageClassFactory ourInstance = new LanguageClassFactory();

    public static LanguageClassFactory getInstance() {
        return ourInstance;
    }

    private LanguageClassFactory() {
    }
}

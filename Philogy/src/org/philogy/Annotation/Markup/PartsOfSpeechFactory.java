package org.philogy.annotation.markup;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class PartsOfSpeechFactory {
    private static PartsOfSpeechFactory ourInstance = new PartsOfSpeechFactory();

    public static PartsOfSpeechFactory getInstance() {
        return ourInstance;
    }

    private PartsOfSpeechFactory() {
    }
}

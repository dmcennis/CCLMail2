package org.hermeneutics;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class ClassDefinitionFactory {
    private static ClassDefinitionFactory ourInstance = new ClassDefinitionFactory();

    public static ClassDefinitionFactory getInstance() {
        return ourInstance;
    }

    private ClassDefinitionFactory() {
    }
}

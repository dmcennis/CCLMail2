package org.hermeneutics;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class ClassHeuristicFactory {
    private static ClassHeuristicFactory ourInstance = new ClassHeuristicFactory();

    public static ClassHeuristicFactory getInstance() {
        return ourInstance;
    }

    private ClassHeuristicFactory() {
    }
}

package org.philogy.annotation.labels;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class LabelsFactory {
    private static LabelsFactory ourInstance = new LabelsFactory();

    public static LabelsFactory getInstance() {
        return ourInstance;
    }

    private LabelsFactory() {
    }
}

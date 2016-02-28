package org.hermeneutics;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class SupervisedLearningClassifierFactory {
    private static SupervisedLearningClassifierFactory ourInstance = new SupervisedLearningClassifierFactory();

    public static SupervisedLearningClassifierFactory getInstance() {
        return ourInstance;
    }

    private SupervisedLearningClassifierFactory() {
    }
}

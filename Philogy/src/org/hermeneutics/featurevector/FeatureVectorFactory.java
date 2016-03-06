package org.hermeneutics.featurevector;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class FeatureVectorFactory {
    private static FeatureVectorFactory ourInstance = new FeatureVectorFactory();

    public static FeatureVectorFactory getInstance() {
        return ourInstance;
    }

    private FeatureVectorFactory() {
    }
}

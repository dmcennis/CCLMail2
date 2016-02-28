package org.philogy.transform.aggregation;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class AggregationFactory {
    private static AggregationFactory ourInstance = new AggregationFactory();

    public static AggregationFactory getInstance() {
        return ourInstance;
    }

    private AggregationFactory() {
    }
}

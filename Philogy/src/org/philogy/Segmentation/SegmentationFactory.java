package org.philogy.segmentation;

/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class SegmentationFactory {
    private static SegmentationFactory ourInstance = new SegmentationFactory();

    public static SegmentationFactory getInstance() {
        return ourInstance;
    }

    private SegmentationFactory() {
    }
}

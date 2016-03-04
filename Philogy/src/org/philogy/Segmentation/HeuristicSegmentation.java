/**
 * Created by Daniel McEnnis on 3/3/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */

package org.philogy.segmentation;

import org.dynamicfactory.descriptors.Properties;
import org.philogy.Operation;

/**
 * Default Description Google Interview Project
 */
public class HeuristicSegmentation implements Segmentation {

    /**
     * Default constructor for HeuristicSegmentation
     */
    public HeuristicSegmentation() {

    }

    @Override
    public Operation prototype() {
        return new HeuristicSegmentation();
    }

    @Override
    public Operation prototype(Properties props) {
        return new HeuristicSegmentation();
    }
}

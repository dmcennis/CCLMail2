/**
 * Created by Daniel McEnnis on 2/26/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */

package org.philogy.transform.aggregation;

import org.dynamicfactory.descriptors.Properties;
import org.philogy.Operation;
import org.philogy.transform.Transform;

/**
 * Default Description Interface Aggregation
 */
public interface Aggregation extends Transform {
    @Override
    Aggregation prototype();

    @Override
    Aggregation prototype(Properties props);
}

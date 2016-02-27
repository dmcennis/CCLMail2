/**
 * Created by Daniel McEnnis on 2/26/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */

package org.philogy.transform;

import org.dynamicfactory.descriptors.Properties;
import org.philogy.Operation;

/**
 * Default Description Interface Transform
 */
public interface Transform extends Operation {

    Transform duplicate();
    Transform duplicate(Properties props);
}

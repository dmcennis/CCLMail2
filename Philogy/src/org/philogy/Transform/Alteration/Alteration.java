/**
 * Created by Daniel McEnnis on 2/26/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */

package org.philogy.transform.alteration;

import org.dynamicfactory.descriptors.Properties;
import org.philogy.transform.Transform;

/**
 * Default Description Interface Alteration
 */
public interface Alteration extends Transform {
    Alteration duplicate(Properties props);
    Alteration duplicate();
}

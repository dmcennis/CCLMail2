/**
 * Created by Daniel McEnnis on 2/26/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */

package org.philogy;

import org.dynamicfactory.Creatable;
import org.dynamicfactory.descriptors.Properties;
import org.philogy.textsource.TextSource;

/**
 * Default Description Interface Operation
 */
public interface Operation extends Creatable<Operation> {

    TextSource action(TextSource source, Properties props);

}

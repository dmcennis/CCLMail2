/**
 * Created by Daniel McEnnis on 2/26/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */

package org.hermeneutics.featurevector;

import org.philogy.textsource.textannotation.TextAnnotation;

/**
 * FeatureVector Interface
 *
 * <p>Interface for performing traditional machine learning</p>
 * <p>For license reasons, this must use a generic format with adapter classes in other projects. As a consequence, a
 * 'encompassing' format with automated translations to other machine learning formats in forks of those projects.</p>
 * <p>These feature definitions must produce fixed length content. This can be Java enums or numeric. An understanding
 * of the statistical consequences of automated translations between these two formats is required. In particular, the
 * default transformation for enums is 0 or 1 in an independent vector for every different enum category. Especially for
 * features with huge number of categories (like words), this can result in massive expansions of the number of features.
 * Second, 0 or 1 can create implicitly meaninglessly small feature weights which can cause classification problems with
 * some learners - most notably nearest neighbor</p>
 * <p>Also note, these feature definitions are TextAnnotations, implicitly linked to their original textual content and
 * context.</p>
 */
public interface FeatureVector extends TextAnnotation {

    double[] getVector();

    Enum getEnum(int i);

    Enum getEnum(String name);

}

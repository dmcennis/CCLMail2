/**
 * Created by Daniel McEnnis on 3/5/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */

package org.hermeneutics.similarity;

import org.hermeneutics.featurevector.FeatureVector;

/**
 * Similarity
 *
 * <p>Produces a single number representing distance between two feature vectors by some mechanism. This function can be
 * highly problematic for feature vectors with numerous enumerated components</p>
 */
public interface Similarity<Type extends FeatureVector> {
    double similarity(Type left, Type right);
}

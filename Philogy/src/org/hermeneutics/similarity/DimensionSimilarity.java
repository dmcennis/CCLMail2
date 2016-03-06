/**
 * Created by Daniel McEnnis on 3/6/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */

package org.hermeneutics.similarity;

/**
 * DimensionSimilarity
 *
 * <p>Interface for a transform for two dimensions to a fixed number. This interface is for a single dimension. It assumes
 * that similarity inside a dimension is deterministic without context. Useful for dimensions that require unusual
 * metrics (like log similarity) are required and recreating all feature vectors is impossible (due to the size of the
 * corpus).</p>
 */
public interface DimensionSimilarity {
    double similarity(double left, double right);
}

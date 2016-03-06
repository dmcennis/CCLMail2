/**
 * Created by Daniel McEnnis on 3/6/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */

package org.hermeneutics.similarity;

/**
 * EnumSimilarity
 *
 * <p>Sometimes assuming independence of enumeration dimensions is undesirable. An explicit similarity function can map
 * these enums into an implicit much lower dimensional space (reducing th curse of dimensionality). This can be
 * calculated (such as word co-occurrence data) or heuristics by an expert</p>
 */
public interface EnumSimilarity<Left extends Enum,Right extends Enum> {
    public double similarity(Left left, Right right);
}

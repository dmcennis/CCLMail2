/**
 * Created by Daniel McEnnis on 2/26/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */

package org.philogy.textsource;

import org.dynamicfactory.Creatable;
import org.dynamicfactory.descriptors.Properties;
import org.philogy.textsource.textannotation.TextAnnotation;

import java.util.Map;

/**
 * Generic Object for a piece of symbolic information in written form in the Composite Gang of Four Pattern.
 * The structure is assumed only to be describable via a tree without assumption of a linear format.  All operations
 * and transforms are of immutable text objects to aid in distributed processing, creating new objects that may include
 * back references to earlier immutable objects. This system uses the Pipeline design pattern where the core components
 * are elements of the Operation class. Labels, annotations, and other additions to TextSource content are a special
 * form of child node accessible both by getChildren() and by getAnnotation().
 *
 * Basic children interfaces of note:
 *
 * <ul>
 *     <li>TextSource - Object capable of representing linear symbolic content. Primary location for data source classes
 *     such as database-based objects, network objects, and in memory access mechanisms</li>
 * <li>TextTree - tree structure that encompasses TextSources with additional mechanisms to recreating a linear sequence of
 * symbols that represent this text construct and mechanisms for deep selection. </li>
 * <li>TextComponet - designd to be raw linear symbols only</li>
 * <li>Annotation - metadata on a TextSource object tat can only be unerstood relative to a child TextSource</li>
 * <li>Label - an annotation that provides global content relative to a TextSource</li>
 * <li>(CCLMail) EmailLabel - represents an email header with pre-parsed information accessible as a custom label
 * or as a feature vector</li>
 * <li>(Hermeneutics) FeatureVector - Label that provides a fixed vector length representation of a TextSource</li>
 * <li>(Hermeneutics) SupervisedLabelClass - collection of possible ordered TextSources assigned to a ground truth of a
 * particular particular class label</li>
 * </ul>
 */
public interface TextSource extends Creatable<TextSource> {

    TextSource[] getChildren();

    TextSource getChildren(int i);

    TextSource getParent();

    Map<String,TextAnnotation> getAnnotation();

    String getText();

}

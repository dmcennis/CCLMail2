/**
 * Created by Daniel McEnnis on 2/27/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */

package org.philogy.transform;

import org.dynamicfactory.descriptors.Parameter;
import org.dynamicfactory.descriptors.Properties;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Default Description Google Interview Project
 */
public class TransformFactory extends org.dynamicfactory.AbstractFactory<Transform> {

    static private TransformFactory inst = null;

    static private TransformFactory newInstance(){
        if(inst==null){
            inst= new TransformFactory();
        }
        return inst;
    }

    static public Transform create(){
        return newInstance().create("Default");
    }

    /**
     * Default constructor for TransformFactory
     */
    public TransformFactory() {

    }


    @Override
    public Transform create(Properties props) {
        Transform ret=null;
        if(props == null){
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING,"The properties object passed to TransformFactory is null - using a default");
            return (map.get("Default")).duplicate();
        }
        if(props.quickCheck("ClassName",String.class)){
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING,"The properties object passed to TransformFactory has no class type defined - using a default");
            return (map.get("Default").duplicate(props));
        }
        return map.get(props.get("Transform").getValue().get(0)).duplicate(props.merge(properties));
    }

}

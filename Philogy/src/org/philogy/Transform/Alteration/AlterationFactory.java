package org.philogy.transform.alteration;

import org.dynamicfactory.AbstractFactory;
import org.dynamicfactory.descriptors.Parameter;
import org.dynamicfactory.descriptors.Properties;
import org.philogy.transform.Transform;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Daniel McEnnis on 2/27/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class AlterationFactory extends AbstractFactory<Alteration>{
    private static AlterationFactory ourInstance = new AlterationFactory();

    public static AlterationFactory getInstance() {
        return ourInstance;
    }

    private AlterationFactory() {
    }

    @Override
    public Alteration create(Properties props) {
        if(props == null){
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING,"The properties object passed to TransformFactory is null - using a default");
            return (map.get("Default")).duplicate();
        }
        if(!props.quickCheck("ClassType",String.class)){
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING,"The properties object passed to TransformFactory has no class type defined - using a default");
            return (map.get("Default").duplicate(props));
        }
        return map.get(props.get("ClassName").getValue().get(0)).duplicate(props.merge(properties));
    }

    @Override
    public Parameter getClassParameter() {
        return properties.get("ClassName");
    }

}

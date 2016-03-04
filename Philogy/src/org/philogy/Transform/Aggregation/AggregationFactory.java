package org.philogy.transform.aggregation;

import org.dynamicfactory.AbstractFactory;
import org.dynamicfactory.descriptors.Properties;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by Daniel McEnnis on 2/28/2016
 * <p/>
 * Copyright Daniel McEnnis 2015
 */
public class AggregationFactory extends AbstractFactory<org.philogy.transform.aggregation.Aggregation>{
    private static AggregationFactory ourInstance = new AggregationFactory();


    public static AggregationFactory getInstance() {
        return ourInstance;
    }

    private AggregationFactory() {
    }

    @Override
    public Aggregation create(Properties props) {
        if(props == null){
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING,"The properties object passed to AggregatorFactory is null - using a default");
            return (map.get("Default")).prototype();
        }
        if(!props.quickCheck("ClassType",String.class)){
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING,"The properties object passed to AggregatorFactory has no class type defined - using a default");
            return (map.get("Default")).prototype(props);
        }
        return map.get(props.get("ClassName").getValue().get(0)).prototype(props.merge(properties));
    }

}

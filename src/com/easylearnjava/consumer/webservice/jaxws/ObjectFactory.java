
package com.easylearnjava.consumer.webservice.jaxws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.easylearnjava.consumer.webservice.jaxws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.easylearnjava.consumer.webservice.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserWrapper }
     * 
     */
    public UserWrapper createUserWrapper() {
        return new UserWrapper();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

}

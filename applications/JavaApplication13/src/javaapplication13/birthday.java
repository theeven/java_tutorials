/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author panchal
 */
public class birthday {
    // We are creating this class to learn Composition. Composition is, in a 
    // class, one can have instances/members, methods and also can have 
    // references to other classes. As below. Lets see how & how can we use it.
    private String name;
    private date birthday;
    
    // Now lets create constructor for this class.
    public birthday (String n, date b) {
        name = n;
        birthday = b;
        System.out.format("The Constructor for this birthday Object is %s\n", this); 
    }
    
    // Now lets creating toString method to out put string format for each 
    // object created or called.
    public String toString() {
        return String.format("My Name is %s And my Birthday is %s", name, birthday);
    }
    
}

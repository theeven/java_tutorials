/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author panchal
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Lets learn Inheritance (Using extends)
        // Inheritence is nothing but super/sub class relationship, the way sub
        // class inherits all the members of super class & provides more to it.
        // many a times, mutiple classes shared common features, which could be 
        // then maintained in a common class called super class. Hence, if req
        // to be changed not needed to make bunch of changed, but one change to 
        // super class takes care of all. Go checkout other classes first.
        
        // Now lets create some objects of apple & banana class & see if they
        // can access fruit class methods.
        
        apple appleObject = new apple();
        banana bananaObject = new banana();
        
        appleObject.sample();
        bananaObject.sample();
        
        // Looks like they can. & the reason, banana class is returning diff
        // output is coz, banana class is over-riding method written in fruit
        // class, some time one needs to do slightly diff then common method in
        // super class, in that case, one can re-write whole method in sub-class
        // and by defalt subclass method takes precedence over super class.
    }
}

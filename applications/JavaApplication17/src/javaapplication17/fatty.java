/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author panchal
 */
public class fatty {
    // Lets just create one single method here. Since digest method takes one 
    // single argument as food object, it prety much means it can take any 
    // object aruguments of its subclass, by default. hence, even tuna & potpie 
    // object could be pased here.
    public void digest (food x) {
        x.eat();
    }
}

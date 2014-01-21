/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author panchal
 */

// If you want user to stop making objects out of super class coz it doesn't 
// have all methods like sub claases, one can use abstract in front to lock this
// class preventing object creation.
// abstract public class food {
public class food {
    // So let create a single method in this class.
    public void eat () {
        System.out.println("This is a eat method : food");
    }
}

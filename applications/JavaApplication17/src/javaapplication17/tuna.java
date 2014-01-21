/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author panchal
 */

// extends basically says it is inherting from food class.
public class tuna extends food {
    // Now lets do method over riding of method defined in super class = food
    @Override
    public void eat () {
        System.out.println("This is a eat method : tuna");
    }
}

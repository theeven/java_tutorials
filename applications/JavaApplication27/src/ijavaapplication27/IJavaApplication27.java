/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ijavaapplication27;

import java.util.*;
/**
 *
 * @author panchal
 */
public class IJavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Generic Methods Learning:
        
        // Before we start learning generic methods it's important for one to 
        // know what is Overloaded methods. Overloaded methods are 
        // differentiated by the number and the type of the arguments passed 
        // into the method. In the code sample, draw(String s) and draw(int i) 
        // are distinct and unique methods because they require different 
        // argument types.
        
        // Hence, sometime instead of writing bunch of overloaded methods for 
        // different data types passed as a parameter one can go ahead and 
        // write single genric method. lets see how.
        
        Integer[] iray = {1, 2, 3, 4, 5};
        Character[] cray = {'d', 'e', 'v', 'e', 'n'};
        
        // Lets create following to similar overloaded methods taking diff args.
        printMe(iray);
        printMe(cray);
        
        // We can keep on going for creating bunch of overloaded methods for each
        // data types, but there is easier way to do this, using one single generic
        // method.
        
    }
    
    /*
    // For Integrer Input
    public static void printMe(Integer[] array) {
        for (Integer i : array) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }
    
    // For Character Input
    public static void printMe(Character[] array) {
        for (Character i : array) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }
    */
    
    // Generic Method.
    // As you can see below important thing is to insert <T> inbetween static &
    // void (position is imp) in order to let java know this method is generic
    // for all data types. & then on you can represent data type as T in this 
    // method. method pretty much looks like other methods.
    public static <T> void printMe(T[] array) {
        for (T i : array) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }
}

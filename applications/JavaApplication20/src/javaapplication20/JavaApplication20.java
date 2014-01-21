/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author panchal
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Final program in learning Java.
        // Some string comparison examples.
        
        // Lets define some string variables.
        String a = "apple";
        String b = "banana";
        String c = "BANANA";
        
        // Comparison Example 1.
        if (a == "apple") {
            System.out.println("Its apple");
        }
        
        // Comparison Example 2.
        if (a.equals("apple")) {
            System.out.println("Its apple");
        }
        
        // Comparison Example 3.
        if (b.equalsIgnoreCase(c)) {
            System.out.println("Its banana");
        }
    }
}

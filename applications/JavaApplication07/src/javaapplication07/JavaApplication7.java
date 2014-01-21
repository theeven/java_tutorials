/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication07;

/**
 *
 * @author panchal
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creating an Array table.
        
        System.out.println("Index\tValue");
        // nice way to initialize array at one go.
        // in other case array should be defined first like an object defination
        // int array[] = new int[5];
        // And then initialised.
        int array[] = {22, 33, 21, 23, 43};
        
        // point to be noticed us in built array methof we can use to find
        // array length. array.length
        for (int count = 0; count < array.length; count++) {
            System.out.println(count + "\t" + array[count]);
        }
    }
}

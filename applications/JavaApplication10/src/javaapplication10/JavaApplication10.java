/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author panchal
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Program to use multi dimentional arrays.
        // And print out them in an tabular format.
        
        // Lets intialise to arrays.
        int deven[][] = {{1, 2, 3, 4},{5},{6, 7}};
        int panchal[][] = {{11, 22},{33, 44, 55},{66, 77}};
        
        output(deven);
        output(panchal);
    }
    
    
    // Notice in 2nd loop, since # of columns in a row is not fixed, we are 
    // looping though max length of row. array[row].lenghth
    public static void output(int array[][]) {
        System.out.println("Row\tColumn\tValue");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.println(row + "\t" + col + "\t" + array[row][col]);
            }
        }
    }
}

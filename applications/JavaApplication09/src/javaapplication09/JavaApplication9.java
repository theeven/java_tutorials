/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication09;

/**
 *
 * @author panchal
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Passing an array to a method.
        
        int deven[] = {1, 2, 3, 4, 5};
        change(deven);
        
        for (int i : deven) {
            System.out.println(i);
        }
    }
    
    public static void change(int x[]) {
        for (int i = 0; i < x.length ; i++) {
            x[i] += 5;
        }
    }
}

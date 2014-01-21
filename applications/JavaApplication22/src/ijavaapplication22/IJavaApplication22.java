/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ijavaapplication22;

/**
 *
 * @author panchal
 */
public class IJavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Lets write a program of factorial which includes recursion.
        // 5! = 5*4*3*2*1 = 120
        System.out.println(fact(6));
    }
    
    public static long fact(long x) {
        if (x <= 1) {
            return 1;
        } 
        else {
            return x * fact(x-1);
        }
    }
}

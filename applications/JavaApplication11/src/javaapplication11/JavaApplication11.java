/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author panchal
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Using way to pass variable length argument list to a method.
        // Lets take an example of program finding average of bunch of numbers.
        // how many numbers is not defined.
        int temp = average (3, 4, 5, 2, 4, 9, 7, 6, 5, 33); // # of arguments can vary here.
        System.out.println(temp);
    }
    
    public static int average(int...numbers) {
        int total = 0;
        for (int x : numbers) {
            total += x;
        }
        int avg = total/numbers.length;
        return avg;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication08;

import java.util.Random;

/**
 *
 * @author panchal
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Program to find probability of numbers for a dice rolled for 
        // 1000 times. For java Random Class.
        Random rand = new Random();
        int array[] = new int[7];
        
        for (int count = 0; count < 1000 ; count++) {
            ++array[1+rand.nextInt(6)];
        }
        System.out.println("Index\tCount");
        for (int i = 1; i < array.length; i++) {
            System.out.println(i + "\t" + array[i]*100/1000);
        }
    }
}
// 32
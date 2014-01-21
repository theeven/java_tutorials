/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication06;

import java.util.Random;
/**
 *
 * @author panchal
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Program to obtain Random numbers using Random Class.
        // Lets have Random number program for a dice.
        
        // First we need to create an object to use Random Class.
        Random dice = new Random();
        int count = 10;
        int num;
        while (count > 0) {
            // By default range for random start from 0. 6 below specifies upper
            // limit. which means it will generate random numbers between 0-6
            // But dice doesn't have 0, so, adjusting adding one to compute.
            num = 1 + dice.nextInt(6);
            System.out.println(num);
            --count;
        }
    }
}

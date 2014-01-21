/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication05;

import java.util.Scanner;
/**
 *
 * @author panchal
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        // Program to find average score of a student. for 5 scores.
        // Very straight forward program.
        Scanner input = new Scanner(System.in);
        double score, total, average;
        int counter = 5;
        total = 0;
        
        while (counter > 0) {
            System.out.print("Please Enter Your Score: ");
            score = input.nextDouble();
            total = total + score;
            System.out.println();
            --counter;
        }
        
        average = total/10;
        System.out.println("Your average score is " + average);
    }
}

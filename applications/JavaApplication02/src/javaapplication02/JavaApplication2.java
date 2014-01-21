/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication02;

import java.util.Scanner; 
/**
 *
 * @author panchal
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("What's your name: ");
        String name = input.nextLine();
        
        tuna tunaObject = new tuna();
        tunaObject.simpleMessage(name);
    }
}

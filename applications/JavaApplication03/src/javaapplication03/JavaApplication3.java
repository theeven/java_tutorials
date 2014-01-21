/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication03;

import java.util.Scanner;
/**
 *
 * @author panchal
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you first gf's name: ");
        String temp = input.nextLine();
        
        tuna tunaObject = new tuna();
        // set gf name.
        tunaObject.setName(temp);
        // get results, saying method inturn uses getName method.
        tunaObject.saying();
    }
}

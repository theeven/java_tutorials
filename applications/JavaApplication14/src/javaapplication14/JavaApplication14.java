/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.EnumSet;
/**
 *
 * @author panchal
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Learning Enumerations.
        
        // So, lets make a for loops to print value out of constant enums we 
        // declared in tuna class/enum. So, lets use advance for loop for this 
        // purpose. Well, everytime enum is defined java autometically forms an
        // array for the value of defined objects. & could be acess by array of
        // tuna.values() - accessed by name of the class/enum.
        for (tuna x : tuna.values()) {
            System.out.printf("%s\t%s\t%s\n", x, x.getDesc(), x.getAge());
        }
        System.out.println();
        // This time instead of accessing & priniting out whole array set, lets
        // try to access range of array set using imported EnumSet Class using
        // Range method. in advanced for loop
        for (tuna x : EnumSet.range(tuna.sejal, tuna.mukesh)) {
            System.out.printf("%s\t%s\t%s\n", x, x.getDesc(), x.getAge());
        }        
    }
}

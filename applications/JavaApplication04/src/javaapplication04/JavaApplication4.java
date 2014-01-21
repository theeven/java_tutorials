/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication04;

/**
 *
 * @author panchal
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Since we have a constructor methid in tuna class, while creating
        // tunaObject now we have pass an argument to set it to default value.
        // As that constructor method now accept args as defined.
        // in other case we leave paranthesis empty. as in JavaApplication3.
        tuna tunaObject = new tuna ("gf");
        tunaObject.saying();
        tuna tunaObject1 = new tuna ("gf");
        tunaObject1.saying();
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author panchal
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Time Class
        time timeObject = new time();
        System.out.println("Let's see what time is intialised right after object creation");
        System.out.println(timeObject.getMilitaryTime());
        System.out.println(timeObject.getRegularTime());
        System.out.println();
        
        time timeObject1 = new time(11);
        System.out.println("Let's see what time is intialised right after object creation");
        System.out.println(timeObject1.getMilitaryTime());
        System.out.println(timeObject1.getRegularTime());
        System.out.println();
        
        time timeObject2 = new time(21, 33);
        System.out.println("Let's see what time is intialised right after object creation");
        System.out.println(timeObject2.getMilitaryTime());
        System.out.println(timeObject2.getRegularTime());
        System.out.println();
        
        time timeObject3 = new time(22, 55, 26);
        System.out.println("Let's see what time is intialised right after object creation");
        System.out.println(timeObject3.getMilitaryTime());
        System.out.println(timeObject3.getRegularTime());
        System.out.println();
        
        timeObject.setTime(16, 13, 57);
        System.out.println("Let's see what time is intialised right after setTime");
        System.out.println(timeObject.getMilitaryTime());
        System.out.println(timeObject.getRegularTime());
        System.out.println();
    }
}
// 38
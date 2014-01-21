/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author panchal
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Usecase for toString inbuilt functionality to ontain string 
        // representation of an object. Hence, we are going to create a seperate
        // class with a constructor & print out string representation everytime
        // an object is created.
        
        // Lets now create an Object to see if apple class works.
        date dateObject = new date(9, 13, 1984);
        // You see here for creating an birthday object as specified my birthday
        // constructor in birthday class we need to pass 2 arguments, one for
        // the name & second for a object, as we have used refernce to an object
        // in birthday class as 2nd argument.
        birthday birthdayObject = new birthday("theven", dateObject);
    }
}

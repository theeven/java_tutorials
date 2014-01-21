/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author panchal
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Learning Polymorphism. For learning polymorphism & it's rules, first
        // we need to start from inheritance. So, lets create few sub classes & 
        // a super class, Ans also create one overridden method in both sub 
        // class. Checkout sub/super classes first. & Come back.
        
        // Now as you have seen both sub classes are extending from super class
        // food & overriding single method defined in super class which is eat.
        // Now lets go over to polymorphism, Now the cool thing about poly is 
        // while defining objects of tuna & potpie we need to not use tuna or 
        // potpie data types, instead we can refer to food data type for both.
        // And that is extremely useful, as we are relating each food items with
        // food class. Something as follows.
        food foodObject = new food();
        food tunaObject = new tuna();
        food potpieObject = new potpie();
        
        // The way this could best be used is as following.
        
        food temp[] = new food[2];
        temp[0] = new tuna();
        temp[1] = new potpie();
        
        for (food x : temp) {
            x.eat();
        }
        
        System.out.println();
        
        // So, basically, what we did above is created all different objects of
        // same data type which is food, hence we are able to call them togather
        // And it retuns it's own overided methods.
        
        // Now lets create another class called fatty. Go and refer that & back.
        
        // So, Now lets try to pass food object and other sub class objects to 
        // this class, & see if that works.
        
        fatty fattyObject = new fatty();
        fattyObject.digest(foodObject);
        fattyObject.digest(tunaObject);
        fattyObject.digest(potpieObject);
        
        System.out.println();
    }
}

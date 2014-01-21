/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author panchal
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Learning Static Members (shared members/shared methods), And meaning 
        // of static, logic behind it. Go to a club class first.
        
        // Now Lets declare few objects for club. Entry of few club members.
        club clubObject1 = new club("Deven", "Panchal");
        club clubObject2 = new club("Sejal", "Panchal");
        club clubObject3 = new club("Komal", "Panchal");
        
        // So, basically, the way we are using static here is we have one set
        // of variable, "members" which is shared by all the objects, and 
        // updated when member joins or leaves, instead of updating each 
        // individual copy of variables for each object. This variable remains 
        // static/constant for all 2 objects, as follows.
        
        System.out.println();
        
        System.out.println(clubObject1.getFirstName());
        System.out.println(clubObject1.getLastName());
        System.out.println(clubObject1.getMembers());
        
        System.out.println();
        
        System.out.println(clubObject2.getFirstName());
        System.out.println(clubObject2.getLastName());
        System.out.println(club.getMembers());
        
        System.out.println();
        
        System.out.println(clubObject3.getFirstName());
        System.out.println(clubObject3.getLastName());
        System.out.println(club.getMembers());
        // Since we are accessing static method, which means shared method, we
        // can call it by giving class reference instead of object reference in 
        // above case. As it's shared.
        
        // Now as you can see, when we were created first 3 objects, member 
        // value was changing evey time. But last value was 3. Now when get 
        // methods were called for each objects, member value is identicle, 
        // which means value is shared.
    }
}

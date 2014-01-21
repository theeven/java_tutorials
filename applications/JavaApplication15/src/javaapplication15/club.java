/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author panchal
 */
public class club {
    // Lets define a class for storing club members & total count for members.
    private String firstName;
    private String lastName;
    // Now lets define a static variable which will be shared by each club
    // members, which is count of members. You see below eveytime new object is
    // created goal should be to update member count. which basically means 
    // member variable is affected for each user getting added to club.
    private static int members;
    
    // Lets define a constructor
    public club(String fn, String ln) {
        firstName = fn;
        lastName = ln;
        members++;
        System.out.printf("This is a constructor for %s %s. And club now has %d members.\n", firstName, lastName, members);
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public static int getMembers() {
        return members;
    }
}

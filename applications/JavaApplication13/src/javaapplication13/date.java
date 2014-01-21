/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author panchal
 */
public class date {
    private int month;
    private int day;
    private int year;
    
    public date(int m, int d, int y) {
        // Lets set values for all 3 fields using setApple method. And then
        // print out string presentation of it. In print out statement
        // what is exactly doing is its trying to print out string represntation 
        // of this = current object. & for finding string represntation it will
        // try to find toString method inside this class. By deualf this is 
        // inbuilt & looks for toString method.
        setApple(m, d, y);
        System.out.format("The Constructor for this date Object is %s\n", this);        
    }
    
    public void setApple(int m, int d, int y) {
        month = ((m>=0 && m<=12) ? m : 0);
        day = ((d>=0 && d<=31) ? d : 0);
        year = y;
    }
    
    // This is the method just to provide string representation, name of this 
    // method is chosen to be toString as java can identify this method to 
    // obtain string represntation when called. for example from constructor
    // print statement calling %s asking for this object string format. For,
    // obivious reasons return typr is String & string.format is used.
    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}

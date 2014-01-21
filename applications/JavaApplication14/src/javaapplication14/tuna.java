/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author panchal
 */
public enum tuna {
    
    // declare bunch object for enum class
    deven("me", "26"),
    sejal("wife", "23"),
    dina("mother", "46"),
    mukesh("father", "54");
    
    // final is used we don't want these values to be changed.
    // constant objects.
    private final String desc;
    private final String age;
    
    // Lets create constructor. public void will not work here as this one is 
    // not a class, its a enum. So, just remember this.
    tuna (String d, String a) {
        desc = d;
        age = a;
    }
    
    public String getDesc() {
        return desc;
    }
    public String getAge() {
        return age;
    }
}

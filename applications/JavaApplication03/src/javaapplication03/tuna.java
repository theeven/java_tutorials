/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication03;

import java.util.Locale;

/**
 *
 * @author panchal
 */
public class tuna {
    // This is a private string variable which is only accessible inside this 
    // class. And yes it has a return type String.
    private String girlName; 
    // No return type as this is method is onl used for setting name.
    public void setName(String name) {
        girlName = name;
    }
    // Ofcourse String is a return type as this method returns name of gf.
    public String getName() {
        return girlName;
    }
    // printf is used. % notation is used in this case, followed by argument 
    // specification. In this case method itself is a argument. This also 
    // shows how we can use methods directly within the class without . notation
    public void saying() {
        System.out.printf("Your gf name is %s", getName());
    }
}

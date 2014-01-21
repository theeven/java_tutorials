/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ijavaapplication25;

import java.util.*;
/**
 *
 * @author panchal
 */
public class IJavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Still working on collection class.
        
        String[] stuff = {"apple", "banana", "peach", "mango", "orange"};
        List<String> l1 = Arrays.asList(stuff); // using array class method.
        
        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("yahoo");
        l2.add("youtube");
        l2.add("google");
        
        System.out.println("Original List2:");
        for (String x : l2) {
            System.out.printf("%s =>", x);
        }
        System.out.println("\n");
        
        // As you must have noticed one l1 is a List while l2 is an Array List.
        // But Since, both class are inhertied from Collections Class. We can
        // use Collection class below to perform addAll.
        Collections.addAll(l2, stuff);
        
        System.out.println("Modified List2: After List addition:");
        for (String x : l2) {
            System.out.printf("%s =>", x);
        }
        System.out.println("\n");
        
        // Lets user frequency method of collection class, it pretty much gives
        // us # of time/frequency of object occurence in a list.
        // lets find out frequency/occurence of apple in l2.
        System.out.println("Frequency of \"apple\" in List2:");
        System.out.print(Collections.frequency(l2, "apple"));
        System.out.println("\n");
        
        // lets add some apple objects to l2 & check freq again.
        l2.add("apple");
        l2.add("apple");
        
        System.out.println("Modified List2: object \"apple\" added:");
        for (String x : l2) {
            System.out.printf("%s =>", x);
        }
        System.out.println("\n");
        
        System.out.println("Frequency of \"apple\" in List2:");
        System.out.print(Collections.frequency(l2, "apple"));
        System.out.println("\n");
        
        // Now lets go over to another new method of collections class, called
        // disjoint. it returns true with there is atleast one common element
        // between 2 collections. Since, out l1 & l2 as some common elements
        // it should return false. lets check.
        boolean result = Collections.disjoint(l2, l1);
        System.out.println("Disjoint result between l1 & l2:");
        System.out.println(result + "\n");
        
    }
}

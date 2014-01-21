/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ijavaapplication24;

import java.util.*;
/**
 *
 * @author panchal
 */
public class IJavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Learning Linked Lists
        
        // Lets create 2 arrays & 2 linked lists first.
        String[] things1 = {"apples", "banana", "pears", "strawberry", "peach", "mango"};
        List<String> list1 = new LinkedList<String>();
        for (String x : things1) {
            list1.add(x);
        }
        
        String[] things2 = {"cricket", "strawberry", "rugby", "peach", "pool", "hockey"};
        List<String> list2 = new LinkedList<String>();
        for (String x : things2) {
            list2.add(x);
        }
        
        // Now lets move entire list2 to list1 & empty list2 then.
        list1.addAll(list2);
        list2 = null;
        
        // Now lets following thing, fist print out raw list1. then remove few 
        // element & re-print & then reverse whole lost & re-print.
        // Intermediate Java Tutorial - 7 - LinkedList Program
        
        List<String> list3 = new LinkedList<String>();
        
        printMe(list1);
        removeStuff(list1, 2, 5);
        printMe(list1);
        list3 = reverseMe(list1);
        printMe(list3);
        }
    
    public static void printMe(List<String> l1) {
        for (String x : l1) {
            System.out.printf("%s -> ", x);
        }
        System.out.println();
    }
    
    public static void removeStuff(List<String> l1, int from, int to) {
        l1.subList(from, to).clear();
    }
    
    public static List<String> reverseMe(List<String> l1) {
        ListIterator it = l1.listIterator(l1.size());
        List<String> list3 = new LinkedList<String>();
        
        while (it.hasPrevious()) {
            list3.add(it.previous().toString());
        }
        
        return list3;
    }
}
// 8
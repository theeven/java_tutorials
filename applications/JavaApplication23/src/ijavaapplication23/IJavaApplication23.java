/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ijavaapplication23;

import java.util.*;

/**
 *
 * @author panchal
 */
public class IJavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Learning Collections First Time.
        
        String things1[] = {"eggs", "lasers", "hats", "pie"};
        String things2[] = {"lasers", "hats"};
        
        // Lets create a List now. When you create a list you need to pass data
        // type for the kind of storage you need in that array.
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        
        // Lets input String entries to a both lists.
        for (String x : things1) {
            list1.add(x);
        }
        for (String y : things2) {
            list2.add(y);
        }
        
        // Now since entries to both the lists are complete, lets just try print 
        // out the noth the list.
        
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s::", list1.get(i));
        }
        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            System.out.printf("%s::", list2.get(i));
        }
        System.out.println();
        System.out.println();
        
        // Now lets try to create a method to edit list 1 & check against list 2
        // for removing entries from list 1 which are present in list 2.
        
        // Now lets call that method.
        editlist(list1, list2);
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s::", list1.get(i));
        }
        System.out.println();
        
    }
    
    public static void editlist(Collection<String> l1, Collection<String> l2) {
        // First define a iterator to loop thorugh list 1.
        Iterator<String> it = l1.iterator();
        while (it.hasNext()) {
            if (l2.contains(it.next())) {
                it.remove();
            }
        }
        
    }
}

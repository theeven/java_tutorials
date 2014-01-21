/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ijavaapplication26;

import java.util.*;
/**
 *
 * @author panchal
 */
public class IJavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Learning Stacks
        
        Stack<String> s1 = new Stack<String>();
        s1.push("yahoo");
        s1.push("google");
        s1.push("youtube");
        System.out.printf("%s\n", s1);
        s1.pop();
        System.out.printf("%s\n", s1);
        s1.pop();
        System.out.printf("%s\n", s1);
        
        // As you can see, with each pop method invoked element is taken off the 
        // stack - removed.
        
        // Learning Priority Queue.
        
        PriorityQueue<String> q1 = new PriorityQueue<String>();
        q1.offer("yahoo");
        q1.offer("google");
        q1.offer("youtube");
        System.out.printf("%s\n", q1);
        q1.poll();
        System.out.printf("%s\n", q1);
        q1.poll();
        System.out.printf("%s\n", q1);
        
        // As you can see, each poll operation removes highest priority element 
        // off the queue.
    }
}

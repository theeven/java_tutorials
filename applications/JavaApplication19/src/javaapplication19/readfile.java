/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.*;
import java.util.*;

/**
 *
 * @author panchal
 */
public class readfile {
    private Scanner x;
    
    public void openFile() {
        try {
            x = new Scanner(new File("indian.txt"));
        } catch(Exception e) {
            System.out.println("error occured!");
        }
    }
    
    public void closeFile() {
        x.close();
    }
    
    public void readRecords() {
        while(x.hasNext()) {
            String a = x.next();
            String b = x.next();
            String c = x.next();
            
            System.out.printf("%s %s %s\n", a, b, c);
        }
    }
}

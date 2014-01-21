/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author panchal
 */
public class createfile {
    private Formatter formatterObject;
    
    public void openFile() {
        try {
            formatterObject = new Formatter("indian.txt");
        } catch(Exception e) {
            System.out.println("Error occured!");
        }
    }
    
    public void closeFile() {
        formatterObject.close();
    }
    
    public void addRecords() {
        formatterObject.format("%s%s%s\n", "Deven ", "Panchal ", "26");
    }
    
}

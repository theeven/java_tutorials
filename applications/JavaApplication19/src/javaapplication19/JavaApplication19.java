/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.File;
import java.util.*;
/**
 *
 * @author panchal
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Learning File Class & dealing with files.
        
        // Now lets create an object of a file class.
        // Constructor of a File class takes file path as an argument.
        // So, its imp to pass that while creating an object. You can change 
        // file name to unknown file to check else condition.
        File fileObject = new File("/Users/panchal/test.rge");
        
        if (fileObject.exists()) {
            System.out.println(fileObject.getName() + " exists!");
        } else {
            System.out.println("does not exists!");
        }
        
        // Now lets learn to create a file if not exists. for that first import 
        // all utils libs. Formatter object of of utils libs used for this 
        // purpose. It basically checks for file presence if not found, creates
        // one.
        final Formatter formatterObject;
        try {
            // Formatter method constructor also takes file name as an argument,
            // one can also pass an absolute pass to make sure, file is created
            // at right location and DIR. If just file name is specified as 
            // below, it will be generated in project workspace.
            formatterObject = new Formatter("temp.txt");
            System.out.println("file created");
        } catch(Exception e) {
            System.out.println("error occured!");
        }
        
        // Now lets learn how to write into a file. for that lets create a 
        // seperate class. "createfile" Go checkout createfile class and back.
        createfile x = new createfile();
        x.openFile();
        x.addRecords();
        x.addRecords();
        x.addRecords();
        x.closeFile();
        // Check the file content to see if that works.
        
        // Now lets learn read file. Lets crae readfile class for this. checkout
        // the class and come back.
        readfile y = new readfile();
        y.openFile();
        y.readRecords();
        y.closeFile();
    }
}
//82
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author panchal
 */

// This method is MUST to be abstract as it coctains an abstarct method.
abstract public class food {
    
    // Since this is an abstarct method. Having body is useless. As this one 
    // can't be used, and all sub classes will anyways override this method.
    abstract public void eat();
}

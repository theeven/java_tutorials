/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructures;

import java.io.*;

/**
 *
 * @author panchal
 */
public class TestArrayStack {

    public static void main() {
        ArrayStack arrayStack = new ArrayStack(10);
        int data;

        int i;
        for (i = 0; i < 10; i++) {
            data = new Integer((int)(Math.random()) * 100);
            arrayStack.push(data);
            System.out.println("push: " + data);
        }
        
        while (!arrayStack.isEmpty()) {
            System.out.println("pop: " + (Integer)arrayStack.pop());
        }
    }
}

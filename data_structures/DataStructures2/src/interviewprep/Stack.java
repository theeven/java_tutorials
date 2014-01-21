/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep;

/**
 *
 * @author panchal
 */
public class Stack {
    protected Object head[];
    protected int pointer;
    
    public void Stack(int capacity) {
        head = new Object[capacity];
        pointer = -1;
    }
    
    public boolean isEmpty() {
        return pointer == -1;
    }
    
    public void push(Object o) {
        if (pointer+1 < head.length) {
            head[++pointer] = o;
        }
    }
    
    public Object pop() {
        if (!isEmpty()) {
            return head[pointer--];
        }
        return null;
    }
}

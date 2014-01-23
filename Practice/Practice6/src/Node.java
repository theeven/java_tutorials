/**
 * Creation Date: 1/13/14
 * Creation Time: 10:45 AM
 * Author: Deven Panchal
 * Email: panchal@yahoo-inc.com
 */
public class Node {

    public Object data;
    public Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

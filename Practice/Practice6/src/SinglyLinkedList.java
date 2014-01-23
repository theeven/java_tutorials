/**
 * Creation Date: 1/13/14
 * Creation Time: 10:49 AM
 * Author: Deven Panchal
 * Email: panchal@yahoo-inc.com
 */
public class SinglyLinkedList {

    Node head;

    public SinglyLinkedList() {
        head.next = null;
    }

    public void addAtHead(Object data) {
        Node cache = this.head;
        head = new Node(data, cache);
    }

    public void addAtTail(Object data) {
        Node current = head;
        while (current.next == null) {
            current = current.next;
        }
        current.next = new Node(data, null);
    }

    public Object getHead() {
        return head.data;
    }
}

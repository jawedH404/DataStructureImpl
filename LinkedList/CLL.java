package LinkedList;
public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {      // important 

            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
		    node = node.next;
		}
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val) {
        Node tempNode = head;
        if (tempNode == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (tempNode.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = tempNode.next;
            if (n.val == val) {
                tempNode.next = n.next;
                break;
            }
            tempNode = tempNode.next;
        } while (tempNode != head);

    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
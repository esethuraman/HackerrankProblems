package LinkedList;

/**
 * this program pushes each entry in to the begining of the list
 */
public class LinkedListCreation {

    Node head = null;
    public static void main(String[] args) {
        LinkedListCreation lst = new LinkedListCreation();

        lst.push(4);
        lst.push(5);
        lst.push(1);
        lst.push(3);

        printLinkdLst(lst.head);
    }

    private static void printLinkdLst(Node node) {
        if(node.next != null){
            System.out.println(node.data);
            printLinkdLst(node.next);
        }
        else{
            System.out.println(node.data);
        }

    }

    // pushing entry to the begining of list
    private void push(int data){
        Node node = new Node(data);
        // the previous head becomes the current entry's next
        node.next = head;
        // and current node becomes head
        head = node;

    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

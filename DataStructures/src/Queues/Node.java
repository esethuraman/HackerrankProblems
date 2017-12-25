package Queues;

public class Node {
    Node next;
    Node previous;
    int value;

    Node(int value){
        this.value = value;
        next = null;
        previous = null;
    }
}

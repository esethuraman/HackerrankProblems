package Queues;

/**
 * implemented using doubly linked list
 */
public class Queue {

    LinkListDL lst;

    Queue(){
        lst = new LinkListDL();
    }

    public void enqueue(int value){
        lst.addElementToEnd(value);
    }

    public int dequeue(){
        return lst.removeEndElement();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}

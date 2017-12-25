package Queues;

public class LinkListDL {

    Node tail, head;

    LinkListDL(){
        tail = null;
    }

    public void addElementToEnd(int value){
        Node node = new Node(value);
        Node previous = null;

        if(tail == null){
            tail = node;
            head = node;
        }
        else {
            Node previousHead = head;

            head = node;
            head.next = previousHead;
            previousHead.previous = head;

        }
    }

    public int removeEndElement(){
        Node previous = null;
        int dequeuedValue = 0;

        if(tail == null){
            return -99999;
        }
//        for only one element in the queue
        else if(tail.previous == null){

            dequeuedValue = tail.value;
//            tail = tail.previous;
            tail = null;

        }

        else{
            //        move the pointer till the last node
//            while(tail.next != null){
//                previous = tail;
//                tail = tail.next;
//
//            }next


            dequeuedValue = tail.value;
//        the previous node of last node is now the tail node
//            tail = previous;
            tail = tail.previous;

//      the pointer to the deleted tail node should be detached. hence this
            tail.next = null;
        }


        return dequeuedValue;
    }
}

public class DoublyLnkdLst {

    NodeIns head = null;
    NodeIns last = null;

    public static void main(String[] args) {
        DoublyLnkdLst lst = new DoublyLnkdLst();

        lst.push(1);
        lst.push(2);
        lst.push(3);
        lst.push(4);
        lst.push(5);
        lst.push(6);

        System.out.println(lst.last.data);
        System.out.println(lst.last.next);
        System.out.println(lst.last.prev.data);

    }

    private void removeLast(){
        last = last.prev;
        last.next = null;
    }

    private void removeFirst(){
        head = head.next;
        head.prev = null;
    }
/*
    private void removeRandom(int postition){
        int i=0;
        NodeIns node;
        while((i!=postition) && !(lst.isEmpty())){
            if()
        }
    }*/

    private void push(int data){
        NodeIns node = new NodeIns(data);
//        during first insertion, the node is both the head and last
        if(head == null){
            head = node;
            last = node;
        }

        else{
//            new node's previous node is the last node (before insertion)
            node.prev = last;
//            the next node of last node is now the current node
            last.next = node;
//            new node becomes the last node of the list
            last = node;
        }
    }
}

class NodeIns{
    int data;
//    circular linked list has two more entries - next and previous
    NodeIns next, prev;

    NodeIns(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

package Stacks;

public class LinkList {

    Node head = null;
    int min = Integer.MAX_VALUE;
    int size = 0;

    public void addNodeToTop(int value){
        Node node = new Node(value);
        node.next = this.head;
        this.head = node;

        checkIfMinimum(value);
        size ++;
    }

    public void removeTopNode(){
        if(this.head == null){
            System.out.println("[EXCEPTION] Stack already empty...");
        }
        this.head = this.head.next;
        size--;
    }

    public int returnTopNodeValue(){
        if(this.head == null){
            System.out.println("[EXCEPTION--] Stack already empty...");
            return -99999999;
        }
        return this.head.value;
    }

    private void checkIfMinimum(int value) {
        if(min > value){
            min = value;
        }
    }

    public int getMinimumStackValue(){
        return min;
    }
}

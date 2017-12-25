package LinkedList;

import java.util.Arrays;

/**
 *  Single Linked List node
 */
public class SLNode{
    static SLNode slNode = null;

    SLNode next;
    int value;

    SLNode(int value){
        this.value = value;
        next = null;
    }

    //    code for utilities
    private SLNode(){

    }

    public static SLNode getSLNodeInstance(){
        if(slNode==null){
            slNode = new SLNode();
        }
        return slNode;
    }

    public void printList(SLNode node) {
        while (node != null) {
            System.out.print(node.value);
            if(node.next!= null){
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public SLNode getPopulatedListHead(int[] arr){
        SLNode head=null, node, previousNode=null;
        for(int element : arr){
            node = new SLNode(element);
            if(head == null){
                head = node;
            }
            else{
                previousNode.next = node;
            }
            previousNode = node;
        }
        return head;
    }

}


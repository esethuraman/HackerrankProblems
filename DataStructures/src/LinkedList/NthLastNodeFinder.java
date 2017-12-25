package LinkedList;

/**
 * This program finds the nth node from last for a given linked list
 */
public class NthLastNodeFinder {
    SLNode head = null;

    public static void main(String[] args) {
        NthLastNodeFinder obj = new NthLastNodeFinder();
//        populating the linked list from array values
        obj.head = SLNode.getSLNodeInstance().getPopulatedListHead(new
                int[]{1,2,3,4,5,6,7,8,9});
        SLNode.getSLNodeInstance().printList(obj.head);

//        this finds and prints the nth node's value from last
        getNthLastNode(obj.head, 3);

    }

    private static int getNthLastNode(SLNode node, int n) {
//        the second pointer
        SLNode auxiliaryNode = node;
        int i = 0;

        while(node!=null){
            node = node.next;
//            only after the threshold is reached, this pointer starts moving
            if(i>n-1){
                auxiliaryNode = auxiliaryNode.next;
            }
            i++;
        }
        System.out.println("value at " +n +" from last "+auxiliaryNode.value);
        return auxiliaryNode.value;
    }




}



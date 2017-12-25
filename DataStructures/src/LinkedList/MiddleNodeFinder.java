package LinkedList;

public class MiddleNodeFinder {

    public static void main(String[] args) {

        SLNode slNodeInstance = SLNode.getSLNodeInstance();
        SLNode node = slNodeInstance.getPopulatedListHead(new int[]{1,2,3,4,
                5,6,7,8,9,10});

        getMiddleNode(node);
    }

    public static SLNode getMiddleNode(SLNode node) {
        SLNode auxiliaryNode = node;
//        this flag makes sure auxiliary node is moved once for every two
// moves of primary pointer
        boolean isAuxPtrMoveable = false;

        while(node!=null){
            if(isAuxPtrMoveable){
                auxiliaryNode = auxiliaryNode.next;
            }
            node = node.next;
//            toggling the flag
            isAuxPtrMoveable = !isAuxPtrMoveable;
        }
        System.out.println(auxiliaryNode.value);
        return auxiliaryNode;
    }
}

package LinkedList;

import LinkedList.DeleteNodeSL;

public class MiddleNodeDeletion {
    public static void main(String[] args) {
        SLNode slNodeInstance = SLNode.getSLNodeInstance();
        SLNode node = slNodeInstance.getPopulatedListHead(new int[]{1,2,3,4,
                5,6,7,8,9,10});

        deleteMiddleNode(node);
    }

    private static void deleteMiddleNode(SLNode node) {
        SLNode middleNode = MiddleNodeFinder.getMiddleNode(node);
        SLNode head = DeleteNodeSL.deleteNode(node, middleNode.value);
        SLNode.getSLNodeInstance().printList(head);

    }
}

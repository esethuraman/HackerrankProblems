package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class DuplicatedRemover {
    public static void main(String[] args) {
        SLNode slNodeInstance = SLNode.getSLNodeInstance();
        SLNode node = slNodeInstance.getPopulatedListHead(new int[]{1,2,3,3,4,
                5,6,7,8,5,9,10,4,6});

//        node = slNodeInstance.getPopulatedListHead(new int[]{1,1,2,2,3,3});
        SLNode resultNode = getDuplicatedRemovedList(node);
        slNodeInstance.printList(resultNode);
    }

    private static SLNode getDuplicatedRemovedList(SLNode node) {

        SLNode head = null, previous = null;
//        buffer for storing the visited values.
        Map<Integer, Integer> visitedNodeValues = new HashMap<>();

        while(node!=null){
            if(head == null){
                head = node;
                visitedNodeValues.put(node.value, 0);
                previous = node;
            }
            else{
                if(visitedNodeValues.containsKey(node.value)){
                    previous.next = node.next;
                }
                else{
                    visitedNodeValues.put(node.value, 0);
                    previous = node;
                }
            }
            node = node.next;

        }

        return head;
    }
}

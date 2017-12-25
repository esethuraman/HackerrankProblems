package LinkedList; /**
 * with a doubly linked list, the approach is very straight fwd.
 * have 2 pointers. move one till the last.
 * now move the second pointer from first to last and move first pointer
 * from last to first. at each iteration, the values must be same for the
 * list to be a palindrom
 */

/**
 * this
 */
public class PalindromeLinkedListSL {
    public static void main(String[] args) {
        SLNode slNodeInstance = SLNode.getSLNodeInstance();
        SLNode lst = slNodeInstance.getPopulatedListHead(new int[]{1,2,3,4,5,
                6,7,8,9,2});
        lst = slNodeInstance.getPopulatedListHead(new int[]{1,2,3,4});
//        System.out.println(lst.next.next.next.value)
        boolean flag = isPalindromeList(lst);
        System.out.println(flag);
    }

    private static boolean isPalindromeList(SLNode node) {
        SLNode lst = null;
        while(node!=null){

        }


//        SLNode revLst = getReversedList(node);
        while(lst!=null){
            System.out.println(lst.value);
            lst = lst.next;
        }

        return false;
    }



    private static SLNode getReversedList(SLNode currentNode) {
        SLNode previous = null, nextNode;
        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = nextNode;
        }
        return previous;
    }
}

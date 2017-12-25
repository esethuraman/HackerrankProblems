package LinkedList;

public class ReverseTheList {
    public static void main(String[] args) {
        SLNode slNodeInstance = SLNode.getSLNodeInstance();
        SLNode node = slNodeInstance.getPopulatedListHead(new int[]{1,2,3,3,4,
                5,6,7,8,5,9,10,4,6});
        slNodeInstance.printList(node);
//        node = slNodeInstance.getPopulatedListHead(new int[]{1,1,2,2,3,3});
        SLNode resultNode = getReversedList(node);
        slNodeInstance.printList(resultNode);
    }

    private static SLNode getReversedList1(SLNode currentNode){
        // For first node, previousNode will be null
        SLNode previousNode=null;
        SLNode nextNode;
        while(currentNode!=null)
        {
            System.out.print(currentNode.value + " ;;; ");
            nextNode=currentNode.next;
            // reversing the link
            currentNode.next=previousNode;
            // moving currentNode and previousNode by 1 node
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }
    private static SLNode getReversedList(SLNode currentNode) {
      SLNode previous=null, nextNode;

      while(currentNode!=null){
          nextNode = currentNode.next;
          currentNode.next = previous;
          previous = currentNode;
          currentNode = nextNode;
      }
        return previous;
    }
}

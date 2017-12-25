package LinkedList;

public class DeleteNodeSL {

    public static void main(String[] args) {
        SLNode slNodeInstance = SLNode.getSLNodeInstance();
        SLNode lst = slNodeInstance.getPopulatedListHead(new int[]{1,2,3,4,5,
                6,7,8,9});
        lst = deleteNode(lst, 9);
        slNodeInstance.printList(lst);
    }

    public static SLNode deleteNode(SLNode lst, int key) {
        SLNode previous=null, head=null;
        while(lst != null){
            if(head == null){
                if(lst.value == key){
                    head = lst.next;
                    break;
                }
                else{
                    head = lst;
                    previous = head;
                }
            }
            else if(lst.value == key){
                    previous.next = lst.next;
                    break;
                }
            previous = lst;
            lst = lst.next;

        }
        return head;
    }
}

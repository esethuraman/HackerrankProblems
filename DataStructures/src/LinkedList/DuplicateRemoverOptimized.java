package LinkedList;

public class DuplicateRemoverOptimized {

    public static void main(String[] args) {
        SLNode slNodeInstance = SLNode.getSLNodeInstance();
        SLNode node = slNodeInstance.getPopulatedListHead(new int[]{1,2,3,3,4,
                5,6,7,8,5,9,10,4,6});

//        node = slNodeInstance.getPopulatedListHead(new int[]{1,1,2,2,3,3});
//        SLNode resultNode = getDuplicatedRemovedList(node);
//        slNodeInstance.printList(resultNode);
    }
/*
    private static SLNode getDuplicatedRemovedList(SLNode node) {
        SLNode auxiliaryPtr = node;
        while(node!=null){
            while(auxiliaryPtr!=null){
                if(node)
            }
        }
    }*/
}

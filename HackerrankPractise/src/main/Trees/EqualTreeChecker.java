package main.Trees;

import apple.laf.JRSUIUtils;

public class EqualTreeChecker {

    public boolean isSameTree(TreeNode p, TreeNode q) {
       return isSameTree(true, p, q);
    }

    private boolean isSameTree(boolean isSameTree, TreeNode p, TreeNode q){
        if((p!=null) && (q!=null) && (isSameTree)){
            isSameTree = (p.val == q.val);

            return (isSameTree(isSameTree, p.right, q.right) &&
                    isSameTree(isSameTree, p.left, q.left));

        }
        return isSameTree && (((p==null) && (q==null)) || ((p!=null) && (q!=null))) ;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
//        p.left = new TreeNode(2);
        p.right = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
//        q.right = new TreeNode(3);

        System.out.println(new EqualTreeChecker().isSameTree(p, q));


    }


}


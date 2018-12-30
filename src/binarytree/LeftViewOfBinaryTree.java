package binarytree;

public class LeftViewOfBinaryTree {

    static StringBuffer sb = new StringBuffer();

    public static void leftView(Entry node){
        LevelOrderTraversalUsingIterative.levelOrderTraversal(node);
    }

    static public void levelOrderTraRecursive(Entry node,int n){
        if(node == null){
            return;
        }
        if(n == 1){
            System.out.println(node.value +"  ");
        }else if(n > 1) {
            levelOrderTraRecursive(node.left, n - 1);
            levelOrderTraRecursive(node.right, n - 1);
        }
    }
}

package binarytree;

public class PostOrderTraversal {

    public static void postOrderRecursive(Entry node){

        if(node == null){
            return;
        }
        postOrderRecursive(node.left);
        postOrderRecursive(node.right);
        System.out.println(node.value);
    }
}

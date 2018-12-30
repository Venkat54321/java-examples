package binarytree;

import java.util.Stack;

public class PreorderIterative {


    public static void preOrderRecursive(Entry node){
        if(node == null ){
            return;
        }
        System.out.println(node.value);
        preorderIterative(node.left);
        preorderIterative(node.right);
    }

    public static void preorderIterative(Entry node){

        if(node == null){
            return;
        }

        Stack<Entry> stack = new Stack<>();
        stack.push(node);
        while (true) {

            while (node != null) {

                System.out.println(node.value);
                stack.push(node);
               node = node.left;

            }
            if(stack.isEmpty()){
                break;
            }
            Entry myNode = stack.pop();
            node = myNode.right;
        }

    }
}

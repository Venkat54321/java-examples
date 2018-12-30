package binarytree;

import java.util.Stack;

public class InorderTravesal {

    public static void inorderIterative(Entry node){

        if(node == null){
            return;
        }

        Stack<Entry> stack = new Stack<>();
        stack.push(node);
        while (true) {

            while (node != null) {

                stack.push(node);
                node = node.left;

            }
            if(stack.isEmpty()){
                break;
            }
            Entry myNode = stack.pop();
            System.out.println(myNode.value);
            node = myNode.right;
        }

    }
}

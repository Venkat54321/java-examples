package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalUsingIterative {


    static public void levelOrderTraRecursive(Entry node,int n){
        if(node == null){
            return;
        }
        if(n == 1){
            System.out.println(node.value);
            return;
        }
        levelOrderTraRecursive(node.left,n-1);
        levelOrderTraRecursive(node.right,n-1);
    }


   static public void levelOrderTraversal(Entry node){

        Queue<Entry> q = new LinkedList<>();
        ((LinkedList<Entry>) q).push(node);
        int level = 0;
        while(true){
            int size = q.size();
            if(size ==0) {
                return;
            }
            for (Entry displayNode : q) {
                    System.out.print(displayNode.value+ "  ");
                }
            System.out.println("\n");
                level++;
            while(size > 0){
                Entry frontNode = ((LinkedList<Entry>) q).getFirst();
                ((LinkedList<Entry>) q).pop();
                if(frontNode.left != null){
                    q.add(frontNode.left);
                }
                if(frontNode.right != null){
                    q.add(frontNode.right);
                }
                size--;
            }

        }

    }
}

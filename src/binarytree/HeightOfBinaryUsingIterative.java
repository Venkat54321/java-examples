package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryUsingIterative {

    static int heightIterative(Entry node){

        Queue<Entry> q = new LinkedList<>();
        ((LinkedList<Entry>) q).push(node);
        int height =0;
        while(true){

            int nodeCOunt = q.size();
            if(nodeCOunt == 0){
                return height;
            }
            height++;

            while(nodeCOunt > 0){
                Entry frontNode = ((LinkedList<Entry>) q).getFirst();
                ((LinkedList<Entry>) q).pop();
                if(frontNode.left != null){
                    ((LinkedList<Entry>) q).add(frontNode.left);
                }
                if(frontNode.right != null){
                    ((LinkedList<Entry>) q).add(frontNode.right);
                }
                nodeCOunt--;
            }
        }

    }
}

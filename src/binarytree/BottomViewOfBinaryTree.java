package binarytree;

import java.util.HashMap;
import java.util.Map;

public class BottomViewOfBinaryTree {

    static Map<Integer,Integer> map = new HashMap<>();

    public static void bottomViewObBinaryTree(Entry node){

        bottomView(node,0);
        System.out.println(map);

    }

    static void bottomView(Entry node,int n){
        if(node == null){
            return;
        }
        map.put(n, node.value);
        bottomView(node.left,n-1);
        bottomView(node.right,n+1);

    }
}

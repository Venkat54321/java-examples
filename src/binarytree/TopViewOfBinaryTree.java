package binarytree;

import java.util.HashMap;
import java.util.Map;

public class TopViewOfBinaryTree {

    static Map<Integer,Integer> map = new HashMap<>();

    public static void topViewObBinaryTree(Entry node){

        topView(node,0);
        System.out.println(map);

    }

    static void topView(Entry node,int n){
        if(node == null){
            return;
        }
        Integer i =  map.get(n);
        if(i == null) {
            map.put(n, node.value);
        }
        topView(node.left,n-1);
        topView(node.right,n+1);

    }
}

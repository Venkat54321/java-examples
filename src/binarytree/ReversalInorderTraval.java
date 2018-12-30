package binarytree;

public class ReversalInorderTraval {

     public static void reversalInorderTravala(Entry node) {

           if(node == null)
               return;
           reversalInorderTravala(node.right);
           System.out.println(node.value);
           reversalInorderTravala(node.left);

     }

}

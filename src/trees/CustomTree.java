package trees;

import java.util.ArrayList;
import java.util.List;

public class CustomTree {

    public TreeNode root;
    int maxLevelSoFar = -1;
    int level = 1;
    int maxElement = 0;

    public TreeNode createTree(){
        root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(10);

        return root;
    }

    public void inOrder(TreeNode root){
        if(root == null) {
            return;
        }
            inOrder(root.left);
            System.out.println(root.value);
            inOrder(root.right);
        }


    void printPaths(TreeNode node,List<Integer> list)
    {
        list.add(node.value);
         if (isLeaf(node)) {
             System.out.println(list);
             return;
         }
             printPaths(node.left, new ArrayList<>(list));
             printPaths(node.right, new ArrayList<>(list));
     }

    public static boolean isLeaf(TreeNode t) {
        if (t.left == null && t.right == null) {
            return true;
        }
        return false;
    }

   /* public void rightView(TreeNode node,int currentLevel){

        if(node == null)
            return;
        if(currentLevel > maxLevelSoFar){
            System.out.print(node.value);
            maxLevelSoFar = currentLevel;
        }
        rightView(node.right,currentLevel + 1);
        rightView(node.left,currentLevel +1);


    }
*/
    public void rightView(TreeNode node,int level){
        if(node == null)
            return;
        if(level > maxLevelSoFar){
            maxLevelSoFar = level;
            System.out.println(node.value);
        }
        rightView(node.right,level + 1);
        rightView(node.left,level + 1);

    }

  public void printLeaves(TreeNode node){
        if(node == null)
            return;
        if(node.right == null && node.left == null){
            System.out.println(node.value);
        }
        printLeaves(node.right);
        printLeaves(node.left);

  }

  public void printLevelNumber(TreeNode node,int level){

        if(node == null)
            return;
        if(node.value == 20){
            System.out.print("Number level is : "+level);
            return;
        }
        printLevelNumber(node.right,level +1);
        printLevelNumber(node.left,level +1);

  }

  public void maxElementInTree(TreeNode node){
        if(node == null)
            return;
        if(node.value >maxElement){
            maxElement = node.value;
        }

      maxElementInTree(node.right);
      maxElementInTree(node.left);

      System.out.print("Maximum element in binary tree is "+maxElement);
  }

    public static void main(String[] args){
        CustomTree customTree = new CustomTree();
        TreeNode root =  customTree.createTree();
        List<Integer> list = new ArrayList<>();
       // customTree.inOrder(root);
        //customTree.printPaths(root, new ArrayList<>());
       // customTree.rightView(root,0);

        //customTree.printLeaves(root);
        //customTree.printLevelNumber(root,1);
        customTree.maxElementInTree(root);

    }
}

package binarytree;

public class CustomBinaryTree {

    Entry root;

    public void create(){

        Entry e1 = new Entry(1);
        Entry e2 = new Entry(2);
        Entry e3 = new Entry(3);
        Entry e4 = new Entry(4);
        Entry e5 = new Entry(5);
        Entry e6 = new Entry(6);
        Entry e7 = new Entry(7);
        Entry e8 = new Entry(8);
        Entry e9 = new Entry(9);
        Entry e10 = new Entry(10);
        Entry e11 = new Entry(11);
        Entry e12 = new Entry(12);
        Entry e13 = new Entry(13);
        Entry e14 = new Entry(14);
        Entry e15 = new Entry(15);

        //
        Entry e16 = new Entry(16);
        Entry e17 = new Entry(17);
        Entry e18 = new Entry(18);
        Entry e19 = new Entry(19);
        Entry e20 = new Entry(20);
        Entry e21 = new Entry(21);



        e1.left = e2;
        e1.right = e3;

        e2.left = e4;
        e2.right = e5;

        e3.left = e6;
        e3.right = e7;

        e4.left = e8;
        e4.right = e9;

        e5.left = e10;
        e5.right = e11;

        e11.right = e21;

        e11.left = e16;
        e16.left = e17;
        e17.left = e18;
        e18.left = e19;
        e19.left = e20;

        e6.left = e12;
        e6.right = e13;

        e7.left = e14;
        e7.right = e15;

        root = e1;


    }

    public void inOrderDisplay(Entry root){
        if(root == null)
            return;
        inOrderDisplay(root.left);
        System.out.println(root.value);
        inOrderDisplay(root.right);

    }

    public Integer getMaximumValue(Entry node){

        if(node == null){
            return Integer.MAX_VALUE;
        }
        int max = node.value;
        int leftMax = getMaximumValue(node.left);
        int rightMax = getMaximumValue(node.right);

        if(leftMax > rightMax)
            max = leftMax;
        if(leftMax < rightMax)
            max = rightMax;

        return max;
    }

    public int findHeightOfTree(Entry node){
        if(node == null){
            return -1;
        }
        int left = findHeightOfTree(node.left);
        int right = findHeightOfTree(node.right);

        return Integer.max(left,right) + 1;

    }


    public static void main(String[] args) {

        CustomBinaryTree  customBinaryTree = new CustomBinaryTree();
        customBinaryTree.create();
        //
        LevelOrderTraversalUsingIterative.levelOrderTraRecursive(customBinaryTree.root,0);
    }


}

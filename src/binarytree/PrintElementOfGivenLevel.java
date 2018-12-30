package binarytree;

public class PrintElementOfGivenLevel {

    static public void printElement(Entry node){

        int height = 4;
        printLevel(node,height);

    }

    static public void printLevel(Entry node,int level){
        if(node == null){
            return;
        }
        if(level == 1){
            System.out.print(node.value+ "  ");
        }else if(level > 1){
            printLevel(node.left,level-1);
            printLevel(node.right,level-1);

        }
    }
}

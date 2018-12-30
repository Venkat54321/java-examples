package linkedlist;

public class DoubleLinkedList {

    DoubleNode root;
    DoubleNode tail;

    public void insert(int value){

        DoubleNode newNode =new DoubleNode(value);
        if(root == null){
            root = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

    }

    public void remove(int value){



    }

    public void display(){
        DoubleNode tmp = tail;
        while(tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.prev;
        }
    }

    public static void main(String[] args) {

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insert(2);
        doubleLinkedList.insert(3);
        doubleLinkedList.insert(4);
        doubleLinkedList.insert(5);
        doubleLinkedList.insert(6);

        doubleLinkedList.display();
    }

}

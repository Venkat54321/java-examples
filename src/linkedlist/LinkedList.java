package linkedlist;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedList {

    private static Node head;
    static  List<Node> nodeAddressList = new ArrayList<>();


    public void add(int value){

        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }else{
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }

    }

    public void printReverse(Node head){
        if(head == null){
            return;
        }
        printReverse(head.next);
        System.out.println(head.value);

    }

    public void print(){
        Node tmp = head;

        while(tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void  reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

    }

    public void remove(int value){

        Node tmp =head;
        Node next = null;
        while (tmp != null){
            if(tmp.value == value){
                next.next = tmp.next;
            }
            next = tmp;
            tmp = tmp.next;

        }

    }

    public void getNodeAdderList(){
        Node tmp = head;
        while (tmp != null){
           nodeAddressList.add(tmp.next);
           tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();

        linkedList1.add(7);
        linkedList1.add(2);
        linkedList1.add(8);
        linkedList1.add(9);
        linkedList1.add(10);
        linkedList1.add(15);
        linkedList1.add(7);

       // ReverseLinkedListWithGroupOfK.reverseWithGroup(head,3);
        linkedList1.getNodeAdderList();
        System.out.println(nodeAddressList);




    }
}

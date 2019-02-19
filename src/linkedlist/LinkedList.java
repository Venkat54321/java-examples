package linkedlist;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedList {

    private static Node head;

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
            System.out.print(tmp.value+ "  ");
            tmp = tmp.next;
        }
        System.out.println("\n");
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

    public void remove(Node node){

        Node tmp = head;
        while (tmp != null && tmp.next.value != node.value){
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
    }

    public void removeAtPosition(int position){

        Node tmp = head;
        Node prev = null;
        int count = 0;
        while (tmp != null){
            if(count == position){
                break;
            }
            count++;
            prev = tmp;
            tmp = tmp.next;
        }
        prev.next = tmp.next;

    }

    public void removeNthNodeFromBack(int n){
        Node refPointer = head;
        Node mainPointer = head;
        while (n >= 0){
            n--;
            refPointer = refPointer.next;
        }
        while(refPointer != null){
            refPointer = refPointer.next;
            mainPointer = mainPointer.next;
        }
        mainPointer.next = mainPointer.next.next;
    }

    public void findMidddleElement(){
        Node fast = head;
        Node slow = head;

        while (fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Middle element is "+ slow.value);

    }

    public int setLoop() {

        Node tmp = head;
        Node slow = tmp;
        Node fast = tmp;
        while (slow != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                System.out.println("loop found");
                return 1;
            }
        }
        return 0;

    }

    public void removeDuplicated(){
        Node current = head;
        Node prev = null;
        HashSet<Integer> nodeHashSet = new HashSet<>();
        while (current != null){

            if(nodeHashSet.contains(current.value)){
                prev.next = current.next;
            }else{
                nodeHashSet.add(current.value);
                prev = current;
            }
            current = current.next;
        }

    }


    public void swap(int first,int second){
        Node node1 = head;
        Node node2 = head;

        int i =1;
        while (first > i){
            node1 = node1.next;
            i++;
        }
        int j = 1;
        while (second > j){
            node2 = node2.next;
            j++;
        }
        int tmp = node2.value;
        node2.value = node1.value;
        node1.value = tmp;

    }

    public Node removeDuplicate(){
        Node tmp = head;
        Set<Integer> set = new HashSet<>();
        Node prv = null;
        while (tmp.next != null){
            if(set.contains(tmp.value)){
                prv.next = tmp.next;
            }else{
                set.add(tmp.value);
            }
            prv = tmp;
            tmp = tmp.next;
        }
        if(set.contains(tmp.value)){
            prv.next  = null;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();

        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(3);
        linkedList1.add(2);
        linkedList1.add(6);
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(6);

        linkedList1.print();
        linkedList1.removeDuplicate();
        linkedList1.print();
    }
}

package doublelinkedlist;

public class CustomDoubleLinkedLIst {

    Node root;

    public void add(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
        }else {

            Node tmp = root;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
            newNode.prev = tmp;
        }
    }

    public void display(){
        Node tmp = root;
        while (tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void deleteFirst(){
        Node tmp = root;
        tmp = tmp.next;
        tmp.prev.next = null;
        tmp.prev = null;

        root = tmp;
    }

    public void reverseDLL(){

    }

    public void displayReverse(){
        Node tmp = root;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        while (tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.prev;
        }
    }

    public static void main(String[] args) {
        CustomDoubleLinkedLIst customDoubleLinkedLIst = new CustomDoubleLinkedLIst();
        customDoubleLinkedLIst.add(1);
        customDoubleLinkedLIst.add(2);
        customDoubleLinkedLIst.add(3);
        customDoubleLinkedLIst.add(4);
        customDoubleLinkedLIst.display();
        System.out.println("=============");
        customDoubleLinkedLIst.displayReverse();

      /*  customDoubleLinkedLIst.deleteFirst();
        customDoubleLinkedLIst.display();
     */ /*   customDoubleLinkedLIst.delete(4);
        customDoubleLinkedLIst.deleteLast();
        System.out.println("==========");
        customDoubleLinkedLIst.display();*/
    }

    public void delete(int value){
        Node tmp = root;
        while (tmp.next.value != value){
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        tmp.next.prev = tmp.next;
    }

    public void  deleteLast(){
        Node tmp = root;
        while (tmp.next.next != null) {
            tmp = tmp.next;
        }
        tmp.next.prev= null;
        tmp.next = null;
    }
}

package doublelinkedlist;

public class CustomDoubleLinkedLIst {

    Node root;

    public void add(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
        }
        else{
            Node tmp = root;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
            newNode.prev = tmp;
        }
    }

    public void addAfter(Node node){
        Node newNode = new Node(3.5);
        if(root == null){
            root = newNode;
        }else{
            Node tmp = root;
            while (tmp.next.next != null && tmp.value != node.value){
                tmp = tmp.next;
            }
            Node tmp2 = tmp.next;

            tmp2.prev = newNode;
            newNode.prev = tmp;
            newNode.next = tmp2;
            tmp.next = newNode;
        }
    }

    public void delete(Object value){
        if(root == null){
            return;
        }else {

            Node tmp = root;
            while (tmp.next != null && tmp.value != value){
                tmp = tmp.next;
            }
            Node tmp2 = tmp.next.next;

            tmp.next = tmp2;
            tmp2.prev= tmp;

        }
    }

    public void display(){
        Node tmp = root;
        while (tmp != null){
            System.out.print(tmp.value+"  ");
            tmp = tmp.next;
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        CustomDoubleLinkedLIst customDoubleLinkedLIst = new CustomDoubleLinkedLIst();
        customDoubleLinkedLIst.add(1);
        customDoubleLinkedLIst.add(2);
        customDoubleLinkedLIst.add(3);
        customDoubleLinkedLIst.add(4);
        customDoubleLinkedLIst.add(5);
        customDoubleLinkedLIst.add(6);
        customDoubleLinkedLIst.add(7);
        customDoubleLinkedLIst.display();
        customDoubleLinkedLIst.delete(4);
        customDoubleLinkedLIst.display();

    }
}

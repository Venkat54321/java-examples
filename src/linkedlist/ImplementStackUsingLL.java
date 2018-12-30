package linkedlist;

public class ImplementStackUsingLL {

    Node top;

    public void push(int value){
        Node newNode = new Node(value);
        if(top == null){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void display(){
        Node tmp = top;
        while (tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void pop(){
        Node tmp = top;
        top = tmp.next;
    }

    public static void main(String[] args) {
        ImplementStackUsingLL stack = new ImplementStackUsingLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.pop();
        System.out.println("============");
        stack.display();
    }
}

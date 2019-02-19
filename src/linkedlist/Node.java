package linkedlist;

import java.util.Objects;

public class Node {

    int value;
    Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return value == node.value &&
                Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value, next);
    }

}

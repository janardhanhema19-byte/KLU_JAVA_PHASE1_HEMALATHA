import java.util.*;
class Node {
    int data;
    Node prev;
    Node next;
    Node(int d){
        this.data = d;
        this.prev = null;
        this.next = null; 
    }
}
class Main {
    Node first;
    void insert(int value){
        Node n = new Node(value);
        if(first == null)
        first = n;
        else {
            Node temp = first;
            while(temp.next != null)
            temp = temp.next;
            temp.next = n;
            n.prev = temp;
        }
    }
}
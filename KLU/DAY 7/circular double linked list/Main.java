import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d){
    this.data = d;
    this.next = null;
    }
}
class Main {
    Node first;
    void insert(int d)
    {
        Node n = new Node(d);
        if(first == null)
        {
            first = n;
            n.next = first;
            n.prev = first;
        }
        else 
        {
            Node last = first.prev;
            last.next = n;
            n.prev = last;
            n.next = first;
            first.prev = n;
        }
    }
    void dispaly()
    {
        if(first==null){
            System.out.print("Linked list is empty");
            return;
        }
        Node temp = first;
        do
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=first);
    }
}
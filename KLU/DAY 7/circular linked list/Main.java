import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
class Main 
{
    Node first;
    void insert(int d)
    {
        Node n = new Node(d);
        if(first == null)
        {
            first = n;
            n.next=first;
        }else{
            Node temp = first;
            while(temp.next!=first)
            {
                temp = temp.next;
                n.next = first;
            }
        }
    }
            void display()
            {
                if(first==null)
                {
                    System.out.print("Linked list is Empty");
                    return;
                }
                Node temp=first;
                do{
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }while(temp != first);
            }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int d = obj.nextInt();
        Main m = new Main();
        while(d!=-1)
        {
            m.insert(d);
            d=obj.nextInt();
        }
        m.display();
    }
}
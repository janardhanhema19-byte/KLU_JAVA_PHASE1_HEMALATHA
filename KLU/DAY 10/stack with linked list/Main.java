import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Stack {
    private Node top;

    Stack() {
        top = null;
    }

    void push(int d) {
        Node n = new Node(d);
        n.next = top;
        top = n;
        System.out.println(d + " pushed");
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();

        while (true) {
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    int x = sc.nextInt();
                    s.push(x);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
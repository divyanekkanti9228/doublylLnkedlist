import java.util.Scanner;

class Node {
  int data;
  Node next;
  Node prev;
  
  Node(int data) {
    this.data = data;
    next = null;
    prev = null;
  }
}

class DoubleLinkedList {
  Node head;
  
  public void add(int data) {
    Node newNode = new Node(data);
    
    if (head == null) {
      head = newNode;
      return;
    }
    
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
    newNode.prev = current;
  }
  
  public void show() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
  }
}

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    DoubleLinkedList d = new DoubleLinkedList();
    
    for (int i = 0; i < n; i++) {
      d.add(sc.nextInt());
    }
    
    d.show();
  }
}
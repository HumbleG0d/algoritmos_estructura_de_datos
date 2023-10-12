package LinkedLists;

public class DoubleLinkedList {
  private Node head;
  private Node tail;

  public void insertFirst(int val) {
    Node newNodo = new Node(val);
    if (head == null) {
      head = newNodo;
      tail = newNodo;
    } else {
      newNodo.next = head;
      head.prev = newNodo;
      head = newNodo;
    }
  }

  public void display() {
    Node node = head;
    Node last = null;
    while (node != null) {
      System.out.print(node.val + " -> ");
      last = node;
      node = node.next;
    }
    System.out.println("END");

    System.out.println("Print in reverse");
    while (last != null) {
      System.out.print(last.val + " -> ");
      last = last.prev;
    }
    System.out.println("START");
  }

  public void insertLast(int data) {
    Node newNodo = new Node(data);
    if (tail == null) {
      head = newNodo;
      tail = newNodo;
    } else {
      newNodo.prev = tail;
      tail.next = newNodo;
      tail = newNodo;
    }
  }

  public Node find(int value) {
    Node node = head;
    while (node != null) {
      if (node.val == value) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public void insert(int after, int val) {
    Node p = find(after);

    if (p == null) {
      System.out.println("does not exist");
      return;
    }

    Node node = new Node(val);
    node.next = p.next;
    p.next = node;
    node.prev = p;
    if (node.next != null) {
      node.next.prev = node;
    }
  }

  private class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
      this.val = val;
      this.next = null;
      this.prev = null;
    }

    /*
     * public Node(int val, Node next, Node prev) {
     * this.val = val;
     * this.next = next;
     * this.prev = prev;
     * }
     */
  }
}

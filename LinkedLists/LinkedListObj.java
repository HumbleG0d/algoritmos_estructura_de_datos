package LinkedLists;

public class LinkedListObj {
  private Node head;
  private Node tail;
  private int size;

  public LinkedListObj() {
    this.size = 0;
  }

  public void insertFirst(Object obj) {
    Node new_node = new Node(obj);
    new_node.next = head;
    head = new_node;

    if (tail == null) {
      tail = head;
    }

    size++;
  }

  public void insertLast(Object obj) {
    if (tail == null) {
      insertFirst(obj);
      return;
    }

    Node new_node = new Node(obj);
    tail.next = new_node;
    tail = new_node;
    size++;
  }

  public void insert(int index, Object obj) {
    if (index == 0) {
      insertFirst(obj);
      return;
    } else if (index == size) {
      insertLast(obj);
      return;
    }

    Node temp = head;
    for (int i = 1; i < index; i++) {
      temp = temp.next;
    }

    Node new_node = new Node(obj, temp.next);
    temp.next = new_node;
    size++;
  }

  public Object deleteFirst() {
    Object value = head.value;
    head = head.next;

    if (head == null) {
      tail = null;
    }
    size--;

    return value;
  }

  public Node get(int index) {
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  public Object deleteLast() {
    if (size <= 1) {
      return deleteFirst();
    }

    Node secondLast = get(size - 2);
    Object val = tail.value;
    tail = secondLast;
    tail.next = null;

    return val;
  }

  public Object delete(int index) {
    if (index == 0) {
      return deleteFirst();
    } else if (index == size - 1) {
      return deleteLast();
    }

    Node prev = get(index - 1);
    Object val = prev.next.value;

    prev.next = prev.next.next;

    return val;
  }

  public Node find(Object obj) {
    Node node = head;
    while (node != null) {
      if (node.value.equals(obj)) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public void displayList() {
    Node current = head;

    while (current != null) {
      System.out.print(current.value.toString() + " -> ");
      current = current.next;
    }
    System.out.println("END");
  }

  private class Node {
    private Object value;
    private Node next;

    public Node(Object value) {
      this.value = value;
    }

    public Node(Object value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}

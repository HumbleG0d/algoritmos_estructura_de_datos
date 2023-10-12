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

  public int deleteFirst() {
    if (head == null) {
      System.out.println("La lista está vacía. No hay elementos para eliminar.");
      return 0;
    }

    Node nodoEliminar = head;
    int value_nodo = nodoEliminar.val;

    if (head.next != null) {
      head = head.next;
      head.prev = null;
    } else {
      // Si solo hay un nodo en la lista
      head = null;
      tail = null;
    }
    return value_nodo;
  }

  public String toString() {
    Node actual = head;
    String lista = "";
    while (actual != null) {
      if (actual.prev == null)
        lista = "null<-" + actual.val + "->" + actual.next.val;
      else if (actual.next == null)
        lista = lista + "||" + actual.prev.val + "<-" +
            actual.val + "->null";
      else
        lista = lista + "||" + actual.prev.val + "<-" + actual.val + "->" +
            actual.next.val;
      actual = actual.next;
    }
    return lista;
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

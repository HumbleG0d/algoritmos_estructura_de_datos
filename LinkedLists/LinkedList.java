package LinkedLists;

public class LinkedList {

  private Node head;
  private Node tail;
  private int size;

  public LinkedList() {
    this.size = 0;
  }

  public void insertFirst(int val) {
    Node new_node = new Node(val);
    new_node.next = head; // * NEW_NODE -> head */
    head = new_node; // *Ahora la nueva cabeza sera el nuevo nodo */

    if (tail == null) { // *Recordar que tanto la cabeza como la cabeza apuntan a nulo */
      tail = head;
    }

    size++;
  }

  public void insertLast(int val) {
    if (tail == null) {
      insertFirst(val);
      return;
    }

    Node new_node = new Node(val);
    tail.next = new_node; // * tail -> NEW_NODE */
    tail = new_node; // *Ahora la nueva cola(tail) es el nuevo nodo */
    size++;
  }

  public void insert(int index, int value) {
    if (index == 0) {
      insertFirst(value);
      return;
    } else if (index == size) {
      insertLast(value);
      return;
    }

    Node temp = head; // * Creamos una variable temporal */
    for (int i = 1; i < index; i++) { // * Hacemos un recorrido hasta el elemento q apuntara al nuevo valor que vamos
                                      // a añadir */
      temp = temp.next;
    }

    Node new_node = new Node(value, temp.next); // * Creamos el nuevo nodo */
    temp.next = new_node; // * NODE_PREV -> NEW_NODE -> OTHER_NODE */
    size++;
  }

  public int deleteFirst() {
    int value = head.value; // * Obtenemos el valor de la cabeza */
    head = head.next; // * Obtenemos el siguiente nodo*/

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

  public int deleteLast() {
    if (size <= 1) {
      return deleteFirst();
    }

    Node secondLast = get(size - 2);
    int val = tail.value;
    tail = secondLast;
    tail.next = null;

    return val;
  }

  public int delete(int index) {
    if (index == 0) {
      return deleteFirst();
    } else if (index == size - 1) {
      return deleteLast();
    }

    Node prev = get(index - 1);
    int val = prev.next.value;

    prev.next = prev.next.next;

    return val;
  }

  public Node find(int value) {
    Node node = head;
    while (node != null) {
      if (node.value == value) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public void reverse(Node temp) {
    if (temp.next != null) {
      reverse(temp.next);
    }
    System.out.print(temp.value + " -> ");
  }

  public void displayList() {
    Node current = head;

    while (current != null) {
      System.out.print(current.value + " -> ");
      current = current.next;
    }
    System.out.println("END");
  }

  public void displayListReverse() {
    Node current = head;
    reverse(current);
    System.out.println("END");
  }

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
      this.next = null;

    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}
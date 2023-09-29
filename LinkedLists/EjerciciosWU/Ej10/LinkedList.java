package LinkedLists.EjerciciosWU.Ej10;

public class LinkedList {
  private Node head;
  private Node tail;
  private int size;

  public LinkedList() {
    this.size = 0;
  }

  public int getSize() {
    return this.size;
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
      Object ob = current.value;
      Persona p = (Persona) ob;
      System.out.print(p.getNombre() + " - " + p.getEdad() + " -> ");
      current = current.next;
    }
    System.out.println("END");
  }
}

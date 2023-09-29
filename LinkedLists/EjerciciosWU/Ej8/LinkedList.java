package LinkedLists.EjerciciosWU.Ej8;

public class LinkedList {
  private NodeO head;
  private NodeO tail;
  private int size;

  public LinkedList() {
    this.size = 0;
  }

  public void insertFirst(Object obj) {
    NodeO new_node = new NodeO(obj);
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

    NodeO new_node = new NodeO(obj);
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

    NodeO temp = head;
    for (int i = 1; i < index; i++) {
      temp = temp.next;
    }

    NodeO new_node = new NodeO(obj, temp.next);
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

  public NodeO get(int index) {
    NodeO node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  public Object deleteLast() {
    if (size <= 1) {
      return deleteFirst();
    }

    NodeO secondLast = get(size - 2);
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

    NodeO prev = get(index - 1);
    Object val = prev.next.value;

    prev.next = prev.next.next;

    return val;
  }

  public NodeO find(Object obj) {
    NodeO node = head;
    while (node != null) {
      if (node.value.equals(obj)) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public void displayList() {
    NodeO current = head;

    while (current != null) {
      // *Inicio cast de Objeto a Persona */
      Object ob = current.value;
      Persona p = (Persona) ob;
      // *Fin cast de Objeto a Persona */
      System.out.print(p.getNombre() + " -> ");
      current = current.next;
    }
    System.out.println("END");
  }
}

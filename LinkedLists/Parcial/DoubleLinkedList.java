package LinkedLists.Parcial;

public class DoubleLinkedList {

  Nodo head;
  Nodo ultimo;

  public void addFirst(int data) {
    Nodo newNodo = new Nodo(data);
    if (head == null) {
      head = newNodo;
      ultimo = newNodo;
    } else {
      newNodo.next = head;
      head.prev = newNodo;
      head = newNodo;
    }
  }

  public void addLast(int data) {
    Nodo newNodo = new Nodo(data);
    if (ultimo == null) {
      head = newNodo;
      ultimo = newNodo;
    } else {
      newNodo.prev = ultimo;
      ultimo.next = newNodo;
      ultimo = newNodo;
    }
  }

  public void remove(int valor) {
    Nodo actual = head;
    while (actual != null && actual.data != valor) {
      actual = actual.next;
    }
    if (actual != null) {
      if (actual == head) {
        head = head.next;
        if (head != null)
          head.prev = null;
        else
          ultimo = null;
      } else if (actual == ultimo) {
        ultimo = actual.prev;
        ultimo.next = null;
      } else {
        actual.prev.next = actual.next;
        actual.next.prev = actual.prev;
      }
    }
  }

  // Funcion que me retorna un nodo
  public Nodo find(int value) {
    Nodo node = head;
    while (node != null) {
      if (node.data == value) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  // Funcion que retorna el tamaño del arreglo
  public int getSize() {
    int count = 0;
    Nodo current = head;

    while (current != null) {
      count++;
      current = current.next;
    }

    return count;
  }

  public void clear() {
    head = null;
    ultimo = null;
  }

  public String toString() {
    Nodo actual = head;
    String lista = "";
    while (actual != null) {
      if (actual.prev == null)
        lista = "null<-" + actual.data + "->" + actual.next.data;
      else if (actual.next == null)
        lista = lista + "||" + actual.prev.data + "<-" +
            actual.data + "->null";
      else
        lista = lista + "||" + actual.prev.data + "<-" + actual.data + "->" +
            actual.next.data;
      actual = actual.next;
    }
    return lista;
  }

}

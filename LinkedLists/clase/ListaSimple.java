package LinkedLists.clase;

public class ListaSimple {
  Nodo head;

  public void addFirst(int data) {
    Nodo newNodo = new Nodo(data);
    newNodo.next = head;
    head = newNodo;
  }

  public void addLast(int data) {
    Nodo newNodo = new Nodo(data);
    if (head == null) {
      head = newNodo;
      return;
    }
    Nodo current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNodo;
  }

  public String toString() {
    String lista = "";
    Nodo current = head;
    while (current != null) {
      if (lista.length() == 0) {
        lista = "" + current.data;
      } else {
        lista = lista + "->" + current.data;
      }
      current = current.next;
    }
    return lista;
  }
}

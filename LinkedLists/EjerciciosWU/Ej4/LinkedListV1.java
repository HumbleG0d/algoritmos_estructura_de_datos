package LinkedLists.EjerciciosWU.Ej4;

import java.util.Scanner;

public class LinkedListV1 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Nodo inicio, cola, siguiente;

    inicio = null;
    cola = null;
    int num = sc.nextInt();

    if (num > 0) {
      inicio = new Nodo(num, null);
      cola = inicio;
      while (true) {
        num = sc.nextInt();
        if (num <= 0)
          break;
        siguiente = new Nodo(num, null);
        cola.setSiguiente(siguiente);
        cola = siguiente;
      }
    }

    while (inicio != null) {
      System.out.print(inicio.getElemento() + " -> ");
      inicio = inicio.getSiguiente();
    }
    System.out.println(" null");

    sc.close();
  }
}

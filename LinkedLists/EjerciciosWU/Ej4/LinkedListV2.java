package LinkedLists.EjerciciosWU.Ej4;

import java.util.Scanner;

public class LinkedListV2 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Nodo inicio, cola;
    inicio = null;
    cola = null;// Linea de codigo agregada.
    int num = sc.nextInt();

    if (num > 0) {
      inicio = new Nodo(num, null);
      cola = inicio;
      while (true) {
        num = sc.nextInt();
        if (num <= 0)
          break;
        cola.setSiguiente(new Nodo(num, null));
        cola = cola.getSiguiente();
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

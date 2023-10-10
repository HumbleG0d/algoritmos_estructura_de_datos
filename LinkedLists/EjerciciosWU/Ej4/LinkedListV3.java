package LinkedLists.EjerciciosWU.Ej4;

import java.util.Scanner;

public class LinkedListV3 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Nodo inicio, cola;

    inicio = new Nodo(0, null);
    cola = inicio;

    while (true) {
      int num = sc.nextInt();

      if (num <= 0)
        break;
      cola.setSiguiente(new Nodo(num, null));
      cola = cola.getSiguiente();
    }
    inicio = inicio.getSiguiente();

    while (inicio != null) {
      System.out.print(inicio.getElemento() + " -> ");
      inicio = inicio.getSiguiente();
    }
    System.out.println(" null");

    sc.close();
  }
}

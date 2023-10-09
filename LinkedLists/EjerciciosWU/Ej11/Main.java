package LinkedLists.EjerciciosWU.Ej11;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    BNodo inicio, cola, siguiente;
    Bicicleta bici = new Bicicleta("Sin nombre");

    inicio = null;
    String nombre = sc.nextLine();

    if (!nombre.equalsIgnoreCase("SALIR")) {
      // No es necesario -> bici.setNombrePropietario(nombre);

      inicio = new BNodo(bici, null);
      cola = inicio;

      /* Codigo por corregir */
      /*
       * while (true) {
       * nombre = sc.nextLine();
       * if (!nombre.equalsIgnoreCase("SALIR"))
       * break;
       * bici.setNombrePropietario(nombre);
       * siguiente = new BNodo(bici, null);
       * cola.setSiguiente(siguiente);
       * cola = siguiente;
       * }
       */

      /* Codigo corregido */
      while (true) {
        nombre = sc.nextLine();
        if (!nombre.equalsIgnoreCase("SALIR"))
          break;
        siguiente = new BNodo(new Bicicleta(nombre), null);
        cola.setSiguiente(siguiente);
        cola = siguiente;
      }
    }
    /* TODO: Añadir la impresion de esta lista */
    sc.close();
  }
}

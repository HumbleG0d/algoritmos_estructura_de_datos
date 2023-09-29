package LinkedLists.EjerciciosWU.Ej10;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();
    Sort sort = new Sort();

    boolean bandera = true;
    while (bandera) {
      bandera = registrar(sc, list);
    }
    System.out.println("\nLista personas\n");
    list.displayList();

    System.out.println("\nLista ordenada");
    sort.quickSort(list, 1, 0, list.getSize() - 1);
    list.displayList();

    Persona p = (Persona) list.get(list.getSize() - 1).value;
    System.out.print("\nPersona mas longeva: " + p.getEdad());

    sc.close();
  }

  private static boolean registrar(Scanner sc, LinkedList list) {
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();
    System.out.print("Edad: ");
    int edad = sc.nextInt();

    boolean bandera = false;

    if (!nombre.equalsIgnoreCase("HECHO")) {
      Persona persona = new Persona(nombre);
      persona.setEdad(edad);
      list.insertLast(persona);
      bandera = true;
    }
    sc.nextLine();
    return bandera;
  }
}

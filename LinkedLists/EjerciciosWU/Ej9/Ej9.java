package LinkedLists.EjerciciosWU.Ej9;

import java.util.Scanner;
import LinkedLists.EjerciciosWU.Ej8.Persona;
import LinkedLists.EjerciciosWU.Ej8.LinkedList;

public class Ej9 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();
    boolean bandera = true;
    while (bandera) {
      bandera = registrar(sc, list);
    }
    list.displayList();
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

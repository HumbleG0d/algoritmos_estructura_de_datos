package LinkedListTDA.Wu.Ejercicio8;

import java.util.Scanner;

import LinkedListTDA.Clase.LinkedListTDA;

public class MainEj8 {
  public static void main(String args[]) {
    LinkedListTDA<String> ll = new LinkedListTDA<>();

    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el número de suertes: ");
    int N = sc.nextInt();

    // Escribimos la cantidad de suertes.
    sc.nextLine();
    for (int i = 0; i < N; i++) {
      System.out.print("Ingrese una suerte: ");
      String suerte = sc.nextLine();
      ll.add(suerte);
    }

    // preguntamos si quiere ver su suerte.
    while (true) {
      System.out.print("Desea ver su suerte?");
      String val = sc.nextLine();
      if (!val.equalsIgnoreCase("si"))
        break;
      int n = (int) (Math.random() * (ll.size()));
      System.out.println(ll.get(n));
    }
    sc.close();
  }
}

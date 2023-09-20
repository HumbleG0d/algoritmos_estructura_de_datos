package ProjectDirectorio;

import java.util.Scanner;

public class PruebaDirectorio {
  public static void main(String argd[]) {

    PruebaDirectorio prueba = new PruebaDirectorio();
    prueba.inicio();
  }

  private void inicio() {
    String[] nombres = { "mono", "gato", "abeja", "murcielago", "garrapata" };

    Persona p;
    Directorio ab;

    Scanner sc = new Scanner(System.in);

    System.out.print("Version #: ");
    int version = sc.nextInt();

    sc.close();
    /* TODO: Crear 2 vercionamientos mas */

    switch (version) {
      case 1:
        ab = new DirectorioVr1();
        break;
      default:
        ab = new DirectorioVr1();
        break;
    }

    for (int i = 0; i < nombres.length; i++) {
      p = new Persona(nombres[i], aleatorio(10, 50), aleatorio(0, 1) == 0 ? 'M' : 'F');
      ab.agrega(p);
    }

    Persona[] listaOrdenada = ab.ordena(Persona.EDAD);

    for (int i = 0; i < listaOrdenada.length; i++) {
      System.out.println(listaOrdenada[i].toString());
    }

    listaOrdenada = ab.ordena(Persona.NOMBRE);

    for (int i = 0; i < listaOrdenada.length; i++) {
      System.out.println(listaOrdenada[i].toString());
    }
  }

  private int aleatorio(int min, int max) {
    return (int) Math.floor(Math.random() * (max - min + 1) + min);
  }
}
package LinkedListTDA.Wu.Ejercicio7;

import java.util.ArrayList;
import LinkedListTDA.Wu.Ejercicio1_5.Libro;

import LinkedListTDA.Wu.Casillero;

public class MainEj7 {
  public static void main(String args[]) {
    ArrayList<Casillero<Libro>> list = new ArrayList<>();

    for (int i = 0; i < 100; i++) {
      Casillero<Libro> libros = new Casillero<>();
      libros.almacena(new Libro("autor" + i));
      list.add(libros);
    }

    for (Casillero<Libro> libs : list) {
      System.out.println(libs.recupera().obterAutor());
    }
  }
}

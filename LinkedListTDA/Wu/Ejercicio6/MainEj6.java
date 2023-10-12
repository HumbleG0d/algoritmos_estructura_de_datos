package LinkedListTDA.Wu.Ejercicio6;

import java.util.ArrayList;

import LinkedListTDA.Wu.Casillero;

public class MainEj6 {
  public static void main(String args[]) {
    ArrayList<Casillero<String>> list = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      Casillero<String> cas = new Casillero<>();
      cas.almacena("dato" + i);
      list.add(cas);
    }

    for (Casillero<String> l : list) {
      System.out.println(l.recupera());
    }
  }
}

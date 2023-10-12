package LinkedListTDA.Wu.Ejercicio10_11;

import java.util.ArrayList;
import java.util.Iterator;

public class DirectorioEj10<T extends Persona> {
  private ArrayList<T> coleccion;

  public DirectorioEj10() {
    this.coleccion = new ArrayList<>();
  }

  public void setAgrega(T contenido) {
    coleccion.add(contenido);
  }

  public void setElimina(T contenido) {
    coleccion.remove(contenido);
  }

  public ArrayList<T> getList() {
    return coleccion;
  }

  public void borraPorNombre(String nombre) {
    Iterator<T> iterator = coleccion.iterator();
    while (iterator.hasNext()) {
      T persona = iterator.next();
      if (persona.getName().equals(nombre)) {
        iterator.remove();
        System.out.print("Se elimino a : " + persona.getName() + "\n");
      }
    }
  }
}

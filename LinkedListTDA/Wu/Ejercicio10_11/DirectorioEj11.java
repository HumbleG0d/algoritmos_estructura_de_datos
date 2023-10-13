package LinkedListTDA.Wu.Ejercicio10_11;

import LinkedListTDA.Clase.Iterador;
import LinkedListTDA.Clase.list.IteratorTDA;

public class DirectorioEj11<T extends Persona> {
  private LinkedListTDAP<T> coleccion;
  private T value;

  public DirectorioEj11() {
    this.coleccion = new LinkedListTDAP<T>();
  }

  public void setAgrega(T contenido) {
    coleccion.add(contenido);
  }

  public void setElimina(T contenido) {
    coleccion.delete(contenido);
  }

  public LinkedListTDAP<T> getLinkedListTDA() {
    return coleccion;
  }

  public void borraPorNombre(String nombre) {
    IteratorTDA<T> it = new Iterador<T>(coleccion.head);
    while (it.hasNext())
      value = it.next();
    if (nombre.equals(((Persona) value).getName())) {
      coleccion.delete(value);
      System.out.println("Se elimino a: " + ((Persona) value).getName());
    }
  }
}

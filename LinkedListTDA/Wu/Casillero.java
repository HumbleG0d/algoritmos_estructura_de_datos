package LinkedListTDA.Wu;

public class Casillero<T> {
  private T contenido;

  public Casillero() {
    almacena(null);
  }

  public T recupera() {
    return contenido;
  }

  public void almacena(T contenido) {
    this.contenido = contenido;
  }
}

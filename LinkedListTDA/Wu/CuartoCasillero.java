package LinkedListTDA.Wu;

public class CuartoCasillero<T extends Number> {
  private T contenido;

  public CuartoCasillero() {
    almacena(null);
  }

  public T recupera() {
    return contenido;
  }

  public void almacena(T contenido) {
    this.contenido = contenido;
  }
}

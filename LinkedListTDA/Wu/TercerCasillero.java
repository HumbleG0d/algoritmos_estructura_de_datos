package LinkedListTDA.Wu;

public class TercerCasillero<T> {
  private T contenido1;
  private T contenido2;

  public TercerCasillero() {
    this(null, null);
  }

  public TercerCasillero(T elemento1, T elemento2) {
    almacenaPrimerElem(elemento1);
    almacenaSegundoElem(elemento2);
  }

  public T recuperaPrimerElem() {
    return contenido1;
  }

  public void almacenaPrimerElem(T contenido1) {
    this.contenido1 = contenido1;
  }

  public T recuperaSegundoElem() {
    return contenido2;
  }

  public void almacenaSegundoElem(T contenido2) {
    this.contenido2 = contenido2;
  }
}

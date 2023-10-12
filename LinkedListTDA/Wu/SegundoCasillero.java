package LinkedListTDA.Wu;

public class SegundoCasillero<T1, T2> {
  private T1 contenido1;
  private T2 contenido2;

  public SegundoCasillero() {
    this(null, null);
  }

  public SegundoCasillero(T1 elemento1, T2 elemento2) {
    almacenaPrimerElem(elemento1);
    almacenaSegundoElem(elemento2);
  }

  public T1 recuperaPrimerElem() {
    return contenido1;
  }

  public void almacenaPrimerElem(T1 contenido1) {
    this.contenido1 = contenido1;
  }

  public T2 recuperaSegundoElem() {
    return contenido2;
  }

  public void almacenaSegundoElem(T2 contenido2) {
    this.contenido2 = contenido2;
  }
}

package LinkedLists.EjerciciosWU.Ej11;

public class BNodo {
  private Bicicleta elemento;
  private BNodo siguiente;

  public BNodo() {
    this(null, null);
  }

  public BNodo(Bicicleta dato, BNodo nodo) {
    setElemento(dato);
    setSiguiente(nodo);
  }

  public Bicicleta getElemento() {
    return elemento;
  }

  public void setElemento(Bicicleta dato) {
    this.elemento = dato;
  }

  public BNodo getSiguiente() {
    return siguiente;
  }

  public void setSiguiente(BNodo nodo) {
    this.siguiente = nodo;
  }
}

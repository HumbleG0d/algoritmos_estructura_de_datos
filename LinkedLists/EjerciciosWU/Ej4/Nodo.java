package LinkedLists.EjerciciosWU.Ej4;

public class Nodo {
  private int elemento;
  private Nodo siguiente;

  public Nodo() {
    this(0, null);
  }

  public Nodo(int dato, Nodo nodo) {
    setElemneto(dato);
    setSiguiente(nodo);
  }

  public int getElemento() {
    return elemento;
  }

  public void setElemneto(int elemento) {
    this.elemento = elemento;
  }

  public Nodo getSiguiente() {
    return siguiente;
  }

  public void setSiguiente(Nodo siguiente) {
    this.siguiente = siguiente;
  }
}

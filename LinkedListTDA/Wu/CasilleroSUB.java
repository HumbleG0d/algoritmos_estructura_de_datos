package LinkedListTDA.Wu;

public class CasilleroSUB<T> extends Casillero<T> {
  private int id;
  private static int contadorId = 100;

  public CasilleroSUB() {
    this(null);
  }

  public CasilleroSUB(T elemento) {
    super();
    id = contadorId++;
    almacena(elemento);
  }

  public int muestraID() {
    return id;
  }
}

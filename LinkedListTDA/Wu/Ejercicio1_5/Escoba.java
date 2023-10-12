package LinkedListTDA.Wu.Ejercicio1_5;

public class Escoba {
  private double valor;

  public Escoba() {
    this(0.0);
  }

  public Escoba(double valor) {
    estableceValor(valor);
  }

  public double obtenValor() {
    return valor;
  }

  public void estableceValor(double valor) {
    this.valor = valor;
  }
}

package LinkedListTDA.Wu.Ejercicio1_5;

public class Libro {
  private String autor;

  public Libro() {
    this("Desconocido");
  }

  public Libro(String autor) {
    estableceAutor(autor);
  }

  public String obterAutor() {
    return autor;
  }

  public void estableceAutor(String autor) {
    this.autor = autor;
  }
}

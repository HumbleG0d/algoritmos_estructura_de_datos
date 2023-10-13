package LinkedListTDA.Wu.Ejercicio10_11;

public class MainEj11 {
  public static void main(String args[]) {
    DirectorioEj11<Persona> personas = new DirectorioEj11<>();

    personas.setAgrega(new Persona("Sergio", 21));
    personas.setAgrega(new Persona("Jisoo", 29));
    personas.setAgrega(new Persona("Mina", 25));

    personas.getLinkedListTDA().imprimir();

    personas.borraPorNombre("Mina");

    personas.getLinkedListTDA().imprimir();

  }
}

package LinkedListTDA.Wu.Ejercicio10_11;

public class MainEj10 {
  public static void main(String args[]) {
    DirectorioEj10<Persona> personas = new DirectorioEj10<>();

    personas.setAgrega(new Persona("Sergio", 21));
    personas.setAgrega(new Persona("Jisoo", 29));
    personas.setAgrega(new Persona("Mina", 25));

    for (Persona p : personas.getList()) {
      System.out.println(p.getName() + " -> " + p.getEdad());
    }

    personas.borraPorNombre("Sergio");

    for (Persona p : personas.getList()) {
      System.out.println(p.getName() + " -> " + p.getEdad());
    }
  }
}

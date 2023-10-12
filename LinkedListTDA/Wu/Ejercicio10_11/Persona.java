package LinkedListTDA.Wu.Ejercicio10_11;

public class Persona {
  private String name;
  private int edad;

  public Persona(String name) {
    setName(name);
  }

  public Persona(String name, int edad) {
    setName(name);
    setEdad(edad);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
}

package LinkedLists.EjerciciosWU.Ej10;

public class Persona {
  public static final int NOMBRE = 0;
  public static final int EDAD = 1;

  private static final int MENOR = -1;
  private static final int IGUAL = 0;
  private static final int MAYOR = 1;
  private static int comparaAtributo;

  private String nombre;
  private int edad;

  public Persona(String nombre) {
    setNombre(nombre);
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public static void setComparaAtributo(int atributo) {
    comparaAtributo = atributo;
  }

  public int comparaA(Persona persona, int atributo) {
    int resultadoComparacion;

    if (atributo == EDAD) {
      int edadPersona2 = persona.getEdad();

      if (this.edad < edadPersona2) {
        resultadoComparacion = MENOR;
      } else if (this.edad == edadPersona2) {
        resultadoComparacion = IGUAL;
      } else {
        resultadoComparacion = MAYOR;
      }
    } else {
      String nombrePersona2 = persona.getNombre();
      resultadoComparacion = this.nombre.compareTo(nombrePersona2);
    }
    return resultadoComparacion;
  }

  public int comparaA(Persona persona) {
    return comparaA(persona, comparaAtributo);
  }
}

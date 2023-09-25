package ProjectDirectorio;

public class DirectorioVr1 implements Directorio {

  private static final int TAMANIO_PREDETERN = 25;
  private static final int NO_ENCONTRADO = -1;

  private Persona[] entrada;
  private int contador;

  public DirectorioVr1() {
    this(TAMANIO_PREDETERN);
  }

  public DirectorioVr1(int tamanio) {
    contador = 0;

    if (tamanio <= 0) {
      throw new IllegalArgumentException("El tamaño debe ser positivo");
    }

    entrada = new Persona[tamanio];
    System.out.println("Se ha creado un arreglo de " + tamanio + " items.");
  }

  public Persona[] ordena(int atributo, int option) {
    Persona[] listaOrdenada = new Persona[contador];

    for (int i = 0; i < contador; i++) {
      listaOrdenada[i] = entrada[i];
    }

    Persona.setComparaAtributo(atributo);

    // * Comienza el ordenamiento */

    listaOrdenada = ElegirSort.opcion(option, listaOrdenada, atributo, contador);

    return listaOrdenada;
  }

  public void agrega(Persona nuevaPersona) {
    if (contador == entrada.length) {
      expande();
    }
    entrada[contador] = nuevaPersona;
    contador++;
  }

  public boolean borra(String nombre) {
    boolean estado;
    int loc;

    loc = encuentraIndice(nombre);

    if (loc == NO_ENCONTRADO) {
      estado = false;
    } else {
      entrada[loc] = entrada[contador - 1];
      estado = true;
      contador--;
    }
    return estado;
  }

  public Persona busca(String nombre) {
    // int loc = 0;

    // while (loc < contador && (nombre.equals(entrada[loc].getNombre()))) {
    // loc++;
    // }

    // if (loc == contador) {
    // encuentPersona = null;
    // } else {
    // encuentPersona = entrada[loc];
    // }
    // return encuentPersona;
    // *Implementado Busqueda binaria */
    int min = 0, max = entrada.length - 1;
    int midle = (min + max) / 2;

    while (min <= max && !(nombre.equals(entrada[midle].getNombre()))) {
      // Lucho Rosa?
      int comparacion = entrada[midle].getNombre().compareTo(nombre);
      if (comparacion < 0) {
        min = midle + 1;
      } else {
        max = midle - 1;
      }
      midle = (min + max) / 2;
    }

    if (min > max)
      return entrada[-1];

    return entrada[midle];
  }

  private void expande() {
    int nuevaLongitud = (int) (1.5 * entrada.length);
    Persona[] temp = new Persona[nuevaLongitud];

    for (int i = 0; i < entrada.length; i++) {
      temp[i] = entrada[i];
    }

    entrada = temp;
  }

  private int encuentraIndice(String nombre) {
    int loc = 0;

    while (loc < contador && nombre.equals(entrada[loc].getNombre())) {
      loc++;
    }

    if (loc == contador) {
      loc = NO_ENCONTRADO;
    }
    return loc;
  }
}
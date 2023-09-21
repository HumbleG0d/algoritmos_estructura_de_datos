package ProjectDirectorio;

public class ElegirSort {

  private static SortObjectPersona sort = new SortObjectPersona();

  public static Persona[] opcion(int i, Persona[] listaOrdenada, int atributo, int contador) {
    Persona[] newLista = new Persona[contador];
    switch (i) {
      case 1:
        newLista = sort.burbuja(listaOrdenada, atributo);
        break;
      case 2:
        sort.quickSort(listaOrdenada, atributo, 0, listaOrdenada.length - 1);
        newLista = listaOrdenada;
        break;

      case 3:
        sort.mergeSort(listaOrdenada, atributo, 0, listaOrdenada.length - 1);
        newLista = listaOrdenada;
        break;

      case 4:
        newLista = sort.heapSort(listaOrdenada, atributo);
        break;
    }
    return newLista;
  }

}
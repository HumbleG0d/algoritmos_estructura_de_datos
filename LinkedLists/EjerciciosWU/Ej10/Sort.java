package LinkedLists.EjerciciosWU.Ej10;

public class Sort {
  public void quickSort(LinkedList listaPersonas, int atributo, int min, int max) {
    if (min < max) {
      int indexPivote = partition(listaPersonas, atributo, min, max);
      quickSort(listaPersonas, atributo, min, indexPivote - 1);
      quickSort(listaPersonas, atributo, indexPivote + 1, max);
    }
  }

  private int partition(LinkedList listaPersonas, int atributo, int min, int max) {
    Object ob = listaPersonas.get(max).value;
    Persona pivote = (Persona) ob;
    Persona p1;
    int resultadoComparacion;

    int i = min - 1;

    for (int j = min; j <= max - 1; j++) {
      ob = listaPersonas.get(j).value;
      p1 = (Persona) ob;
      resultadoComparacion = p1.comparaA(pivote, atributo);
      if (resultadoComparacion < 0) {
        i++;
        swap(listaPersonas, i, j);
      }
    }
    swap(listaPersonas, i + 1, max);
    return i + 1;
  }

  private void swap(LinkedList listaPersonas, int i, int j) {
    Persona aux = (Persona) listaPersonas.get(i).value;
    listaPersonas.get(i).value = (Persona) listaPersonas.get(j).value;
    listaPersonas.get(j).value = aux;
  }
}

package ProjectDirectorio;

public class SortObjectPersona {

  public Persona[] burbuja(Persona[] listaOrdenada, int atributo) {

    Persona p1, p2;
    int resultadoComparacion;

    int i = 1;
    boolean intercambio = false;

    while (intercambio == false && i < listaOrdenada.length) {
      intercambio = true;

      for (int j = 0; j < listaOrdenada.length - i; j++) {
        p1 = listaOrdenada[j];
        p2 = listaOrdenada[j + 1];
        resultadoComparacion = p1.comparaA(p2, atributo);

        if (resultadoComparacion > 0) {
          listaOrdenada[j] = p2;
          listaOrdenada[j + 1] = p1;
          intercambio = false;
        }
      }
      i++;
    }
    return listaOrdenada;
  }

  public void quickSort(Persona[] listaOrdenada, int atributo, int min, int max) {
    if (min < max) {
      int indexPivote = partition(listaOrdenada, atributo, min, max);
      quickSort(listaOrdenada, atributo, min, indexPivote - 1);
      quickSort(listaOrdenada, atributo, indexPivote + 1, max);
    }
  }

  private int partition(Persona[] listaOrdenada, int atributo, int min, int max) {
    Persona pivote = listaOrdenada[max];
    Persona p1;
    int resultadoComparacion;

    int i = min - 1;

    for (int j = min; j <= max - 1; j++) {
      p1 = listaOrdenada[j];
      resultadoComparacion = p1.comparaA(pivote, atributo);
      if (resultadoComparacion < 0) {
        i++;
        swap(listaOrdenada, i, j);
      }
    }
    swap(listaOrdenada, i + 1, max);
    return i + 1;
  }

  private void swap(Persona[] listaOrdenada, int i, int j) {
    Persona aux = listaOrdenada[i];
    listaOrdenada[i] = listaOrdenada[j];
    listaOrdenada[j] = aux;
  }
}
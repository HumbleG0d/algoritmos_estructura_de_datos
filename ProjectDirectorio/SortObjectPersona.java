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

  public void mergeSort(Persona[] listaPersonas, int atributo, int min, int max) {
    if (min < max) {
      int midle = (min + max) / 2;
      mergeSort(listaPersonas, atributo, min, midle);
      mergeSort(listaPersonas, atributo, midle + 1, max);
      merge(listaPersonas, atributo, min, max, midle);

    }
  }

  private void merge(Persona[] lisPersonas, int atributo, int min, int max, int midle) {

    int SIZE1 = midle - min + 1;
    int SIZE2 = max - midle;

    Persona lowHalf[] = new Persona[SIZE1];
    Persona heighHalf[] = new Persona[SIZE2];

    for (int i = 0; i < SIZE1; i++) {
      lowHalf[i] = lisPersonas[min + i];
    }
    for (int i = 0; i < SIZE2; i++) {
      heighHalf[i] = lisPersonas[midle + 1 + i];
    }

    int i = 0, j = 0, k = min;
    Persona p1, p2;
    int resultadoComparacion;

    while (i < SIZE1 && j < SIZE2) {
      p1 = lowHalf[i];
      p2 = heighHalf[j];

      resultadoComparacion = p1.comparaA(p2, atributo);
      if (resultadoComparacion < 0) {
        lisPersonas[k] = p1;
        i++;
      } else {
        lisPersonas[k] = p2;
        j++;
      }
      k++;
    }

    while (i < SIZE1) {
      lisPersonas[k] = lowHalf[i];
      i++;
      k++;
    }
    while (j < SIZE2) {
      lisPersonas[k] = heighHalf[j];
      j++;
      k++;
    }
  }
}
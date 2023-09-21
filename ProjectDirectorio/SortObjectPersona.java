package ProjectDirectorio;

public class SortObjectPersona {

  public Persona[] burbuja(Persona[] listaPersonas, int atributo) {

    Persona p1, p2;
    int resultadoComparacion;

    int i = 1;
    boolean intercambio = false;

    while (intercambio == false && i < listaPersonas.length) {
      intercambio = true;

      for (int j = 0; j < listaPersonas.length - i; j++) {
        p1 = listaPersonas[j];
        p2 = listaPersonas[j + 1];
        resultadoComparacion = p1.comparaA(p2, atributo);

        if (resultadoComparacion > 0) {
          listaPersonas[j] = p2;
          listaPersonas[j + 1] = p1;
          intercambio = false;
        }
      }
      i++;
    }
    return listaPersonas;
  }

  public void quickSort(Persona[] listaPersonas, int atributo, int min, int max) {
    if (min < max) {
      int indexPivote = partition(listaPersonas, atributo, min, max);
      quickSort(listaPersonas, atributo, min, indexPivote - 1);
      quickSort(listaPersonas, atributo, indexPivote + 1, max);
    }
  }

  private int partition(Persona[] listaPersonas, int atributo, int min, int max) {
    Persona pivote = listaPersonas[max];
    Persona p1;
    int resultadoComparacion;

    int i = min - 1;

    for (int j = min; j <= max - 1; j++) {
      p1 = listaPersonas[j];
      resultadoComparacion = p1.comparaA(pivote, atributo);
      if (resultadoComparacion < 0) {
        i++;
        swap(listaPersonas, i, j);
      }
    }
    swap(listaPersonas, i + 1, max);
    return i + 1;
  }

  private void swap(Persona[] listaPersonas, int i, int j) {
    Persona aux = listaPersonas[i];
    listaPersonas[i] = listaPersonas[j];
    listaPersonas[j] = aux;
  }

  public void mergeSort(Persona[] listaPersonas, int atributo, int min, int max) {
    if (min < max) {
      int midle = (min + max) / 2;
      mergeSort(listaPersonas, atributo, min, midle);
      mergeSort(listaPersonas, atributo, midle + 1, max);
      merge(listaPersonas, atributo, min, max, midle);

    }
  }

  private void merge(Persona[] listaPersonas, int atributo, int min, int max, int midle) {

    int SIZE1 = midle - min + 1;
    int SIZE2 = max - midle;

    Persona lowHalf[] = new Persona[SIZE1];
    Persona heighHalf[] = new Persona[SIZE2];

    for (int i = 0; i < SIZE1; i++) {
      lowHalf[i] = listaPersonas[min + i];
    }
    for (int i = 0; i < SIZE2; i++) {
      heighHalf[i] = listaPersonas[midle + 1 + i];
    }

    int i = 0, j = 0, k = min;
    Persona p1, p2;
    int resultadoComparacion;

    while (i < SIZE1 && j < SIZE2) {
      p1 = lowHalf[i];
      p2 = heighHalf[j];

      resultadoComparacion = p1.comparaA(p2, atributo);
      if (resultadoComparacion < 0) {
        listaPersonas[k] = p1;
        i++;
      } else {
        listaPersonas[k] = p2;
        j++;
      }
      k++;
    }

    while (i < SIZE1) {
      listaPersonas[k] = lowHalf[i];
      i++;
      k++;
    }
    while (j < SIZE2) {
      listaPersonas[k] = heighHalf[j];
      j++;
      k++;
    }
  }

  public Persona[] heapSort(Persona[] listaPersonas, int atributo) {
    Persona[] lista = new Persona[listaPersonas.length];
    heapSortConstruct(listaPersonas, atributo);
    lista = heapSortExtract(listaPersonas, atributo);

    return lista;
  }

  private void heapSortConstruct(Persona[] listaPersonas, int atributo) {
    int current = 0, maxChildIndex;
    boolean hecho;
    Persona p1, p2;
    int resultadoComparacion;

    for (int i = (listaPersonas.length - 2) / 2; i >= 0; i--) {
      current = i;
      hecho = false;

      while (!hecho) {
        if (2 * current + 1 > listaPersonas.length - 1) {
          hecho = true;
        } else {
          maxChildIndex = heapSortMaxChild(listaPersonas, current, listaPersonas.length - 1, atributo);

          p1 = listaPersonas[current];
          p2 = listaPersonas[maxChildIndex];

          resultadoComparacion = p1.comparaA(p2, atributo);

          if (resultadoComparacion < 0) {
            swap(listaPersonas, current, maxChildIndex);
            current = maxChildIndex;
          } else {
            hecho = true;
          }
        }
      }
    }
  }

  private int heapSortMaxChild(Persona[] listaPersonas, int loc, int end, int atributo) {

    int result, izq, der;
    Persona p1, p2;
    int resultadoComparacion;

    izq = 2 * loc + 1;
    der = 2 * loc + 2;

    p1 = listaPersonas[izq];
    p2 = listaPersonas[der];
    resultadoComparacion = p1.comparaA(p2, atributo);
    if (der <= end && resultadoComparacion < 0) {
      result = der;
    } else {
      result = izq;
    }

    return result;
  }

  private Persona[] heapSortExtract(Persona[] listaPersonas, int atributo) {
    Persona[] lista = new Persona[listaPersonas.length];

    int current, maxChildIndex;
    boolean hecho;
    Persona p1, p2;
    int resultadoComparacion;

    for (int i = listaPersonas.length - 1; i >= 0; i--) {
      lista[i] = listaPersonas[0];
      listaPersonas[0] = listaPersonas[i];
      current = 0;
      hecho = false;

      while (!hecho) {
        if (2 * current + 1 > i) {
          hecho = true;
        } else {

          maxChildIndex = heapSortMaxChild(listaPersonas, current, i, atributo);

          p1 = listaPersonas[current];
          p2 = listaPersonas[maxChildIndex];

          resultadoComparacion = p1.comparaA(p2, atributo);

          if (resultadoComparacion < 0) {
            swap(listaPersonas, current, maxChildIndex);
            current = maxChildIndex;
          } else {
            hecho = true;
          }
        }
      }
    }

    return lista;
  }
}
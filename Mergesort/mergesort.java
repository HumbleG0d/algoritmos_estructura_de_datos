package Mergesort;

import java.util.Arrays;

public class mergesort {
  public static void main(String args[]) {
    int array[] = { 79, 61, 48, 27, 21, 56, 74, 9, 63, 31, 73, 96, 44, 3, 20, 41, 46, 50, 60, 65, 88, 16, 75, 58, 68,
        35,
        55, 98, 94, 78, 23, 85, 77, 87, 30, 43, 34, 83, 38, 25, 18, 26, 37, 64, 6, 13, 67, 76, 81, 93, 32, 72, 22, 17,
        99, 90, 66, 11, 39, 2, 15, 91, 42, 8, 12, 24, 4, 53, 36, 54, 19, 10, 29, 95, 5, 45, 69, 28, 33, 70, 7, 51, 62,
        97, 71, 40, 92, 57, 14, 86, 49, 84, 80, 100, 1, 89, 52, 59, 82 };

    mergeSort(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
  }

  public static void merge(int array[], int min, int max, int midle) {
    int SIZE1 = midle - min + 1;
    int SIZE2 = max - midle;

    int lowHalf[] = new int[SIZE1];
    int heighHalf[] = new int[SIZE2];

    // Se crean dos subarreglos para almacenar temporalmente las mitades baja y alta
    // del arreglo original.

    for (int i = 0; i < SIZE1; i++) {
      lowHalf[i] = array[min + i];
    }
    for (int i = 0; i < SIZE2; i++) {
      heighHalf[i] = array[midle + 1 + i];
    }

    int i = 0, j = 0, k = min;

    // Se inicializan índices para recorrer los subarreglos y el arreglo resultante.

    while (i < SIZE1 && j < SIZE2) {
      if (lowHalf[i] < heighHalf[j]) {
        array[k] = lowHalf[i];
        i++;
      } else {
        array[k] = heighHalf[j];
        j++;
      }
      k++;
    }

    // Se fusionan los subarreglos ordenadamente en el arreglo original.
    while (i < SIZE1) {
      array[k] = lowHalf[i];
      i++;
      k++;
    }
    while (j < SIZE2) {
      array[k] = heighHalf[j];
      j++;
      k++;
    }
  }

  public static void mergeSort(int array[], int min, int max) {
    if (min < max) {
      int midle = (min + max) / 2;
      mergeSort(array, min, midle);
      mergeSort(array, midle + 1, max);

      // Realiza la fucion de los sub-arreglos.
      merge(array, min, max, midle);
    }
  }

}
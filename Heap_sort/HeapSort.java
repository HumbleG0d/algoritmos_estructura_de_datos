package Heap_sort;

import java.util.Arrays;

public class HeapSort {
  public static void main(String args[]) {
    int array[] = { 79, 61, 48, 27, 21, 56, 74, 9, 63, 31, 73, 96, 44, 3, 20, 41, 46, 50, 60, 65, 88, 16, 75, 58, 68,
        35,
        55, 98, 94, 78, 23, 85, 77, 87, 30, 43, 34, 83, 38, 25, 18, 26, 37, 64, 6, 13, 67, 76, 81, 93, 32, 72, 22, 17,
        99, 90, 66, 11, 39, 2, 15, 91, 42, 8, 12, 24, 4, 53, 36, 54, 19, 10, 29, 95, 5, 45, 69, 28, 33, 70, 7, 51, 62,
        97, 71, 40, 92, 57, 14, 86, 49, 84, 80, 100, 1, 89, 52, 59, 82 };

    heapSort(array);
  }

  public static void intercambio(int array[], int p, int q) {
    int temp = array[p];
    array[p] = array[q];
    array[q] = temp;
  }

  public static void heapSort(int array[]) {
    int[] Y = new int[array.length];
    HeapSortConstruct(array);
    Y = HeapSortExtract(array);

    System.out.println(Arrays.toString(Y));
  }

  public static void HeapSortConstruct(int array[]) {
    int current = 0, maxChildIndex;
    boolean hecho;

    for (int i = (array.length - 2) / 2; i >= 0; i--) {
      current = i;
      hecho = false;

      while (!hecho) {
        if (2 * current + 1 > array.length - 1) {
          hecho = true;
        } else {
          maxChildIndex = HeapSortMaxChild(array, current, array.length - 1);
          if (array[current] < array[maxChildIndex]) {
            intercambio(array, current, maxChildIndex);
            current = maxChildIndex;
          } else {
            hecho = true;
          }
        }
      }
    }
  }

  public static int HeapSortMaxChild(int array[], int loc, int end) {
    int result, Izq, Der;
    Izq = 2 * loc + 1;
    Der = 2 * loc + 2;
    if (Der <= end && array[Izq] < array[Der]) {
      result = Der;
    } else {
      result = Izq;
    }
    return result;
  }

  public static int[] HeapSortExtract(int[] array) {
    int[] Y = new int[array.length];

    int current, maxChildIndex;
    boolean hecho;

    for (int i = array.length - 1; i >= 0; i--) {
      Y[i] = array[0];
      array[0] = array[i];
      current = 0;
      hecho = false;

      while (!hecho) {
        if (2 * current + 1 > i) {
          hecho = true;
        } else {
          maxChildIndex = HeapSortMaxChild(array, current, i);
          if (array[current] < array[maxChildIndex]) {
            intercambio(array, current, maxChildIndex);
            current = maxChildIndex;
          } else {
            hecho = true;
          }
        }
      }
    }
    return Y;
  }
}

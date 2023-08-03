package QuickSort;

import java.util.Arrays;

public class quicksort {
  public static void main(String args[]) {
    int array[] = { 79, 61, 48, 27, 21, 56, 74, 9, 63, 31, 73, 96, 44, 3, 20, 41, 46, 50, 60, 65, 88, 16, 75, 58, 68,
        35, 55, 98, 94, 78, 23, 85, 77, 87, 30, 43, 34, 83, 38, 25, 18, 26, 37, 64, 6, 13, 67, 76, 81, 93, 32, 72, 22,
        17, 99, 90, 66, 11, 39, 2, 15, 91, 42, 8, 12, 24, 4, 53, 36, 54, 19, 10, 29, 95, 5, 45, 69, 28, 33, 70, 7, 51,
        62, 97, 71, 40, 92, 57, 14, 86, 49, 84, 80, 100, 1, 89, 52, 59, 82 };

    quickSort(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
  }

  public static void swap(int array[], int i, int j) {
    int aux = array[i];
    array[i] = array[j];
    array[j] = aux;
  }

  public static int partition(int array[], int min, int max) {
    int pivote = array[max];
    int i = min - 1;

    for (int j = min; j <= max - 1; j++) {
      if (array[j] < pivote) {
        i++;
        swap(array, i, j);
      }
    }
    swap(array, i + 1, max);
    return i + 1;
  }

  public static void quickSort(int array[], int min, int max) {
    if (min < max) {
      int indexPivote = partition(array, min, max);
      quickSort(array, min, indexPivote - 1);
      quickSort(array, indexPivote + 1, max);
    }
  }
}

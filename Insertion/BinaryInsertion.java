package Insertion;

import java.util.Arrays;

public class BinaryInsertion {
  public static void main(String args[]) {
    int array[] = { 79, 61, 48, 27, 21, 56, 74, 9, 63, 31, 73, 96, 44, 3, 20, 41, 46, 50, 60, 65, 88, 16, 75, 58, 68,
        35, 55, 98, 94, 78, 23, 85, 77, 87, 30, 43, 34, 83, 38, 25, 18, 26, 37, 64, 6, 13, 67, 76, 81, 93, 32, 72, 22,
        17, 99, 90, 66, 11, 39, 2, 15, 91, 42, 8, 12, 24, 4, 53, 36, 54, 19, 10, 29, 95, 5, 45, 69, 28, 33, 70, 7, 51,
        62, 97, 71, 40, 92, 57, 14, 86, 49, 84, 80, 100, 1, 89, 52, 59, 82 };
    insertion(array);
  }

  public static void insertion(int array[]) {
    int aux, p, u, c;

    for (int i = 1; i < array.length; i++) {
      aux = array[i];
      p = 0;
      u = i - 1;

      while (p <= u) {
        c = (p + u) / 2;
        if (aux < array[c]) {
          u = c - 1;
        } else {
          p = c + 1;
        }
      }
      for (int k = i - 1; k >= p; k--) {
        array[k + 1] = array[k];
      }
      array[p] = aux;
    }

    System.out.println(Arrays.toString(array));
  }
}
package ShellSort;

import java.util.Arrays;

public class Shell {
  public static void main(String args[]) {
    int array[] = { 79, 61, 48, 27, 21, 56, 74, 9, 63, 31, 73, 96, 44, 3, 20, 41, 46, 50, 60, 65, 88, 16, 75, 58, 68,
        35, 55, 98, 94, 78, 23, 85, 77, 87, 30, 43, 34, 83, 38, 25, 18, 26, 37, 64, 6, 13, 67, 76, 81, 93, 32, 72, 22,
        17, 99, 90, 66, 11, 39, 2, 15, 91, 42, 8, 12, 24, 4, 53, 36, 54, 19, 10, 29, 95, 5, 45, 69, 28, 33, 70, 7, 51,
        62, 97, 71, 40, 92, 57, 14, 86, 49, 84, 80, 100, 1, 89, 52, 59, 82 };

    shellSort(array);
  }

  public static void intercambio(int array[], int p, int q) {
    int aux = array[p];
    array[p] = array[q];
    array[q] = aux;
  }

  public static void shellSort(int array[]) {
    int salto, N, j, k;
    N = array.length;
    salto = N / 2;

    while (salto > 0) {
      for (int i = salto; i < N; i++) {
        j = i - salto;
        while (j >= 0) {
          k = j + salto;
          if (array[j] <= array[k]) {
            j = 0;
          } else {
            intercambio(array, j, k);
          }
          j = j - salto;
        }
      }
      salto = salto / 2;
    }
    System.out.println(Arrays.toString(array));
  }
}

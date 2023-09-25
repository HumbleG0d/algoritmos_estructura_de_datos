package Binary_Search;

public class binary {
  public static void main(String args[]) {
    int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(binarySearch(array, 6));
  }

  public static int binarySearch(int[] array, int n) {
    int bajo = 0, alto = array.length - 1;
    int medio = (bajo + alto) / 2;

    int comparaciones = 0;

    while (bajo <= alto && array[medio] != n) {
      comparaciones++;
      if (array[medio] < n) {
        bajo = medio + 1;
      } else {
        alto = medio - 1;
      }
      medio = (bajo + alto) / 2;
    }

    if (bajo > alto)
      return -1;

    System.out.println("Comparaciones: " + comparaciones);
    return medio;
  }
}
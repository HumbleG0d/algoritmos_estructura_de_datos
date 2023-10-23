package Bubble_Sort;

import java.util.Arrays;

public class bs3 {
  public static void main(String args[]) {
    int array[] = { 90, 84, 44, 77, 12 };
    bubbleSort(array);
  }

  public static void bubbleSort(int array[]) {
    int i = 1;
    boolean intercambio = false;
    int comparaciones = 0;
    while (i < array.length && intercambio == false) {
      intercambio = true;
      for (int j = 0; j < array.length - i; j++) {

        comparaciones++;
        if (array[j] > array[j + 1]) {
          int aux = array[j];
          array[j] = array[j + 1];
          array[j + 1] = aux;
          intercambio = false;
        }
      }
      i++;
    }
    System.out.println(Arrays.toString(array));
    System.out.print(comparaciones);
  }
}
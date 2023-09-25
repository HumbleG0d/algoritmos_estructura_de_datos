package Binary_Search.Ejercicios_Wu;

public class Cap11_1 {
  public static void main(String args[]) {
    int array[] = { 10, 15, 25, 30, 33, 34, 46, 55, 78, 84, 96, 99 };

    int x = binarySearch(array, 99);

    if (x != -1) {
      System.out.println("Valor encontrado. Posicion " + x);
    } else {
      System.out.println("Valor no encontrado");
    }

  }

  private static int binarySearch(int[] array, int value_x) {
    int min = 0, max = array.length - 1;
    int midle = (min + max) / 2;

    while (min <= max && array[midle] != value_x) {
      System.out.println("Comparando -> " + array[midle] + " con " + value_x);
      System.out.println("Valor alto: " + max + "\n" + "Valor bajo: " + min);
      System.out.println("=======================");
      if (array[midle] < value_x) {
        min = midle + 1;
      } else {
        max = midle - 1;
      }
      midle = (min + max) / 2;
    }

    if (min > max)
      return -1;

    return midle;
  }
}
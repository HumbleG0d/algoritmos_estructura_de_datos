package Binary_Search;

public class lineal {
  public static void main(String args[]) {
    int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(binaryLineal(array, 6));
  }

  public static int binaryLineal(int[] array, int valor) {
    int loc = 0;
    while (loc < array.length && array[loc] != valor) {
      loc++;
    }
    if (loc == array.length) {
      return -1;
    } else {
      return loc;
    }
  }
}
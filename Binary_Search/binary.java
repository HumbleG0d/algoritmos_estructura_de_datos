package Binary_Search;

public class binary {
  public static void main(String args[]) {
    int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(binarySearch(array, 6));
  }

  public static int binarySearch(int[] array, int n) {
    int min = 0;
    int max = array.length - 1;
    int index = -1;
    while (min <= max) {
      int average = (min + max) / 2;
      if (array[average] < n) {
        min = average + 1;
      } else if (array[average] > n) {
        max = average - 1;
      } else {
        index = average;
        break;
      }
    }
    return index;
  }
}
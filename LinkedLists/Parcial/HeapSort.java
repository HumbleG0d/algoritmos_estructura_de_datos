package LinkedLists.Parcial;

public class HeapSort {
  public static void intercambio(DoubleLinkedList doubleList, int p, int q) {
    /*
     * int temp = array[p];
     * array[p] = array[q];
     * array[q] = temp;
     */
    int temp = doubleList.find(p).data;
    doubleList.find(p).data = doubleList.find(q).data;
    doubleList.find(q).data = temp;
  }

  public static void heapSort(DoubleLinkedList doubleList) {
    HeapSortExtract(doubleList);
    System.out.println(doubleList.toString());
  }

  public static void HeapSortConstruct(DoubleLinkedList doubleList, int length) {
    Nodo start = doubleList.head;
    for (int i = length / 2 - 1; i >= 0; i--) {
      HeapSortMaxChild(doubleList, length, start);
      start = start.next;
    }
  }

  public static void HeapSortMaxChild(DoubleLinkedList doubleList, int length, Nodo current) {
    Nodo largest = current;
    Nodo left = current.next;
    Nodo right = (left != null) ? left.next : null;

    if (left != null && left.data < largest.data)
      largest = left;
    if (right != null && right.data < largest.data)
      largest = right;

    if (largest != current) {
      int temp = largest.data;
      largest.data = current.data;
      current.data = temp;
      HeapSortMaxChild(doubleList, length, current);
    }
  }

  public static void HeapSortExtract(DoubleLinkedList doubleList) {
    int length = doubleList.getSize();
    HeapSortConstruct(doubleList, length);

    Nodo end = doubleList.ultimo;
    for (int i = length - 1; i >= 0; i--) {
      int temp = doubleList.head.data;
      doubleList.head.data = end.data;
      end.data = temp;

      length--;
      HeapSortMaxChild(doubleList, length, end);
      end = end.prev;
    }
  }
}

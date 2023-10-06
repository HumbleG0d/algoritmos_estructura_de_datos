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
    DoubleLinkedList newList = new DoubleLinkedList();
    HeapSortConstruct(doubleList);
    newList = HeapSortExtract(doubleList);
    System.out.println(newList.toString());
  }

  public static void HeapSortConstruct(DoubleLinkedList doubleList) {
    int current = 0, maxChildIndex;
    boolean hecho;

    for (int i = (doubleList.getSize() - 2) / 2; i >= 0; i--) {
      current = i;
      hecho = false;

      while (!hecho) {
        if (2 * current + 1 > doubleList.getSize() - 1) {
          hecho = true;
        } else {
          maxChildIndex = HeapSortMaxChild(doubleList, current, doubleList.getSize() - 1);
          // array[current] < array[maxChildIndex]
          if (doubleList.find(current) != null || doubleList.find(maxChildIndex) != null) {
            if (doubleList.find(current).data < doubleList.find(maxChildIndex).data) {
              intercambio(doubleList, current, maxChildIndex);
              current = maxChildIndex;
            } else {
              hecho = true;
            }
          }

        }
      }
    }
  }

  public static int HeapSortMaxChild(DoubleLinkedList doubleList, int loc, int end) {
    int result, Izq, Der;
    Izq = 2 * loc + 1;
    Der = 2 * loc + 2;

    // Check if left child index is within bounds and if the left child exists
    if (Izq <= end && doubleList.find(Izq) != null) {
      result = Izq;

      // Check if right child index is within bounds and if the right child exists
      if (Der <= end && doubleList.find(Der) != null) {
        // Compare left and right child data, update result accordingly
        if (doubleList.find(Izq).data < doubleList.find(Der).data) {
          result = Der;
        }
      }
    } else {
      // If left child index is out of bounds or left child doesn't exist, set result
      // to -1
      result = -1;
    }

    return result;
  }

  public static DoubleLinkedList HeapSortExtract(DoubleLinkedList doubleList) {
    // int[] Y = new int[array.length];
    DoubleLinkedList newList = new DoubleLinkedList();
    int current, maxChildIndex;
    boolean hecho;

    for (int i = doubleList.getSize() - 1; i >= 0; i--) {
      // Y[i] = array[0];
      newList.find(i).data = doubleList.find(0).data;
      // array[0] = array[i];
      doubleList.find(0).data = doubleList.find(i).data;
      current = 0;
      hecho = false;

      while (!hecho) {
        if (2 * current + 1 > i) {
          hecho = true;
        } else {
          maxChildIndex = HeapSortMaxChild(doubleList, current, i);
          if (doubleList.find(current).data < doubleList.find(maxChildIndex).data) {
            intercambio(doubleList, current, maxChildIndex);
            current = maxChildIndex;
          } else {
            hecho = true;
          }
        }
      }
    }
    return newList;
  }
}

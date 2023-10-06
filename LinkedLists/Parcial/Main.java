package LinkedLists.Parcial;

public class Main {
  public static void main(String args[]) {
    DoubleLinkedList list = new DoubleLinkedList();

    list.addFirst(1);
    list.addFirst(5);
    list.addFirst(8);
    list.addFirst(9);
    list.addFirst(12);
    list.addFirst(14);

    System.out.println(list.toString());
    HeapSort.heapSort(list);

  }
}

package LinkedLists;

public class MergeList {
  class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
      this.next = null;

    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  // Pasamos lista1.head , lista2.head
  public Node mergeLists(Node head1, Node head2) {
    if (head1 == null) {
      return head2;
    }
    if (head2 == null) {
      return head1;
    }

    Node mergeHead, mergeTail;

    if (head1.value <= head2.value) {
      mergeHead = head1;
      head1 = head1.next;
    } else {
      mergeHead = head2;
      head2 = head2.next;
    }

    mergeTail = mergeHead;

    while (head1 != null && head2 != null) {
      if (head1.value <= head2.value) {
        mergeTail.next = head1;
        mergeTail = head1;
        head1 = head1.next;
      } else {
        mergeTail.next = head2;
        mergeTail = head2;
        head2 = head2.next;
      }
    }

    if (head1 != null) {
      mergeTail.next = head1;
    } else {
      mergeTail.next = head2;
    }
    return mergeHead;
  }
}

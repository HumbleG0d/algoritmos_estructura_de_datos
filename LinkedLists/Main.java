package LinkedLists;

public class Main {
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    System.out.println("Lista simple");
    ll.insertFirst(1);
    ll.insertFirst(2);
    ll.insertFirst(4);
    ll.insertFirst(5);
    ll.insertLast(45);
    ll.insert(1, 322);
    ll.displayList();
    System.out.println(ll.deleteFirst());
    ll.displayList();
    System.out.println(ll.deleteLast());
    ll.displayList();
    System.out.println(ll.delete(3));
    ll.displayList();

    ll.displayListReverse();
  }
}

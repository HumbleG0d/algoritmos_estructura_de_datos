package LinkedLists.EjerciciosWU.Ej8;

public class Main {
  public static void main(String args[]) {
    LinkedList ll = new LinkedList();
    Persona p1 = new Persona("Lucho");
    ll.insertFirst(p1);
    Persona p2 = new Persona("Miguel");
    ll.insertFirst(p2);
    Persona p3 = new Persona("Nayeon");
    ll.insertFirst(p3);

    ll.displayList();
  }
}

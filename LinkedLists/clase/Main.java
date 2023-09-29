package LinkedLists.clase;

public class Main {
  public static void main(String args[]) {
    ListaSimple ls = new ListaSimple();
    ls.addLast(1);
    ls.addLast(11);
    ls.addLast(43);
    ls.addLast(56);

    System.out.println(ls.toString());
  }
}
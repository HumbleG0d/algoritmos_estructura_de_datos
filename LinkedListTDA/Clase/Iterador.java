package LinkedListTDA.Clase;

import LinkedListTDA.Clase.list.NoSuchElementException;
import LinkedListTDA.Clase.list.IteratorTDA;

public class Iterador<E> implements IteratorTDA<E> {
  private Nodo<E> actual;

  public Iterador(Nodo<E> nodo) {
    this.actual = nodo;
  }

  @Override
  public boolean hasNext() {
    return actual != null;
  }

  @Override
  public E next() throws NoSuchElementException {
    if (actual == null)
      throw new NoSuchElementException("No mas lementos");
    E data = (E) actual.getData();
    actual = actual.getNext();
    return data;
  }

}

package LinkedListTDA.Clase.list;

public interface ListTDA<E> {
  public void add(E elemento);

  public void add(int index, E elemento) throws IndexOutOfBoundsException;

  public void clear();

  public boolean contain(E elemento);

  public E get(int index) throws IndexOutOfBoundsException;

  public int indexOf(E elemento);

  public boolean isEmpty();

  public E delete(int index) throws IndexOutOfBoundsException;

  public boolean delete(E elemento);

  public E modify(int index, E elemento) throws IndexOutOfBoundsException;

  public int size();

  public void imprimir();
}

package LinkedListTDA.Clase.list;

public interface IteratorTDA<E> {
    public boolean hasNext();

    public E next() throws NoSuchElementException;

}

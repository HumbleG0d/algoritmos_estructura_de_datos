package LinkedListTDA.Clase.list;

public class NoSuchElementException extends RuntimeException {
    public NoSuchElementException(String message) {
        super(message);
    }

    public NoSuchElementException() {
        this("Elemento solicitado no existe en la estructura de datos");
    }

}

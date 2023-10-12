# Solución

package LinkedListTDA.Wu.Ejercicio1_5;

public class SegundoCasillero<T1, T2> {
private T1 elemento1;
private T2 elemento2;

public SegundoCasillero(T1 elemento1) {
establecerElemento(elemento1);
}

public SegundoCasillero(T2 elemento2) {
establecerSElemento(elemento2);
}

public void establecerElemento(T1 elemento) {
this.elemento1 = elemento;
}

public void establecerSElemento(T2 elemento) {
this.elemento2 = elemento;
}

}
No es posible crear constructores específicos para cada tipo genérico (T1 y T2) en una clase genérica. El motivo es que los genéricos se resuelven en tiempo de compilación y se eliminan mediante un proceso llamado "type erasure". Esto significa que no se puede diferenciar entre diferentes tipos genéricos en tiempo de ejecución.

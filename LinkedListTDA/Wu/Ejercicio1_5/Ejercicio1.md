# Soulcion

package LinkedListTDA.Wu.Ejercicio1_5;

import LinkedListTDA.Wu.Casillero;

public class MainEjercicio1 {

public static void main(String args[]) {
Casillero<Libro> casillero1 = new Casillero<Libro>();
Casillero<Libro> casillero2 = new Casillero<Libro>();
Casillero<Escoba> casillero3 = new Casillero<Escoba>();

    casillero1.almacena(new Libro("Edgar Allan Poe"));
    casillero3.almacena(new Escoba());

    System.out.println(casillero1.recupera());// Imprime el objeto
    System.out.println(casillero2.recupera().obterAutor()); // -> Error , valor nulo.
    System.out.println(casillero3.recupera().obtenValor());// Imprime 0.0

}

}

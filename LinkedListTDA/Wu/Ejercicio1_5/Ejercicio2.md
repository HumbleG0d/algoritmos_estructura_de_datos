# Solución

package LinkedListTDA.Wu.Ejercicio1_5;

import LinkedListTDA.Wu.Casillero;

public class MainEjercicio2 {

    public static void main(String args[]) {
        Casillero<Libro> casillero1 = new Casillero<Libro>();
        Casillero<Libro> casillero2 = new Casillero();
        Casillero<Escoba> casillero3 = new Casillero<Escoba>();
        Casillero<Escoba> casillero4;

        casillero1 = casillero2;
        casillero2 = casillero1;

        casillero4 = casillero3;
        // casillero3 = casillero2; // -> no se pueden igualar ya que casillero3 es de
        // tipo Escoba , mientras
        // casillero 2 es de tipo libro.

        // System.out.println(casillero3.recupera().obtenAutor()); -> Error
    }

}

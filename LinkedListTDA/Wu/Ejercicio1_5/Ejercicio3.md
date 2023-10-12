# Solución

package LinkedListTDA.Wu.Ejercicio1_5;

import LinkedListTDA.Wu.Casillero;
import LinkedListTDA.Wu.CasilleroSUB;

public class MainEjercicio3 {
public static void main(String args[]) {
Casillero<Libro> casillero;
CasilleroSUB<Libro> casilleroSub;
casillero = new CasilleroSUB<Libro>();

casillero = casilleroSub;
casilleroSub = casillero; // -> Esta es la sentecia invalida puesto que
CasilleroSub hereda de Casillero ,
// y debido a eso no se puede igualar.

}

}

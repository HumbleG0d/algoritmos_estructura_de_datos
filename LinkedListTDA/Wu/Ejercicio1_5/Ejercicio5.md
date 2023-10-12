# Setencia 1

    Casillero<Integer>[] casillero1 = new Casillero<Integer>[34];

    Esta línea generará una advertencia de tipo no verificada relacionada con la creación de un arreglo genérico. Java no permite la creación de arreglos genéricos directamente debido a las limitaciones del sistema de tipos en tiempo de ejecución.

# Sentencia 2

    Casillero<Integer>[] casilleros2 = new Casillero[23];

    En esta línea, se realiza un "unchecked conversion" (conversión no verificada) al asignar un arreglo de tipo raw Casillero[] a un arreglo de tipo parametrizado Casillero<Integer>[]. Esto generará una advertencia, indicando que se está haciendo un cast sin garantías de que los tipos coincidan correctamente.

# Sentencia 3

    Casillero[] casilleros3 = new Casillero<String>[20];

    Esta línea generará un error de compilación. Java no permite asignar un arreglo de un tipo parametrizado (en este caso, Casillero<String>) a una variable de tipo arreglo sin tipo parametrizado (en este caso, Casillero[]). Esto es parte de las restricciones de generificación y garantiza la seguridad de tipos en tiempo de ejecución.

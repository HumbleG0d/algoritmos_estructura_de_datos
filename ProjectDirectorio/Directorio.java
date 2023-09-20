package ProjectDirectorio;

public interface Directorio {
  public void agrega(Persona newPersona); // *Agrega una persona */

  public boolean borra(String nombre); // *Elimina una persona */

  public Persona busca(String nombre); // *Busca una persona */

  public Persona[] ordena(int atributo); // *Ordena las persona */
}
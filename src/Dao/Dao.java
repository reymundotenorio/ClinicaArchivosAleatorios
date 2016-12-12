/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.io.IOException;
import java.util.List;
/**
 *
 * @author Reymundo Tenorio
 */
public interface Dao<T> {
    public void Guardar(T object) throws IOException;
    public void Actualizar(T Object) throws IOException;
    public void Borrar(int id) throws IOException;
    public List<T> EncontrarTodos() throws IOException;
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.io.IOException;
import POJO.Pacientes;
/**
 *
 * @author Reymundo Tenorio
 */
public interface DaoPacientes extends Dao<Pacientes> {
    public Pacientes BuscarPorID(int id) throws IOException;
    public Pacientes BuscarPorNombres(String name) throws IOException;
    public Pacientes BuscarPorCedula(String Cedula) throws IOException;
}

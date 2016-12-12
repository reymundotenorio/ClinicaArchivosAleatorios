/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import POJO.Pacientes;
import Util.RandomConnection;
import Dao.DaoPacientes;
import com.sun.imageio.plugins.common.I18N;

/**
 *
 * @author Reymundo Tenorio
 */
public class PacientesDaoImp implements DaoPacientes {

    private RandomAccessFile raf;
    private Pacientes Paciente;
    private List<Pacientes> Pacientes;
    private static final int Size = 428;

    public PacientesDaoImp() {
        raf = RandomConnection.GetCurrentConnection();
    }

    @Override
    public Pacientes BuscarPorID(int id) throws IOException {

        long pos = ((id - 1) * Size) + 4;
        raf.seek(pos);

        Paciente = new Pacientes();

        Paciente.setId(raf.readInt());
        Paciente.setCedula(raf.readUTF());
        Paciente.setNombres(raf.readUTF());
        Paciente.setApellidos(raf.readUTF());
        Paciente.setEdad(raf.readInt());
        Paciente.setOcupacion(raf.readUTF());
        Paciente.setDireccion(raf.readUTF());
        Paciente.setTelefonos(raf.readUTF());
        Paciente.setExpediente(raf.readUTF());

        return Paciente;
    }

    @Override
    public Pacientes BuscarPorNombres(String Nombres) throws IOException {

        List<Pacientes> ca = EncontrarTodos();

        Pacientes can = new Pacientes();

        for (Pacientes e : ca) {

            if (e.getNombres().equalsIgnoreCase(Nombres)) {

                can.setId(e.getId());
                can.setCedula(e.getCedula());
                can.setNombres(e.getNombres());
                can.setApellidos(e.getApellidos());
                can.setEdad(e.getEdad());
                can.setOcupacion(e.getOcupacion());
                can.setDireccion(e.getDireccion());
                can.setTelefonos(e.getTelefonos());
                can.setExpediente(e.getExpediente());

                break;
            }

        }

        return can;
    }

    @Override
    public Pacientes BuscarPorCedula(String Cedula) throws IOException {

        List<Pacientes> ca = EncontrarTodos();

        Pacientes can = new Pacientes();

        for (Pacientes e : ca) {

            if (e.getCedula().equalsIgnoreCase(Cedula)) {

                can.setId(e.getId());
                can.setCedula(e.getCedula());
                can.setNombres(e.getNombres());
                can.setApellidos(e.getApellidos());
                can.setEdad(e.getEdad());
                can.setOcupacion(e.getOcupacion());
                can.setDireccion(e.getDireccion());
                can.setTelefonos(e.getTelefonos());
                can.setExpediente(e.getExpediente());

                break;
            }

        }

        return can;
    }

    @Override
    public void Guardar(Pacientes object) throws IOException {
        if (raf == null) {
        }
        raf.seek(0);
        int n = raf.readInt();
        long pos = (Size * n) + 4;
        raf.seek(pos);
        if (object == null) {
        }

        raf.writeInt(object.getId());
        raf.writeUTF(object.getCedula());
        raf.writeUTF(object.getNombres());
        raf.writeUTF(object.getApellidos());
        raf.writeInt(object.getEdad());
        raf.writeUTF(object.getOcupacion());
        raf.writeUTF(object.getDireccion());
        raf.writeUTF(object.getTelefonos());
        raf.writeUTF(object.getExpediente());

        raf.seek(0);
        raf.writeInt(++n);
    }

    @Override
    public void Actualizar(Pacientes Object) throws IOException {

        long pos = ((Object.getId() - 1) * Size) + 4;

        raf.seek(pos);
        raf.writeInt(Object.getId());
        raf.writeUTF(Object.getCedula());
        raf.writeUTF(Object.getNombres());
        raf.writeUTF(Object.getApellidos());
        raf.writeInt(Object.getEdad());
        raf.writeUTF(Object.getOcupacion());
        raf.writeUTF(Object.getDireccion());
        raf.writeUTF(Object.getTelefonos());
        raf.writeUTF(Object.getExpediente());
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Borrar(int id) throws IOException {

        Actualizar(new Pacientes("", "", "", 0, id, "", "", "", ""));
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pacientes> EncontrarTodos() throws IOException {

        Pacientes = new ArrayList<Pacientes>();
        for (int i = 1; i <= Raf(); i++) {
            Paciente = this.BuscarPorID(i);
            if (Paciente.getNombres() == null) {

            } else {
                Pacientes.add(Paciente);
            }

        }

        return Pacientes;
    }

    public int Raf() throws IOException {

        raf.seek(0);

        int B = raf.readInt();

        return B;
    }

}

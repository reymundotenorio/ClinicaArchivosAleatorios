/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Reymundo Tenorio
 */
public class Pacientes {

    private int id;

    public Pacientes() {
    }

    public Pacientes(int id, String Cedula, String Nombres, String Apellidos, int Edad, String Ocupacion, String Direccion, String Telefonos, String Expediente) {
        this.id = id;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Ocupacion = Ocupacion;
        this.Direccion = Direccion;
        this.Telefonos = Telefonos;
        this.Expediente = Expediente;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pacientes(String Cedula, String Nombres, String Apellidos, int Edad, int id, String Ocupacion, String Direccion, String Telefonos, String Expediente) {
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Ocupacion = Ocupacion;
        this.Direccion = Direccion;
        this.Telefonos = Telefonos;
        this.Expediente = Expediente;
        this.id = id;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefonos() {
        return Telefonos;
    }

    public void setTelefonos(String Telefonos) {
        this.Telefonos = Telefonos;
    }

    public String getExpediente() {
        return Expediente;
    }

    public void setExpediente(String Expediente) {
        this.Expediente = Expediente;
    }

    private String Cedula;
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private String Ocupacion;
    private String Direccion;
    private String Telefonos;
    private String Expediente;

}

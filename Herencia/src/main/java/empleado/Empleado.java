/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author charl
 */
public class Empleado {
    //
    private String nombre, apellidoPaterno, apellidoMaterno;
    private int dni;
    //
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int dni) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
    }
    //
    public Empleado() {
        this.nombre = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
        this.dni = 0;
    }
    //
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nApellido paterno: " + apellidoPaterno +
                "\nApellido materno: " + apellidoMaterno +
                "\nDNI: " + dni;
    }
    //
    public String getNombre() {
        return this.nombre;
    }
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    public int getDNI() {
        return this.dni;
    }
    //
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public void setDNI(int dni) {
        this.dni = dni;
    }
}

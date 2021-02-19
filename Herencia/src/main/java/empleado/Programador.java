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
public class Programador extends Empleado {
    //
    private int sueldo;
    //
    public Programador(String nombre, String apellidoPaterno, String apellidoMaterno, int dni, int sueldo) {
        super(nombre, apellidoPaterno, apellidoMaterno, dni);
        this.sueldo = sueldo;
    }
    //
    public Programador() {
        super();
        this.sueldo = 0;
    }
    //
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nApellido paterno: " + apellidoPaterno +
                "\nApellido materno: " + apellidoMaterno +
                "\nDNI: " + dni +
                "\nSueldo: " + sueldo +
    }
    //
    public String getNombre() {
        return this.nombre;
    }
    //
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    //
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    //
    public int getDNI() {
        return this.dni;
    }
    //
    public int getSueldo() {
        return this.sueldo;
    }
    //
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    //
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    //
    public void setDNI(int dni) {
        this.dni = dni;
    }
    //
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}

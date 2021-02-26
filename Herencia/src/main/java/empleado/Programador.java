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
        return "\nSueldo: " + sueldo;
    }
    //
    public int getSueldo() {
        return this.sueldo;
    }
    //
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}

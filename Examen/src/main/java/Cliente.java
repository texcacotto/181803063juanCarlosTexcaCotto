
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Cliente {
    //
    public String nombre;
    public int dni, telefono, edad;
    public ArrayList<Coche> coches = new ArrayList();
    //
    public Cliente(String nombre,  int dni, int telefono, int edad, ArrayList<Coche> coches) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
        this.coches = coches;
    }
    //
    public Cliente() {
        this.nombre = "";
        this.dni = 0;
        this.telefono = 0;
        this.edad = 0;
        this.coches = null;
    }
    //
    public Cliente(String nombre,  int dni, int telefono, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
    }
    //
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nDNI: " + dni +
                "\nTeléfono: " + telefono +
                "\nEdad: " + edad +
                "\nCoche: " + coches;
    }
    public void agregarCoches(Coche cocheNuevo) {
        coches.add(cocheNuevo);
    }
}


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
    //Atributos
    public String nombre;
    public int dni, telefono, edad;
    public ArrayList<Coche> coches = new ArrayList();
    //Constructor completo
    public Cliente(String nombre,  int dni, int telefono, int edad, ArrayList<Coche> coches) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
        this.coches = coches;
    }
    //Constructor vacío
    public Cliente() {
        this.nombre = "";
        this.dni = 0;
        this.telefono = 0;
        this.edad = 0;
        this.coches = null;
    }
    //Constructor extra
    public Cliente(String nombre,  int dni, int telefono, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
    }
    //Método toString
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nDNI: " + dni +
                "\nTeléfono: " + telefono +
                "\nEdad: " + edad +
                "\nCoche: " + coches;
    }
    //Método para agregar los coches
    public void agregarCoches(Coche cocheNuevo) {
        coches.add(cocheNuevo);
    }
}

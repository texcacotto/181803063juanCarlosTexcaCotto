
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
public class Cine {
    //Atributos
    public String nombre;
    public int horaApertura, horaCierre;
    public ArrayList<Pelicula> peliculas;
    //Constructor completo
    public Cine(String nombre, int horaApertura, int horaCierre, ArrayList<Pelicula> peliculas) {
        this.nombre = nombre;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.peliculas = peliculas;
    }
    //Constructor vacío
    public Cine() {
        this.nombre = "";
        this.horaApertura = 0;
        this.horaCierre = 0;
        this.peliculas = null;
    }
    //Método toString
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nHora de apertura: " + horaApertura +
                "\nHora de cierre: " + horaCierre +
                "\nPelículas: " + peliculas;
    }
    //Método para imprimir las películas
    public String imprimirPeliculas() {
        String cartelera = "";
        for(Pelicula pelicula : peliculas) {
            cartelera += pelicula.titulo + "\n";
        }
        return cartelera;
    }
}


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
    public ArrayList<Pelicula> peliculas = new ArrayList();
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
    //Constructor extra
    public Cine(String nombre, int horaApertura, int horaCierre) {
        this.nombre = nombre;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }
    //Método toString
    @Override
    public String toString() {
        return "\nNombre del cine: " + nombre +
                "\nHora de apertura: " + horaApertura +
                "\nHora de cierre: " + horaCierre;
                //"\nPelículas: " + peliculas;
    }
    //Método para imprimir las películas
    public String imprimirPeliculas() {
        String cartelera = "";
        for(Pelicula pelicula : peliculas) {
            cartelera += pelicula.titulo + "\n";
        }
        return cartelera;
    }
    //Método para agregar las películas
    public void agregarPeliculas(Pelicula peliculaNueva) {
        peliculas.add(peliculaNueva);
    }
    //Método para contar las películas
    public String contarPeliculas() {
        return "\nPelículas registradas al momento: " + peliculas.size() + "\n";
    }
    //Método para imprimir el menú de las películas
    public String menuPeliculas() {
       String menu = "";
        int i = 1;
        for(Pelicula pelicula : peliculas) { 
            menu += i + ".- " + pelicula.titulo + "\n";
            i ++;
        }
        return menu;  
    }
    //Método para consultar el horario del cine
    public String consultarHorario(int consulta) {
        if(consulta >= horaApertura & consulta < horaCierre) {
            return "¡Abierto!";
        }
        else {
            return "¡Cerrado!";
        }
    }
}

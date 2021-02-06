
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
public class Disco {
    //Atributos
    public String nombre, artista;
    public int anio;
    public ArrayList<Cancion> canciones;
    //Métodos
    //Constructor completo
    public Disco(String nombre, String artista, int anio, ArrayList<Cancion> canciones) {
        this.nombre = nombre;
        this.artista = artista;
        this.anio = anio;
        this.canciones = canciones;
    }
    //Constructor vacío
    public Disco() {
        this.nombre = "";
        this.artista = "";
        this.anio = 0;
    }
    //Método toString
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nArtista: " + artista +
                "\nAño: " + anio +
                "\nCanciones: " + canciones;
    }
}

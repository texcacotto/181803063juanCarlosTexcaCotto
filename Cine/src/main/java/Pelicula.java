/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Pelicula {
   //Atributos 
    public String titulo, director, genero, casaProductora, clasificacion;
    public int anio;
    public double duracion;
    public boolean subtitulos;
    //Constructor completo
    public Pelicula(String titulo, String director, String genero, String casaProductora, String clasificacion, int anio, double duracion, boolean subtitulos) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.casaProductora = casaProductora;
        this.clasificacion = clasificacion;
        this.anio = anio;
        this.duracion = duracion;
        this.subtitulos = subtitulos;
    }
    //Constructor vacío
    public Pelicula() {
        this.titulo = "";
        this.director = "";
        this.genero = "";
        this.casaProductora = "";
        this.clasificacion = "";
        this.anio = 0;
        this.duracion = 0;
        this.subtitulos = false;
    }
    //Constructor extra
    public Pelicula(String titulo) {
        this.titulo = titulo;
    }
    //Método toString
    @Override
    public String toString() {
        return "Título: " + titulo;
                /*
                "\nDirector: " + director +
                "\nGénero: " + genero +
                "\nCasa productora: " + casaProductora +
                "\nClasificación: " + clasificacion +
                "\nAño: " + anio +
                "\nDuración: " + duracion +
                "\nSubtítulos: " + subtitulos;
                */
    }
}

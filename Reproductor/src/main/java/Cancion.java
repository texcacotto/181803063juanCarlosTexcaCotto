/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Cancion {
    //Atributos
    public int orden;
    public String titulo;
    public double duracion;
    //Métodos
    //Constructor completo
    public Cancion(int orden, String titulo, double duracion) {
        this.orden = orden;
        this.titulo = titulo;
        this.duracion = duracion;
    }
    //Constructor vacío
    public Cancion() {
        this.orden = 0;
        this.titulo = "";
        this.duracion = 0;
    }
    //Método toString
    @Override
    public String toString() {
        return "\nOrden: " + orden +
                "\nTítulo: " + titulo +
                "\nDuración: " + duracion;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author cotto
 */
public class Copia {
    
    private int id, anio;
    private String nombre, tipo, editorial, estatus;
    private Autor autor;

    public Copia(int id, int anio, String nombre, String tipo, String editorial, String estatus, Autor autor) {
        this.id = id;
        this.anio = anio;
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.estatus = estatus;
        this.autor = autor;
    }
    public Copia() {
    }

    @Override
    public String toString() {
        return "Copia{" + "id=" + id + ", anio=" + anio + ", nombre=" + nombre + ", tipo=" + tipo + ", editorial=" + editorial + ", estatus=" + estatus + ", autor=" + autor + '}';
    }

    public int getId() {
        return id;
    }
    public int getAnio() {
        return anio;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public String getEditorial() {
        return editorial;
    }
    public String getEstatus() {
        return estatus;
    }
    public Autor getAutor() {
        return autor;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public abstract class Personaje {
    
    private int id, vida;
    private String nombre, raza;
    
    public Personaje(int id, int vida, String nombre, String raza) {
        this.id = id;
        this.vida = vida;
        this.nombre = nombre;
        this.raza = raza;
    }
    
    public Personaje() {
    }
    
    @Override
    public String toString() {
        return "Personaje{" + "id=" + id + ", vida=" + vida + ", nombre=" + nombre + ", raza=" + raza + '}';
    }
    
    public int getId() {
        return id;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}

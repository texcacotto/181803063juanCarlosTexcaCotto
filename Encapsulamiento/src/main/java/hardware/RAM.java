/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardware;

/**
 *
 * @author charl
 */
public class RAM {
    //
    private int capacidad, velocidad, latencia;
    //
    public RAM(int capacidad, int velocidad, int latencia) {
        this.capacidad = capacidad;
        this.velocidad = velocidad;
        this.latencia = latencia;
    }
    //
    public RAM() {
        this.capacidad = 0;
        this.velocidad = 0;
        this.latencia = 0;
    }
    //
    @Override
    public String toString() {
        return "\nCapacidad (MB): " + capacidad +
                "\nVelocidad (MHz): " + velocidad +
                "\nLatencia (ns): " + latencia;
    }
    //
   public int getCapacidad() {
        return this.capacidad;
    }
    //
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    //
    public int getVelocidad() {
        return this.velocidad;
    }
    //
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    //
    public int getLatencia() {
        return this.latencia;
    }
    //
    public void setLatencia(int latencia) {
        this.latencia = latencia;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class TanqueDeGuerra {
    //Atributos
    public String nombre;
    public int blindaje, velocidadMaxima;
    public double velocidadRotacion, peso, capacidadCarga, cadenciaTiro;
    //Métodos
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nBlindaje (mm): " + blindaje +
                "\nVelocidad máxima (km/h): " + velocidadMaxima +
                "\nVelocidad de rotación (g/s): " + velocidadRotacion +
                "\nPeso (t): " + peso +
                "\nCapacidad de carga (t): " + capacidadCarga +
                "\nCadencia de tiro (s): " + cadenciaTiro;
    }
}

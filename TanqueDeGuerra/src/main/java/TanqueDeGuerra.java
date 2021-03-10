/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Creación de clase de objeto propuesto, en infografía de objetivos de POO.
https://github.com/texcacotto/181803063juanCarlosTexcaCotto/blob/master/TanqueDeGuerra/src/main/java/TanqueDeGuerra.java
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

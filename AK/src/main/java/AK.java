/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class AK {
    //Atributos
    public String material, disponibilidad;
    public int municion;
    public double velocidadDisparo, danio, precio;
    //Métodos
    @Override
    public String toString() {
        return "\nMaterial del arma: " + material +
                "\nDisponibilidad: " + disponibilidad +
                "\nMunición: " + municion +
                "\nVelocidad de disparo: " + velocidadDisparo +
                "\nDaño: " + danio +
                "\nPrecio: " + precio;
    }
}

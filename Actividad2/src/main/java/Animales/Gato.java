package Animales;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cotto
 */
public class Gato extends Mascota {
    
    public Gato(String foto, String comida, String tamanio, String localizacion) {
        super(foto, comida, tamanio, localizacion);
    }
    public Gato() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    public static String vacunar() {
        return "Vacunando...";
    }
}

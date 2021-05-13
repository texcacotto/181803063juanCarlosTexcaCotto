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
public class Leon extends Animal {

    public Leon(String localizacion) {
        super(localizacion);
    }
    public Leon() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    public static String rugir() {
        return "Rugiendo...";
    }
}

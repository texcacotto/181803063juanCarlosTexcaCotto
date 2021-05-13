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
public class Animal {
    
    private String localizacion;

    public Animal(String localizacion) {
        this.localizacion = localizacion;
    }
    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" + "localizacion=" + localizacion + '}';
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
    public static String comer() {
        return "Comiendo...";
    }
    public static String dormir() {
        return "Durmiendo...";
    }
    public static String respirar() {
        return "Respirando...";
    }
}

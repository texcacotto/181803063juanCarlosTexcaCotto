/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Animales.Gato;

/**
 *
 * @author cotto
 */
public class TestGato {
    public static void main(String[] args) {
        
        Gato gatito = new Gato("gato.jpg", "pescado", "pequeño", "ciudad");
        System.out.println(gatito);
        
        System.out.println(Gato.comer());
        System.out.println(Gato.dormir());
        System.out.println(Gato.respirar());
        System.out.println(Gato.hacerruido());
        System.out.println(Gato.vacunar());
    }
}

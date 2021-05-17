/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import Animales.Leon;
 
/**
 *
 * @author cotto
 */
public class TestLeon {
    public static void main(String[] args) {
        
        Leon leoncito = new Leon("Selva");
        
        System.out.println(leoncito);
        System.out.println(Leon.comer());
        System.out.println(Leon.dormir());
        System.out.println(Leon.respirar());
        System.out.println(Leon.rugir());
    }
}

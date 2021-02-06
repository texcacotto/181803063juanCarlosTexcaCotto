/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class TestAK {
    public static void main(String[] args) {
        //Crear un primer objeto (instanciar una clase)
        AK akCobre = new AK();
        akCobre.material = "Cobre";
        akCobre.disponibilidad = "Alta";
        akCobre.municion = 5;
        akCobre.velocidadDisparo = 10.5;
        akCobre.danio = 5;
        akCobre.precio = 10;
        System.out.println(akCobre);
        //Crear un segundo objeto (instanciar una clase)
        AK akDiamante = new AK();
        akDiamante.material = "Diamante";
        akDiamante.disponibilidad = "Baja";
        akDiamante.municion = 20;
        akDiamante.velocidadDisparo = 13;
        akDiamante.danio = 15;
        akDiamante.precio = 12000;
        System.out.println(akDiamante);
    }
}

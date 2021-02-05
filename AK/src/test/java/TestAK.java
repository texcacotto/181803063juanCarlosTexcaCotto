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
        AK cobre = new AK();
        cobre.material = "Cobre";
        cobre.disponibilidad = "Alta";
        cobre.municion = 5;
        cobre.velocidadDisparo = 10.5;
        cobre.danio = 5;
        cobre.precio = 10;
        System.out.println(cobre);
        //Crear un segundo objeto (instanciar una clase)
        AK diamante = new AK();
        diamante.material = "Diamante";
        diamante.disponibilidad = "Baja";
        diamante.municion = 20;
        diamante.velocidadDisparo = 13;
        diamante.danio = 15;
        diamante.precio = 12000;
        System.out.println(diamante);
    }
}

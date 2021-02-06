/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class TestTanqueDeGuerra {
    public static void main(String[] args) {
        //Primer instancia
        TanqueDeGuerra tanqueIS4 = new TanqueDeGuerra();
        tanqueIS4.nombre = "IS-4";
        tanqueIS4.blindaje = 160;
        tanqueIS4.velocidadMaxima = 43;
        tanqueIS4.velocidadRotacion = 28.68;
        tanqueIS4.peso = 60.83;
        tanqueIS4.capacidadCarga = 12.3;
        tanqueIS4.cadenciaTiro = 10.12;
        System.out.println(tanqueIS4);
        //Segunda instancia
        TanqueDeGuerra tanqueIS7 = new TanqueDeGuerra();
        tanqueIS7.nombre = "IS-7";
        tanqueIS7.blindaje = 150;
        tanqueIS7.velocidadMaxima = 50;
        tanqueIS7.velocidadRotacion = 26.39;
        tanqueIS7.peso = 68.19;
        tanqueIS7.capacidadCarga = 15.4;
        tanqueIS7.cadenciaTiro = 11.31;
        System.out.println(tanqueIS7);
    }
}

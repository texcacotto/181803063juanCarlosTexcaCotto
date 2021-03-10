/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class TestUsuario {
     public static void main(String[] args) {
        Usuario usuarioUno = new Usuario(000555, 20000, "BBVA", "Cuenta con tarjeta");
        System.out.println(usuarioUno);
        usuarioUno.setNombreBanco("Scotiabank");
        System.out.println(usuarioUno);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class TestCliente {
    public static void main(String[] args) {
        Cliente clienteNuevo = new Cliente("Predo Clemente", 626, 2475555, 30);
        Coche cocheNuevo = new Coche("Ferrari", "Rojo", "F-100", 1000000, 794613);
        clienteNuevo.agregarCoches(cocheNuevo);
        System.out.println(clienteNuevo);
    }
}

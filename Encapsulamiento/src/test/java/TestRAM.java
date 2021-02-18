
import hardware.RAM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class TestRAM {
    public static void main(String[] args) {
        //
        RAM sdram = new RAM(512, 150, 8);
        System.out.println(sdram);
        //
        sdram.setCapacidad(256);
        sdram.setVelocidad(100);
        sdram.setLatencia(10);
        System.out.println(sdram);
    }
}

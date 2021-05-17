
import Biblioteca.Lector;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cotto
 */
public class TestLector {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad de copias solicitadas:");
        int prestamos = scanner.nextInt();
        
        Lector primerLector = new Lector(prestamos);
        System.out.println(Lector.maximoPrestamos(primerLector.getPrestamos()));
    }
}

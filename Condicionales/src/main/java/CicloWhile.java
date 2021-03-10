
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class CicloWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número inicial para la cuenta regresiva:");
        int numeroSerie = scanner.nextInt();
        System.out.println("Esta es la cuenta regresiva:");
        while(numeroSerie >= 0) {
            System.out.println(numeroSerie);
            numeroSerie--;
        }
    }
}


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Un programa que solicite al usuario su edad,
y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).


*/

/**
 *
 * @author charl
 */
public class Ejercicio81Nivel3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();
        System.out.println("Resultado:");
        for(int i = 1; i <= edad; i++) {
            System.out.println(i);
        }
    }
}

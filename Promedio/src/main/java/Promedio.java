
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
public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un primer número:");
        double numeroUno = scanner.nextDouble();
        System.out.println("Ingresa un segundo número:");
        double numeroDos = scanner.nextDouble();
        System.out.println("Ingresa un tercer número:");
        double numeroTres = scanner.nextDouble();
        double sumaNumeros = (numeroUno + numeroDos + numeroTres);
        System.out.println("El promedio es: " + (sumaNumeros / 3));
    }
}

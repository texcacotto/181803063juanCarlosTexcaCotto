
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
public class Opciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un primer número:");
        int numeroUno = scanner.nextInt();
        System.out.println("Ingresa un segundo número:");
        int numeroDos = scanner.nextInt();
        System.out.println("Opción 1: Suma\nOpción 2: Resta");
        int opcion = scanner.nextInt();
        switch(opcion) {
            case 1:
                System.out.println("Resultado: " + (numeroUno + numeroDos));
            break;
            case 2:
                System.out.println("Resultado: " + (numeroUno - numeroDos));
            break;
            default:
                System.out.println("¡Opción inválida!");
            break;
        }
    }
}

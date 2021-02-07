
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Un programa que solicite 3 números,
y los imprima ordenados de menor a mayor.
https://github.com/texcacotto/181803063juanCarlosTexcaCotto/blob/master/EjerciciosEC1/src/main/java/Ejercicio46Nivel2.java
*/

/**
 *
 * @author charl
 */
public class Ejercicio46Nivel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngresa un primer número:");
        int numeroUno = scanner.nextInt();
        System.out.println("Ingresa un segundo número:");
        int numeroDos = scanner.nextInt();
        System.out.println("Ingresa un tercer número:");
        int numeroTres = scanner.nextInt();     
        System.out.println("\nResultado:");
        if(numeroUno > numeroDos) {
            if(numeroUno > numeroTres) {
                if(numeroDos > numeroTres) {
                    System.out.println(numeroTres + ", " + numeroDos + ", " + numeroUno);
                }
                else {
                    System.out.println(numeroDos + ", " + numeroTres + ", " + numeroUno);
                }
            }
            else {
                System.out.println(numeroDos + ", " + numeroUno + ", " + numeroTres);
            }
        }
        else {
            if(numeroDos > numeroTres) {
                if(numeroUno > numeroTres) {
                    System.out.println(numeroTres + ", " + numeroUno + ", " + numeroDos);
                }
                else {
                    System.out.println(numeroUno + ", " + numeroTres + ", " + numeroDos);
                }              
            }
            else {
                System.out.println(numeroUno + ", " + numeroDos + ", " + numeroTres);
            }
        }
    }
}

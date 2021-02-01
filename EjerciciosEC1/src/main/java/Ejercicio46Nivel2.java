
import java.util.Arrays;
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
        int [] arreglo = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 3 números por separado:");
        for(int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(arreglo);
        System.out.println("Resultado:\n" + Arrays.toString(arreglo));
    }
}

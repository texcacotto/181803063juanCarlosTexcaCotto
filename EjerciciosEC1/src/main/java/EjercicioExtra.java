
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Un programa que solicite el número de filas para una pirámide,
y la imprima usando gatos (#).
https://github.com/texcacotto/181803063juanCarlosTexcaCotto/blob/master/EjerciciosEC1/src/main/java/EjercicioExtra.java
*/

/**
 *
 * @author charl
 */
public class EjercicioExtra {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número de filas:");
        int numeroFilas = scanner.nextInt();
        System.out.println("Resultado:");
        for(int i = 1; i <= numeroFilas; i++) {
            for(int espacios = 1; espacios <= numeroFilas - i; espacios++) {
                System.out.print(" ");
            }
            for(int gatos = 1; gatos <= (i * 2) - 1; gatos++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

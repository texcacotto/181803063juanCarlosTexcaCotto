
import java.util.Calendar;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Un programa que solicite al usuario su edad,
y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).
https://github.com/texcacotto/181803063juanCarlosTexcaCotto/blob/master/EjerciciosEC1/src/main/java/Ejercicio81Nivel3.java
*/

/**
 *
 * @author charl
 */
public class Ejercicio81Nivel3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar fecha = Calendar.getInstance();
        int anioActual = fecha.get(Calendar.YEAR);
        System.out.println("\nIngresa tu edad:");
        int edad = scanner.nextInt();
        System.out.println("¿Cumpliste años en el transcurso del " + anioActual + "?");
        System.out.println("Ingresa: 1 para Sí / 2 para No");
        int respuesta = scanner.nextInt();
        System.out.println("\nResultado:");
        int primerCumple = 0;
        if(respuesta == 1) {
            primerCumple = (anioActual - edad) + 1;
        }
        if(respuesta == 2) {
            primerCumple = (anioActual - edad);
            anioActual = (anioActual - 1);
        }
        for(int i = primerCumple; i <= anioActual; i++) {
            System.out.println(i);
        }
    }
}

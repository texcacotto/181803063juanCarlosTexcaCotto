
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Se requiere un juego en donde el programa determine un número aleatorio del 1 al 100,
el usuario irá intentando adivinar el número,
el programa le dará pistas de si es un número mayor, un número menor, o si ya le atinó al número.
https://github.com/texcacotto/181803063juanCarlosTexcaCotto/blob/master/EjerciciosEC1/src/main/java/Ejercicio72Nivel3.java
*/

/**
 *
 * @author charl
 */
public class Ejercicio72Nivel3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MAXIMO = 100;
        int MINIMO = 1;
        int rango = (MAXIMO - MINIMO) + 1;
        int aleatorio = (int) (Math.random() * rango) + MINIMO;
        System.out.println("¡Número aleatorio preparado!\n¿Cuál número podría ser?");
        int i = 0;
        while(i != aleatorio) {
            int propuesta = scanner.nextInt();
            if(propuesta > aleatorio) {
                System.out.println("¡Debe ser menor!");
            }
            else {
                if(propuesta < aleatorio) {
                    System.out.println("¡Debe ser mayor!");
                }
                else {
                    System.out.println("¡Descubriste el número aleatorio!");
                    i = propuesta;
                }
            }
        }
    }
}

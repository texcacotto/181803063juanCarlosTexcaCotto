
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
En Cinépolis existen 3 tipos de tarjeta,
para la Premium debes contar con más de 18 visitas,
para la Dorada debes contar con 10 visitas mínimo,
y para la Roja debes contar con menos de 10 visitas.
https://github.com/texcacotto/181803063juanCarlosTexcaCotto/blob/master/EjerciciosEC1/src/main/java/Ejercicio55Nivel2.java
*/

/**
 *
 * @author charl
 */
public class Ejercicio55Nivel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de visitas que has hecho:");
        int visitas = scanner.nextInt();
        if(visitas > 18) {
            System.out.println("¡Te corresponde una tarjeta Premium!");
        }
        else {
            if(visitas >= 10) {
                System.out.println("¡Te corresponde una tarjeta Dorada!");
            }
            else {
                System.out.println("¡Te corresponde una tarjeta Roja!");
            }
        }
    }
}

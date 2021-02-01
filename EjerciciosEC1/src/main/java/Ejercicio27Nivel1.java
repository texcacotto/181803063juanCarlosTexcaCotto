
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Un programa que solicite el precio de 3 productos,
e imprima el subtotal (la sumatoria del precio de los productos),
el IVA (el subtotal por 0.16),
y el total (la suma del subtotal y el IVA).
https://github.com/texcacotto/181803063juanCarlosTexcaCotto/blob/master/EjerciciosEC1/src/main/java/Ejercicio27Nivel1.java
*/

/**
 *
 * @author charl
 */
public class Ejercicio27Nivel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el precio de c/u de los 3 productos:");
        double productoUno = scanner.nextDouble();
        double productoDos = scanner.nextDouble();
        double productoTres = scanner.nextDouble();
        double subtotal = (productoUno + productoDos + productoTres);
        System.out.println("Subtotal:\n$" + subtotal);
        double iva = (subtotal * 0.16);
        System.out.println("IVA:\n$" + iva);
        double totalCompra = (subtotal + iva);
        System.out.println("Total de la compra:\n$" + totalCompra);
    }
}

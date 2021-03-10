
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
https://github.com/texcacotto/181803063juanCarlosTexcaCotto/blob/master/ModuloGalletas/src/test/java/TestGalleta.java
*/

/**
 *
 * @author charl
 */
public class TestGalleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n¡Ingresa un nuevo producto!");
        System.out.println("Código:");
        String codigo = scanner.nextLine();
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Marca:");
        String marca = scanner.nextLine();
        System.out.println("Precio:");
        double precio = scanner.nextDouble();
        System.out.println("Contenido neto (g):");
        int contenidoNeto = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tipo de empaque (Bolsa/Caja):");
        String tipoEmpaque = scanner.nextLine();
        System.out.println("Fecha de caducidad (dd/mm/aa):");
        String fechaCaducidad = scanner.nextLine();
        System.out.println("¡Producto guardado!");
        Galleta galletaUno = new Galleta("producto0001", "Marías Azucaradas", "Gamesa", 14, 150, "Bolsa", "15/Dic/2022");
        Galleta galletaDos = new Galleta("producto0002", "Chokis Chocobase", "Gamesa", 13, 84, "Bolsa", "30/Nov/2021");
        Galleta galletaTres = new Galleta("producto0003", "Besitos de Nuez", "Tía Rosa", 10, 70, "Bolsa", "01/Ene/2023");
        Galleta galletaCuatro = new Galleta(codigo, nombre, marca, precio, contenidoNeto, tipoEmpaque, fechaCaducidad);
        System.out.println(galletaUno);
        System.out.println(galletaDos);
        System.out.println(galletaTres);
        System.out.println(galletaCuatro);
    }
}

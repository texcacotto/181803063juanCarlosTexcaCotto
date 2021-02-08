
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
        System.out.println("Contenido neto (gr):");
        int contenidoNeto = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tipo de empaque (Bolsa/Caja):");
        String tipoEmpaque = scanner.nextLine();
        System.out.println("Fecha de caducidad (dd/mm/aa):");
        String fechaCaducidad = scanner.nextLine();
        System.out.println("¡Producto guardado!");
        Galleta galletaUno = new Galleta("", "", "", 0, "", "");
        Galleta galletaDos = new Galleta("", "", "", 0, "", "");
        Galleta galletaTres = new Galleta("", "", "", 0, "", "");
        Galleta galletaCuatro = new Galleta(codigo, nombre, marca, contenidoNeto, tipoEmpaque, fechaCaducidad);
        System.out.println(galletaUno);
        System.out.println(galletaDos);
        System.out.println(galletaTres);
        System.out.println(galletaCuatro);
    }
}

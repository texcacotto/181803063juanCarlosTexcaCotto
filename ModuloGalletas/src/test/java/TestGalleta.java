
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

*/

/**
 *
 * @author charl
 */
public class TestGalleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n¡Ingresa una nueva materia!");
        System.out.println("Nombre:");
        String nombreMateria = scanner.nextLine();
        System.out.println("Carrera:");
        String carrera = scanner.nextLine();
        System.out.println("Créditos:");
        int creditos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Código:");
        String codigoMateria = scanner.nextLine();
        System.out.println("Cuatrimestre:");
        String cuatrimestre = scanner.nextLine();
        System.out.println("¡Materia guardada!");
        
        
        
        
        Galleta galletaUno = new Galleta(carrera, carrera, carrera, creditos, carrera, carrera);
        Galleta galletaDos = new Galleta(carrera, carrera, carrera, creditos, carrera, carrera);
        Galleta galletaTres = new Galleta(carrera, carrera, carrera, creditos, carrera, carrera);
        Galleta galletaCuatro = new Galleta(carrera, carrera, carrera, creditos, carrera, carrera);
        System.out.println(galletaUno);
        System.out.println(galletaDos);
        System.out.println(galletaTres);
        System.out.println(galletaCuatro);
    }
}


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
https://github.com/texcacotto/181803063juanCarlosTexcaCotto/blob/master/ModuloMaterias/src/test/java/TestMateria.java
*/

/**
 *
 * @author charl
 */
public class TestMateria {
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
        Materia materiaUno = new Materia("POO", "TI", 20, "ITI-POO", "Enero-Abril 2021");
        Materia materiaDos = new Materia("BD", "TI", 15, "ITI-BD", "Enero-Abril 2021");
        Materia materiaTres = new Materia("Redes", "TI", 10, "ITI-R", "Enero-Abril 2021");
        Materia materiaCuatro = new Materia(nombreMateria, carrera, creditos, codigoMateria, cuatrimestre);
        System.out.println(materiaUno);
        System.out.println(materiaDos);
        System.out.println(materiaTres);
        System.out.println(materiaCuatro);
    }
}

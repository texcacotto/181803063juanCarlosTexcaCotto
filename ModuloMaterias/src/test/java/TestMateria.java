
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class TestMateria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Ingresa el nombre de la materia:");
        //String nombreMateria = scanner.nextLine();
        
        
        
        Materia materiaUno = new Materia("Redes", "TI", 10, "redesTI2021", "Enero - Abril 2021");
        Materia materiaDos = new Materia(nombreMateria, carrera, 0, codigoMateria, cuatrimestre);
        Materia materiaTres = new Materia();
        System.out.println(materiaUno);
        System.out.println(materiaDos);
        System.out.println(materiaTres);
    }
}

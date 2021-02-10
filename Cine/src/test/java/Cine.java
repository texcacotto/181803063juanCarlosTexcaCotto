
import java.util.ArrayList;
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
public class Cine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pelicula> peliculas = new ArrayList();
        Pelicula peliculaRobocop = new Pelicula("Robocop");
        peliculas.add(peliculaRobocop);
        System.out.println("\n¿Quieres registrar una nueva película?");
        int respuesta = 0;
        while(respuesta != 2) {
            System.out.println("\nIngresa:\n1 para Continuar / 2 para Salir");
            respuesta = scanner.nextInt();
            scanner.nextLine();
            if(respuesta == 1) {
                System.out.println("Título:");
                String titulo = scanner.nextLine();
                Pelicula peliculaNueva = new Pelicula(titulo);
                peliculas.add(peliculaNueva);
            }
        }
        System.out.println("\nPelículas registradas al momento: " + peliculas.size() + "\n");
        for(Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        /*
        Pelicula peliculaUno = new Pelicula("Black Widow");
        Pelicula peliculaDos = new Pelicula("Godzilla vs. Kong");
        Pelicula peliculaTres = new Pelicula("Love");
        //Lista ligada (puede ser de un tipo de variable o de una clase)
        ArrayList<Pelicula> peliculas = new ArrayList();
        //Agregando objetos a la lista ligada
        peliculas.add(peliculaUno);
        peliculas.add(peliculaDos);
        peliculas.add(peliculaTres);
        //Imprimiendo la cantidad de objetos que contiene la lista ligada
        System.out.println(peliculas.size());
        //Imprimiendo los objetos de la lista ligada
        for(Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        */
    }
}

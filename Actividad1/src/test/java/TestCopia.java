/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Biblioteca.Autor;
import Biblioteca.Copia;

/**
 *
 * @author cotto
 */
public class TestCopia {
    public static void main(String[] args) {
        
        Autor primerAutor = new Autor("Miyamoto Musashi", "Japones", 1584);
        Autor segundoAutor = new Autor("Carlos Cuauhtemoc Sanchez", "Mexicano", 1964);
        
        Copia primerCopia = new Copia(1, 2015, "El libro de los cinco anillos", "Historia", "Satori", "En biblioteca", primerAutor);
        
        System.out.println(primerCopia);
    }
}

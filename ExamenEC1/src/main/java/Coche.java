/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Coche {
    //Atributos
    public String marca, color, modelo;
    public double precio;
    public int matricula;
    //Constructor completo
    public Coche(String marca, String color, String modelo, double precio, int matricula) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.matricula = matricula;
    }
    //Constructor vacío
    public Coche() {
        this.marca = "";
        this.color = "";
        this.modelo = "";
        this.precio = 0;
        this.matricula = 0;
    }
    //Método toString
    @Override
    public String toString() {
        return "\nMarca: " + marca +
                "\nColor: " + color +
                "\nModelo: " + modelo +
                "\nPrecio: " + precio +
                "\nMatrícula: " + matricula;
    }
}

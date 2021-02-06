/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Taza {
    //Atributos
    public String modelo, tamanio, material, color;
    public double precio;
    //Métodos
    //Constructor completo
    public Taza(String modelo, String tamanio, String material, String color, double precio) {
        this.modelo = modelo;
        this.tamanio = tamanio;
        this.material = material;
        this.color = color;
        this.precio = precio;
    }
    //Constructor vacío
    public Taza() {
        this.modelo = "";
        this.tamanio = "";
        this.material = "";
        this.color = "";
        this.precio = 0;
    }
    //Método toString
    @Override
    public String toString() {
        return "\nModelo: " + modelo +
                "\nTamaño: " + tamanio +
                "\nMaterial: " + material +
                "\nColor: " + color +
                "\nPrecio: " + precio;
    }
}

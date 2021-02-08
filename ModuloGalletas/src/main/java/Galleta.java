/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
https://github.com/texcacotto/181803063juanCarlosTexcaCotto/blob/master/ModuloGalletas/src/main/java/Galleta.java
*/

/**
 *
 * @author charl
 */
public class Galleta {
    //Atributos
    public String codigo, nombre, marca, tipoEmpaque, fechaCaducidad;
    double precio;
    public int contenidoNeto;
    //Métodos
    //Constructor completo
    public Galleta(String codigo, String nombre, String marca, double precio, int contenidoNeto, String tipoEmpaque, String fechaCaducidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.contenidoNeto = contenidoNeto;
        this.tipoEmpaque = tipoEmpaque;
        this.fechaCaducidad = fechaCaducidad;
    }
    //Constructor vacío
    public Galleta() {
        this.codigo = "";
        this.nombre = "";
        this.marca = "";
        this.precio = 0;
        this.contenidoNeto = 0;
        this.tipoEmpaque = "";
        this.fechaCaducidad = "";
    }
    //Método toString
    @Override
    public String toString() {
        return "\nCódigo: " + codigo +
                "\nNombre: " + nombre +
                "\nMarca: " + marca +
                "\nPrecio: " + precio +
                "\nContenido neto (g): " + contenidoNeto +
                "\nTipo de empaque: " + tipoEmpaque +
                "\nFecha de caducidad: " + fechaCaducidad;
    }
}

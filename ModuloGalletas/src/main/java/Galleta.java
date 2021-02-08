/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Galleta {
    //Atributos
    public String codigo, nombre, marca, tipoEmpaque, fechaCaducidad;
    public int contenidoNeto;
    //Métodos
    //Constructor completo
    public Galleta(String codigo, String nombre, String marca, int contenidoNeto, String tipoEmpaque, String fechaCaducidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.contenidoNeto = contenidoNeto;
        this.tipoEmpaque = tipoEmpaque;
        this.fechaCaducidad = fechaCaducidad;
    }
    //Constructor vacío
    public Galleta() {
        this.codigo = "";
        this.nombre = "";
        this.marca = "";
        this.contenidoNeto = 0;
        this.tipoEmpaque = "";
        this.fechaCaducidad = "";
    }
    //Método toString
    @Override
    public String toString() {
        return "\nCódigo: " + codigo +
                "\nNombre:" + nombre +
                "\nMarca:" + marca +
                "\nContenido neto:" + contenidoNeto +
                "\nTipo de empaque:" + tipoEmpaque +
                "\n:Fecha de caducidad:" + fechaCaducidad;
    }
}

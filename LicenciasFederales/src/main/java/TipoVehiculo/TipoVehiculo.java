/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoVehiculo;

/**
 *
 * @author cotto
 */
public class TipoVehiculo {
    
    private int idTipoVehiculo;
    private String categoria, medioDesplaza, descripcion, excepciones;
    
    public TipoVehiculo(int idTipoVehiculo, String categoria, String medioDesplaza, String descripcion, String excepciones) {
        this.idTipoVehiculo = idTipoVehiculo;
        this.categoria = categoria;
        this.medioDesplaza = medioDesplaza;
        this.descripcion = descripcion;
        this.excepciones = excepciones;
    }
    public TipoVehiculo(String categoria, String medioDesplaza, String descripcion, String excepciones) {
        this.categoria = categoria;
        this.medioDesplaza = medioDesplaza;
        this.descripcion = descripcion;
        this.excepciones = excepciones;
    }
    public TipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }
    public TipoVehiculo() {
    }
    
    @Override
    public String toString() {
        return categoria;
    }
    public String imprimirTipoVehiculo() {
        return "TipoVehiculo{" + "idTipoVehiculo=" + idTipoVehiculo + ", categoria=" + categoria + ", medioDesplaza=" + medioDesplaza + ", descripcion=" + descripcion + ", excepciones=" + excepciones + '}';
    }
    
    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getMedioDesplaza() {
        return medioDesplaza;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getExcepciones() {
        return excepciones;
    }
    
    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setMedioDesplaza(String medioDesplaza) {
        this.medioDesplaza = medioDesplaza;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setExcepciones(String excepciones) {
        this.excepciones = excepciones;
    }
}

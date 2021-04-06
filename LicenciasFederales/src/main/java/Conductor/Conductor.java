/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conductor;

/**
 *
 * @author cotto
 */
public class Conductor {
    
    private int idConductor, examenMedico, docRequeridos, estatus;
    private String nombre;
    
    public Conductor(int idConductor, int examenMedico, int docRequeridos, int estatus, String nombre) {
        this.idConductor = idConductor;
        this.examenMedico = examenMedico;
        this.docRequeridos = docRequeridos;
        this.estatus = estatus;
        this.nombre = nombre;
    }
    public Conductor() {
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    public String imprimirConductor() {
        return "Conductor{" + "idConductor=" + idConductor + ", examenMedico=" + examenMedico + ", docRequeridos=" + docRequeridos + ", estatus=" + estatus + ", nombre=" + nombre + '}';
    }
    
    public int getIdConductor() {
        return idConductor;
    }
    public int getExamenMedico() {
        return examenMedico;
    }
    public int getDocRequeridos() {
        return docRequeridos;
    }
    public int getEstatus() {
        return estatus;
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }
    public void setExamenMedico(int examenMedico) {
        this.examenMedico = examenMedico;
    }
    public void setDocRequeridos(int docRequeridos) {
        this.docRequeridos = docRequeridos;
    }
    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

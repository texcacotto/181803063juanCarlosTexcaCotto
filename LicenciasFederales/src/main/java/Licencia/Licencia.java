/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Licencia;

/**
 *
 * @author cotto
 */
public class Licencia {
    
    private int idLicencia, idConductor, idTipoVehiculo, modalidad; 
    private String inicioVigencia, finVigencia;
    
    public Licencia(int idLicencia, int idConductor, int idTipoVehiculo, int modalidad, String inicioVigencia, String finVigencia) {
        this.idLicencia = idLicencia;
        this.idConductor = idConductor;
        this.idTipoVehiculo = idTipoVehiculo;
        this.modalidad = modalidad;
        this.inicioVigencia = inicioVigencia;
        this.finVigencia = finVigencia;
    }
    public Licencia() {
    }
    
    @Override
    public String toString() {
        return "" + idLicencia;
    }
    public String imprimirLicencia() {
        return "Licencia{" + "idLicencia=" + idLicencia + ", idConductor=" + idConductor + ", idTipoVehiculo=" + idTipoVehiculo + ", modalidad=" + modalidad + ", inicioVigencia=" + inicioVigencia + ", finVigencia=" + finVigencia + '}';
    }
    
    public int getIdLicencia() {
        return idLicencia;
    }
    public int getIdConductor() {
        return idConductor;
    }
    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }
    public int getModalidad() {
        return modalidad;
    }
    public String getInicioVigencia() {
        return inicioVigencia;
    }
    public String getFinVigencia() {
        return finVigencia;
    }
    
    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }
    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }
    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }
    public void setModalidad(int modalidad) {
        this.modalidad = modalidad;
    }
    public void setInicioVigencia(String inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }
    public void setFinVigencia(String finVigencia) {
        this.finVigencia = finVigencia;
    }
}

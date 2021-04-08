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
    
    private int idLicencia, idConductor, idTipoVehiculo, modalidad, inicioVigencia, finVigencia;
    
    public Licencia(int idLicencia, int idConductor, int idTipoVehiculo, int modalidad, int inicioVigencia, int finVigencia) {
        this.idLicencia = idLicencia;
        this.idConductor = idConductor;
        this.idTipoVehiculo = idTipoVehiculo;
        this.modalidad = modalidad;
        this.inicioVigencia = inicioVigencia;
        this.finVigencia = finVigencia;
    }
    public Licencia(int idLicencia, int idConductor, int idTipoVehiculo) {
        this.idLicencia = idLicencia;
        this.idConductor = idConductor;
        this.idTipoVehiculo = idTipoVehiculo;
    }
    public Licencia(int idConductor, int idTipoVehiculo) {
        this.idConductor = idConductor;
        this.idTipoVehiculo = idTipoVehiculo;
    }
    public Licencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }
    public Licencia() {
    }
    
    @Override
    public String toString() {
        return idLicencia + " > " + inicioVigencia + "-" + finVigencia;
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
    public int getInicioVigencia() {
        return inicioVigencia;
    }
    public int getFinVigencia() {
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
    public void setInicioVigencia(int inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }
    public void setFinVigencia(int finVigencia) {
        this.finVigencia = finVigencia;
    }
}

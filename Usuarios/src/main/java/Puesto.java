/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Puesto {
    
    private int idPuesto, idUsuario, sueldoSemana, horasDia;
    private String puesto;

    public Puesto(int idPuesto, int idUsuario, int sueldoSemana, int horasDia, String puesto) {
        this.idPuesto = idPuesto;
        this.idUsuario = idUsuario;
        this.sueldoSemana = sueldoSemana;
        this.horasDia = horasDia;
        this.puesto = puesto;
    }

    public Puesto() {
    }

    @Override
    public String toString() {
        return "Puesto{" + "idPuesto=" + idPuesto + ", idUsuario=" + idUsuario + ", sueldoSemana=" + sueldoSemana + ", horasDia=" + horasDia + ", puesto=" + puesto + '}';
    }

    public int getIdPuesto() {
        return idPuesto;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public int getSueldoSemana() {
        return sueldoSemana;
    }
    public int getHorasDia() {
        return horasDia;
    }
    public String getPuesto() {
        return puesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setSueldoSemana(int sueldoSemana) {
        this.sueldoSemana = sueldoSemana;
    }
    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}

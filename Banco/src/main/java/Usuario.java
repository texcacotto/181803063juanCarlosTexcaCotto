/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Usuario {
    //
    private int id, dineroCuenta;
    private String nombreBanco, tarjeta;
    //
    public Usuario(int id, int dineroCuenta, String nombreBanco, String tarjeta) {
        this.id = id;
        this.dineroCuenta = dineroCuenta;
        this.nombreBanco = nombreBanco;
        this.tarjeta = tarjeta;
    }
    //
    public Usuario() {
        this.id = 0;
        this.dineroCuenta = 0;
        this.nombreBanco = "";
        this.tarjeta = "";
    }
    //
    @Override
    public String toString() {
        return "\nID: " + id +
                "\nDinero: " + dineroCuenta +
                "\nBanco: " + nombreBanco +
                "\nTarjeta: " + tarjeta;
    }
    //
    public int getID() {
        return this.id;
    }
    public int getDineroCuenta() {
        return this.dineroCuenta;
    }
    public String getNombreBanco() {
        return this.nombreBanco;
    }
    public String getTarjeta() {
        return this.tarjeta;
    }
    //
    public void setID(int id) {
        this.id = id;
    }
    public void setDineroCuenta(int dineroCuenta) {
        this.dineroCuenta = dineroCuenta;
    }
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
}

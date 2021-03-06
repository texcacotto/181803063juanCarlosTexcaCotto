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
    
    private int id, status;
    //Para status: 1 - Vigente / 0 - No vigente
    private String nombreUsuario, contraseña, fechaAlta;

    public Usuario(int id, int status, String nombreUsuario, String contraseña, String fechaAlta) {
        this.id = id;
        this.status = status;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.fechaAlta = fechaAlta;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", status=" + status + ", nombreUsuario=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + ", fechaAlta=" + fechaAlta + '}';
    }

    public int getId() {
        return id;
    }
    public int getStatus() {
        return status;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}

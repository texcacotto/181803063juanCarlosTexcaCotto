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
    
    private int idUsuario, status;
    //Para status: 1 - Vigente / 0 - No vigente
    private String nombre, password, fechaAlta;

    public Usuario(int idUsuario, int status, String nombre, String password, String fechaAlta) {
        this.idUsuario = idUsuario;
        this.status = status;
        this.nombre = nombre;
        this.password = password;
        this.fechaAlta = fechaAlta;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", status=" + status + ", nombre=" + nombre + ", password=" + password + ", fechaAlta=" + fechaAlta + '}';
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    public int getStatus() {
        return status;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPassword() {
        return password;
    }
    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}

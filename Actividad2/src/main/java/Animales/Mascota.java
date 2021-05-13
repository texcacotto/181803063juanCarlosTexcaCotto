package Animales;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cotto
 */
public abstract class Mascota extends Animal {
    
    private String foto, comida, tamanio;

    public Mascota(String foto, String comida, String tamanio, String localizacion) {
        super(localizacion);
        this.foto = foto;
        this.comida = comida;
        this.tamanio = tamanio;
    }
    public Mascota() {
    }

    @Override
    public String toString() {
        return "Mascota{" + "foto=" + foto + ", comida=" + comida + ", tamanio=" + tamanio + '}' + super.toString();
    }

    public String getFoto() {
        return foto;
    }
    public String getComida() {
        return comida;
    }
    public String getTamanio() {
        return tamanio;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    public void setComida(String comida) {
        this.comida = comida;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    public static String hacerruido() {
        return "Haciendo ruido...";
    }
}

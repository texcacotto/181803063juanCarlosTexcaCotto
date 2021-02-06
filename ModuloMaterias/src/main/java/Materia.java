/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Materia {
     //Atributos
    public String nombreMateria, carrera, codigoMateria, cuatrimestre;
    public int creditos;
    //Métodos
    //Constructor completo
    public Materia(String nombreMateria, String carrera, int creditos, String codigoMateria, String cuatrimestre) {
        this.nombreMateria = nombreMateria;
        this.carrera = carrera;
        this.creditos = creditos;
        this.codigoMateria = codigoMateria;
        this.cuatrimestre = cuatrimestre;
    }
    //Constructor vacío
    public Materia() {
        this.nombreMateria = "";
        this.carrera = "";
        this.creditos = 0;
        this.codigoMateria = "";
        this.cuatrimestre = "";
    }
    //Método toString
    @Override
    public String toString() {
        return "\nMateria: " + nombreMateria +
                "\nCarrera: " + carrera +
                "\nCréditos: " + creditos +
                "\nCódigo: " + codigoMateria +
                "\nCuatrimestre: " +  cuatrimestre;
    }
}

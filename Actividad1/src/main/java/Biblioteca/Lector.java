/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author cotto
 */
public class Lector {
    
    private int prestamos;

    public Lector(int prestamos) {
        this.prestamos = prestamos;
    }
    public Lector() {
    }

    @Override
    public String toString() {
        return "Lector{" + "prestamos=" + prestamos + '}';
    }

    public int getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(int prestamos) {
        this.prestamos = prestamos;
    }
    
    public static String maximoPrestamos(int prestamos) {
        if (prestamos <= 3){
            Calendar fecha = Calendar.getInstance();
            fecha.add(Calendar.MONTH, +1);
            DateFormat formato = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
            return "Solicitud aceptada, debes devolverlas el " + formato.format(fecha.getTime()) + ".";
        }
        else {
            return "Solicitud denegada, solo puedes llevarte 3 copias.";
        }
    }
}

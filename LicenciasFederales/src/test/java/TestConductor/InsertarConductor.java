package TestConductor;

import Conductor.Conductor;
import DaoConductor.DaoConductor;
import java.sql.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cotto
 */
public class InsertarConductor {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Examen medico:");
        int examenMedico = scanner.nextInt();
        System.out.println("Documentos requeridos:");
        int docRequeridos = scanner.nextInt();
        Conductor nuevoConductor = new Conductor(examenMedico, docRequeridos, nombre);
        DaoConductor.insertarConductor(nuevoConductor);
    }
}

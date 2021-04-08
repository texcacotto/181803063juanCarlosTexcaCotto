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
public class ActualizarConductor {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID:");
        int idConductor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Examen medico:");
        int examenMedico = scanner.nextInt();
        System.out.println("Documentos requeridos:");
        int docRequeridos = scanner.nextInt();
        Conductor porActualizar = new Conductor(idConductor, examenMedico, docRequeridos, nombre);
        DaoConductor.actualizarConductor(porActualizar);
    }
}

package TestLicencia;

import Licencia.Licencia;
import DaoLicencia.DaoLicencia;
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
public class ActualizarTipoVehiculo {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID de la licencia:");
        int idLicencia = scanner.nextInt();
        System.out.println("ID del conductor:");
        int idConductor = scanner.nextInt();
        System.out.println("ID del tipo de vehículo:");
        int idTipoVehiculo = scanner.nextInt();
        Licencia porActualizar = new Licencia(idLicencia, idConductor, idTipoVehiculo);
        DaoLicencia.actualizarLicencia(porActualizar);
    }
}

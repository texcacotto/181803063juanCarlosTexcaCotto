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
public class EliminarLicencia {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID:");
        int idLicencia = scanner.nextInt();
        Licencia porEliminar = new Licencia(idLicencia);
        DaoLicencia.eliminarLicencia(porEliminar);
    }
}

package TestTipoVehiculo;

import TipoVehiculo.TipoVehiculo;
import DaoTipoVehiculo.DaoTipoVehiculo;
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
        System.out.println("ID:");
        int idTipoVehiculo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Categoria:");
        String categoria = scanner.nextLine();
        System.out.println("Medio en el que se desplaza:");
        String medioDesplaza = scanner.nextLine();
        System.out.println("Descripcion:");
        String descripcion = scanner.nextLine();
        System.out.println("Excepciones:");
        String excepciones = scanner.nextLine();
        TipoVehiculo porActualizar = new TipoVehiculo(idTipoVehiculo, categoria, medioDesplaza, descripcion, excepciones);
        DaoTipoVehiculo.actualizarTipoVehiculo(porActualizar);
    }
}

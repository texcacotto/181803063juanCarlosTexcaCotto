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
public class InsertarTipoVehiculo {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Categoría:");
        String categoria = scanner.nextLine();
        System.out.println("Medio de desplazamiento:");
        String medioDesplaza = scanner.nextLine();
        System.out.println("Descripción:");
        String descripcion = scanner.nextLine();
        System.out.println("Excepciones:");
        String excepciones = scanner.nextLine();
        TipoVehiculo nuevoTipoVehiculo = new TipoVehiculo(categoria, medioDesplaza, descripcion, excepciones);
        DaoTipoVehiculo.insertarTipoVehiculo(nuevoTipoVehiculo);
    }
}

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
public class Eliminar {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID:");
        int idTipoVehiculo = scanner.nextInt();
        TipoVehiculo porEliminar = new TipoVehiculo(idTipoVehiculo);
        DaoTipoVehiculo.eliminarTipoVehiculo(porEliminar);
    }
}

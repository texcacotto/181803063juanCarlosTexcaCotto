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
public class Consultar {
    public static void main(String[] args) throws SQLException {
        List<TipoVehiculo> tiposVehiculos = new ArrayList<>();
        tiposVehiculos = DaoTipoVehiculo.listaTiposVehiculos();
        for (TipoVehiculo tipoVehiculo : tiposVehiculos) {
            System.out.println(tipoVehiculo);
        }
    }
}

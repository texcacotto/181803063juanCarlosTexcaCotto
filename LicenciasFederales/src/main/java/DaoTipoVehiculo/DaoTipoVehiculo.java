/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoTipoVehiculo;

import TipoVehiculo.TipoVehiculo;
import Conexion.Conexion;
import java.sql.*;
import java.util.*;

/**
 *
 * @author cotto
 */
public class DaoTipoVehiculo {
    
    private static String sql;
    
    public static List<TipoVehiculo> listaTiposVehiculos() throws SQLException {
        List<TipoVehiculo> tiposVehiculos = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        sql = "SELECT * FROM tipo_vehiculo";
        ResultSet resultado = declaracion.executeQuery(sql);
        while (resultado.next()) {
            TipoVehiculo tipoVehiculo = new TipoVehiculo(resultado.getInt("idTipoVehiculo"), resultado.getString("categoria"), resultado.getString("medioDesplaza"), resultado.getString("descripcion"), resultado.getString("excepciones"));
            tiposVehiculos.add(tipoVehiculo);
        }
        Conexion.close(conexion, declaracion, resultado);
        return tiposVehiculos;
    }
    
    public static void insertarTipoVehiculo(TipoVehiculo nuevoTipoVehiculo) throws SQLException {
        Connection conexion = Conexion.getConnection();
        sql = "INSERT INTO tipo_vehiculo (categoria, medioDesplaza, descripcion, excepciones) VALUES (?, ?, ?, ?)";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setString(1, nuevoTipoVehiculo.getCategoria());
        declaracion.setString(2, nuevoTipoVehiculo.getMedioDesplaza());
        declaracion.setString(3, nuevoTipoVehiculo.getDescripcion());
        declaracion.setString(4, nuevoTipoVehiculo.getExcepciones());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    
    public static void actualizarTipoVehiculo(TipoVehiculo porActualizar) throws SQLException {
        Connection conexion = Conexion.getConnection();
        sql = "UPDATE tipo_vehiculo SET categoria = ?, medioDesplaza = ?, descripcion = ?, excepciones = ? WHERE idTipoVehiculo = ?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setString(1, porActualizar.getCategoria());
        declaracion.setString(2, porActualizar.getMedioDesplaza());
        declaracion.setString(3, porActualizar.getDescripcion());
        declaracion.setString(4, porActualizar.getExcepciones());
        declaracion.setInt(5, porActualizar.getIdTipoVehiculo());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    
    public static void eliminarTipoVehiculo(TipoVehiculo porEliminar) throws SQLException {
        Connection conexion = Conexion.getConnection();
        sql = "DELETE FROM tipo_vehiculo WHERE idTipoVehiculo = ?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setInt(1, porEliminar.getIdTipoVehiculo());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
}

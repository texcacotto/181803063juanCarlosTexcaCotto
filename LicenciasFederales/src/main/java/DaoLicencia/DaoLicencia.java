/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoLicencia;

import Licencia.Licencia;
import Conexion.Conexion;
import java.sql.*;
import java.util.*;

/**
 *
 * @author cotto
 */
public class DaoLicencia {
    
    private static String sql;
    
    public static List<Licencia> listaLicencias() throws SQLException {
        List<Licencia> licencias = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        sql = "SELECT * FROM licencia";
        ResultSet resultado = declaracion.executeQuery(sql);
        while (resultado.next()) {
            Licencia licencia = new Licencia(resultado.getInt("idLicencia"), resultado.getInt("idConductor"), resultado.getInt("idTipoVehiculo"), resultado.getInt("modalidad"), resultado.getInt("inicioVigencia"), resultado.getInt("finVigencia"));
            licencias.add(licencia);
        }
        Conexion.close(conexion, declaracion, resultado);
        return licencias;
    }
    
    public static void insertarLicencia(Licencia nuevaLicencia) throws SQLException {
        Connection conexion = Conexion.getConnection();
        sql = "INSERT INTO licencia (idConductor, idTipoVehiculo, inicioVigencia, finVigencia) VALUES (?, ?, ?, ?)";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setInt(1, nuevaLicencia.getIdConductor());
        declaracion.setInt(2, nuevaLicencia.getIdTipoVehiculo());
        Calendar fecha = Calendar.getInstance();
        int anioActual = fecha.get(Calendar.YEAR);
        int anioVencimiento = (anioActual + 5);
        declaracion.setInt(3, anioActual);
        declaracion.setInt(4, anioVencimiento);
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    
    public static void actualizarLicencia(Licencia porActualizar) throws SQLException {
        Connection conexion = Conexion.getConnection();
        sql = "UPDATE licencia SET idConductor = ?, idTipoVehiculo = ?, modalidad = ?, inicioVigencia = ?, finVigencia = ? WHERE idLicencia = ?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setInt(1, porActualizar.getIdConductor());
        declaracion.setInt(2, porActualizar.getIdTipoVehiculo());
        declaracion.setInt(3, 2);
        Calendar fecha = Calendar.getInstance();
        int anioActual = fecha.get(Calendar.YEAR);
        int anioVencimiento = (anioActual + 5);
        declaracion.setInt(4, anioActual);
        declaracion.setInt(5, anioVencimiento);
        declaracion.setInt(6, porActualizar.getIdLicencia());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    
    public static void eliminarLicencia(Licencia porEliminar) throws SQLException {
        Connection conexion = Conexion.getConnection();
        sql = "DELETE FROM licencia WHERE idLicencia = ?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setInt(1, porEliminar.getIdLicencia());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
}

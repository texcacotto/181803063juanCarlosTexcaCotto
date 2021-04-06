/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoConductor;

import Conductor.Conductor;
import Conexion.Conexion;
import java.sql.*;
import java.util.*;

/**
 *
 * @author cotto
 */
public class DaoConductor {
    
    private static String sql;
    
    public static List<Conductor> listaConductores() throws SQLException {
        List<Conductor> conductores = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        sql = "SELECT * FROM conductor";
        ResultSet resultado = declaracion.executeQuery(sql);
        while (resultado.next()) {
            Conductor conductor = new Conductor(resultado.getInt("idConductor"), resultado.getInt("examenMedico"), resultado.getInt("docRequeridos"), resultado.getInt("estatus"), resultado.getString("nombre"));
            conductores.add(conductor);
        }
        Conexion.close(conexion, declaracion, resultado);
        return conductores;
    }
    
    public static void insertarConductor(Conductor nuevoConductor) throws SQLException {
        Connection conexion = Conexion.getConnection();
        sql = "INSERT INTO conductor (nombre, examenMedico, docRequeridos, estatus) VALUES (?, ?, ?, ?)";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setString(1, nuevoConductor.getNombre());
        declaracion.setInt(2, nuevoConductor.getExamenMedico());
        declaracion.setInt(3, nuevoConductor.getDocRequeridos());
        if (nuevoConductor.getExamenMedico() == 1 & nuevoConductor.getDocRequeridos() == 1) {
            declaracion.setInt(4, 1);
        }
        else {
            declaracion.setInt(4, 2);
        }
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    
    public static void actualizarConductor(Conductor porActualizar) throws SQLException {
        Connection conexion = Conexion.getConnection();
        sql = "UPDATE conductor SET nombre = ?, examenMedico = ?, docRequeridos = ?, estatus = ? WHERE idConductor = ?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setString(1, porActualizar.getNombre());
        declaracion.setInt(2, porActualizar.getExamenMedico());
        declaracion.setInt(3, porActualizar.getDocRequeridos());
        if (porActualizar.getExamenMedico() == 1 & porActualizar.getDocRequeridos() == 1) {
            declaracion.setInt(4, 1);
        }
        else {
            declaracion.setInt(4, 2);
        }
        declaracion.setInt(5, porActualizar.getIdConductor());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    
    public static void eliminarConductor(Conductor porEliminar) throws SQLException {
        Connection conexion = Conexion.getConnection();
        sql = "DELETE FROM conductor WHERE idConductor = ?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setInt(1, porEliminar.getIdConductor());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
}

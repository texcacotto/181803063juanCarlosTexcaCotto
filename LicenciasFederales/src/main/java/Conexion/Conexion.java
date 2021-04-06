/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;

/**
 *
 * @author cotto
 */
public class Conexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/licencias_federales?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "admin", PASSWORD = "12345";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
    
    public static void close(Connection conexion) throws SQLException {
        conexion.close();
    }
    public static void close(Connection conexion, Statement declaracion) throws SQLException {
        conexion.close();
        declaracion.close();
    } 
    public static void close(Connection conexion, Statement declaracion, ResultSet resultado) throws SQLException {
        conexion.close();
        declaracion.close();
        resultado.close();
    }
}

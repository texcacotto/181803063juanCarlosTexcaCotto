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
    //static es una palabra reservada, que indica que el atributo es de la clase y no del objeto
    //final es un modificador que indica que el atributo es una constante, por lo que no se le podra cambiar el valor
    private static final String URL = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "admin", PASSWORD = "12345";
    //throws SQLException es el try y el catch implementado en un metodo
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }   
    //Polimorfismo
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

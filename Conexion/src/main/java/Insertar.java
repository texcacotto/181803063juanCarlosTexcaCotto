
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cotto
 */
public class Insertar {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try {
            //Crear la conexion con la base de datos
            Connection conexion = DriverManager.getConnection(url, "admin", "12345");
            String sql = "INSERT INTO usuario (nombre, password, status) VALUES (?, ?, ?)";
            PreparedStatement declaracion = conexion.prepareStatement(sql);
            /*
            declaracion.setString(1, "Ana");
            declaracion.setString(2, "1234567890");
            declaracion.setInt(3, 1);
            declaracion.executeUpdate();
            */
            
            //Cerrar toda conexion con la base de datos
            declaracion.close();
            conexion.close();
        }
        catch(SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}

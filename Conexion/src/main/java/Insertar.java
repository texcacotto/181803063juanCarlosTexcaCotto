
import java.sql.*;
import java.util.Scanner;

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
            String sql = "INSERT INTO usuario (nombre, password) VALUES (?, ?)";
            PreparedStatement declaracion = conexion.prepareStatement(sql);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Contraseña:");
            String password = scanner.nextLine();
            declaracion.setString(1, nombre);
            declaracion.setString(2, password);
            declaracion.executeUpdate();
            //Cerrar toda conexion con la base de datos
            declaracion.close();
            conexion.close();
        }
        catch(SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}

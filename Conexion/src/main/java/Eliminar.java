
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
public class Eliminar {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try {
            //Crear la conexion con la base de datos
            Connection conexion = DriverManager.getConnection(url, "admin", "12345");
            String sql = "DELETE FROM usuario WHERE idUsuario = ?";
            PreparedStatement declaracion = conexion.prepareStatement(sql);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el ID del usuario:");
            int id = scanner.nextInt();
            declaracion.setInt(1, id);
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

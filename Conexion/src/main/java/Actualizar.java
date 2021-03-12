
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
public class Actualizar {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try {
            //Crear la conexion con la base de datos
            Connection conexion = DriverManager.getConnection(url, "admin", "12345");
            String sql = "UPDATE usuario SET nombre = ?, password = ?, status = ? WHERE idUsuario = ?";
            PreparedStatement declaracion = conexion.prepareStatement(sql);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el ID del usuario:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nuevo nombre:");
            String nuevoNombre = scanner.nextLine();
            System.out.println("Nueva contraseña:");
            String nuevoPassword = scanner.nextLine();
            System.out.println("Nuevo estatus: 1 - Vigente / 0 - No vigente");
            int nuevoStatus = scanner.nextInt();
            declaracion.setString(1, nuevoNombre);
            declaracion.setString(2, nuevoPassword);
            declaracion.setInt(3, nuevoStatus);
            declaracion.setInt(4, id);
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

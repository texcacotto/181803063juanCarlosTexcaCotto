
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Conexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try {
            //Crear la conexion con la base de datos
            Connection conexion = DriverManager.getConnection(url, "admin", "12345");
            //Crear la declaracion de como se va a trabajar con la base de datos
            Statement declaracion = conexion.createStatement();
            String sql = "SELECT * FROM puesto";
            //Variable que recibira el resultado de ejecutar la sentencia SQL
            ResultSet resultado = declaracion.executeQuery(sql);
            //Imprimir valores
            while(resultado.next()) {
                System.out.println(resultado.getInt("idPuesto"));
                System.out.println(resultado.getInt("idUsuario"));
                System.out.println(resultado.getString("puesto"));
                System.out.println(resultado.getInt("sueldoSemana"));
                System.out.println(resultado.getInt("horasDia"));
                System.out.println();
            }
            //Cerrar toda conexion con la base de datos
            resultado.close();
            declaracion.close();
            conexion.close();
        }
        catch(SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}

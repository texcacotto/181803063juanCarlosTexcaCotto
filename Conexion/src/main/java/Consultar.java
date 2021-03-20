
//import Conexion.Conexion;
import DaoUsuario.DaoUsuario;
import Usuario.Usuario;
import java.sql.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charl
 */
public class Consultar {
    public static void main(String[] args) throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = DaoUsuario.listaUsuarios();
        for(Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
        /*
        //Crear la conexion con la base de datos
        Connection conexion = Conexion.getConnection();
        //Crear la declaracion de como se va a trabajar con la base de datos
        Statement declaracion = conexion.createStatement();
        String sql = "SELECT * FROM usuario";
        //Variable que recibira el resultado de ejecutar la sentencia SQL
        ResultSet resultado = declaracion.executeQuery(sql);
        //Imprimir valores
        while(resultado.next()) {
            System.out.println(resultado.getInt("idUsuario"));
            System.out.println(resultado.getString("nombre"));
            System.out.println(resultado.getString("password"));
            System.out.println(resultado.getInt("status"));
            System.out.println(resultado.getString("fechaAlta"));
            System.out.println();
        }
        //Cerrar toda conexion con la base de datos
        Conexion.close(conexion, declaracion, resultado);
        */
    }
}

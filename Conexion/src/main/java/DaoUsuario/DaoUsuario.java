/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoUsuario;

import Conexion.Conexion;
import Usuario.Usuario;
import java.sql.*;
import java.util.*;

/**
 *
 * @author cotto
 */
public class DaoUsuario {
    private static String sql;
    public static List<Usuario> listaUsuarios() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        sql = "SELECT * FROM usuario";
        ResultSet resultado = declaracion.executeQuery(sql);
        while(resultado.next()) {
            Usuario nuevoUsuario = new Usuario(resultado.getInt("idUsuario"), resultado.getInt("status"), resultado.getString("nombre"), resultado.getString("password"), resultado.getString("fechaAlta"));
            usuarios.add(nuevoUsuario);
        }
        Conexion.close(conexion, declaracion, resultado);
        return usuarios;
    }
    public static void insertarUsuario(Usuario nuevoUsuario) throws SQLException {
        Connection conexion = Conexion.getConnection();
        sql = "INSERT INTO usuario (nombre, password) VALUES (?, ?)";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setString(1, nuevoUsuario.getNombre());
        declaracion.setString(2, nuevoUsuario.getPassword());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    public static void eliminarUsuario(Usuario porEliminar) throws SQLException {
        Connection conexion = Conexion.getConnection();
        sql = "DELETE FROM usuario WHERE idUsuario = ?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setInt(1, porEliminar.getIdUsuario());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
}

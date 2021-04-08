package TestConductor;

import Conductor.Conductor;
import DaoConductor.DaoConductor;
import java.sql.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cotto
 */
public class EliminarConductor {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID:");
        int idConductor = scanner.nextInt();
        Conductor porEliminar = new Conductor(idConductor);
        DaoConductor.eliminarConductor(porEliminar);
    }
}

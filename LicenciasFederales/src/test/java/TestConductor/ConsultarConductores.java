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
public class ConsultarConductores {
    public static void main(String[] args) throws SQLException {
        List<Conductor> conductores = new ArrayList<>();
        conductores = DaoConductor.listaConductores();
        for (Conductor conductor : conductores) {
            System.out.println(conductor);
        }
    }
}

package TestLicencia;

import Licencia.Licencia;
import DaoLicencia.DaoLicencia;
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
public class ConsultarLicencias {
    public static void main(String[] args) throws SQLException {
        List<Licencia> licencias = new ArrayList<>();
        licencias = DaoLicencia.listaLicencias();
        for (Licencia licencia : licencias) {
            System.out.println(licencia);
        }
    }
}
